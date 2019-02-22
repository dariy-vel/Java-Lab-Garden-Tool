package ua.lviv.iot.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GardenToolTests {
    private static final int TEST_VALUE = 1;

    @Test
    void testGardenToolGettersAndSetters() {
        GardenTool gardenTool = new Axe();
        gardenTool.setCountryOfOrigin("Ukraine");
        gardenTool.setManufacturer("LAZ");
        gardenTool.setMaterial("Steel");
        gardenTool.setYearsOfWarranty(TEST_VALUE);
        gardenTool.setPurpose(Purpose.WOOD_N_BRANCHES);
        gardenTool.setWeight(TEST_VALUE);
        gardenTool.setPrice(TEST_VALUE);
        assertAll("Getters/setters don't work properly",
                () -> assertEquals("Ukraine", gardenTool.getCountryOfOrigin()),
                () -> assertEquals("LAZ", gardenTool.getManufacturer()),
                () -> assertEquals("Steel", gardenTool.getMaterial()),
                () -> assertEquals(TEST_VALUE, gardenTool.getYearsOfWarranty()),
                () -> assertEquals(Purpose.WOOD_N_BRANCHES,
                        gardenTool.getPurpose()),
                () -> assertEquals(TEST_VALUE, gardenTool.getWeight()),
                () -> assertEquals(TEST_VALUE, gardenTool.getPrice())
        );
    }
}
