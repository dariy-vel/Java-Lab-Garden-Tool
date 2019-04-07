package ua.lviv.iot.gardenTool;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import ua.lviv.iot.gardenTool.models.Axe;
import ua.lviv.iot.gardenTool.models.Purpose;
import ua.lviv.iot.gardenTool.repositories.AxeRepository;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
//@TestPropertySource(
//        locations = "classpath:application-test.properties")
public class GardenToolApplicationTests {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    AxeRepository axeRepository;

    private Axe axe;

    @Before
    public void setUp() {
        this.axe = new Axe(
                4,
                4,
                "Ukraine",
                "ZAZ",
                "metal",
                4,
                Purpose.GROUND,
                4
        );
        axeRepository.save(this.axe);
    }

    @Test
    public void writeToDBTest() {
        LinkedList<Axe> foundAxeList = axeRepository.findByPurpose(Purpose.GROUND);
        Axe foundAxe = foundAxeList.get(0);
        assertEquals(this.axe.getPurpose(), foundAxe.getPurpose());
    }

    @Test
    public void returningAxeTest() throws Exception {
        this.mockMvc.perform(get("/axes/{id}", "1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.purpose").value(Purpose.GROUND.toString()));
    }

    @Test
    public void creatingAxeTest() throws Exception{
        this.mockMvc.perform(post("/axes")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJson(this.axe)))
                .andExpect(status().isOk());
    }

    @Test
    public void updatingAxeTest() throws Exception{
        Integer id = 2;
        Axe axe = new Axe(
                2,
                2,
                "China",
                "Baolong",
                "plastic",
                0,
                Purpose.GROUND,
                2
        );
        this.mockMvc.perform(put("/axes/{id}", id.toString())
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJson(axe)))
                .andExpect(status().isOk());

        Axe foundAxe = axeRepository.findById(id).get();

        assertEquals(axe.getCountryOfOrigin(), foundAxe.getCountryOfOrigin());
    }

    @Test
    public void deletingAxeTest() throws Exception{
        Integer id = 1;
        this.mockMvc.perform(delete("/axes/{id}", id.toString()))
            .andExpect(status().isOk());
        assertFalse(axeRepository.findById(id).isPresent());
    }

    public static String asJson(final Object obj) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String jsonContent = mapper.writeValueAsString(obj);
            return jsonContent;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

