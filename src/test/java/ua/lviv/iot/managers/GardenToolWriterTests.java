package ua.lviv.iot.managers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.models.Averruncator;
import ua.lviv.iot.models.GardenTool;
import ua.lviv.iot.models.Saw;
import ua.lviv.iot.models.Purpose;
import ua.lviv.iot.models.Hand;
import ua.lviv.iot.models.Axe;
import ua.lviv.iot.models.Shovel;
import ua.lviv.iot.models.DriveType;

import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GardenToolWriterTests {
    private GardenTool object1;
    private GardenTool object2;
    private GardenTool object3;
    private GardenTool object4;
    private List<GardenTool> input;
    private GardenToolManager manager;

    @BeforeEach
    void setup() {
        this.object1 = new Saw(
                1,
                1,
                "Ukraine",
                "ZAZ",
                "metal",
                1,
                Purpose.WOOD_N_BRANCHES,
                1,
                DriveType.PETROL
        );
        this.object2 = new Shovel(
                2,
                2,
                "Ukraine",
                "ZAZ",
                "metal",
                2,
                Purpose.GROUND,
                2
        );
        this.object3 = new Averruncator(
                3,
                3,
                "Ukraine",
                "ZAZ",
                "metal",
                3,
                Purpose.WOOD_N_BRANCHES,
                Hand.BOTH,
                3
        );
        this.object4 = new Axe(
                4,
                4,
                "Ukraine",
                "ZAZ",
                "metal",
                4,
                Purpose.GROUND,
                4
        );

        input = new ArrayList<>();
        input.add(object3);
        input.add(object2);
        input.add(object1);
        input.add(object4);
    }

    @Test
    void testOutputToFile() throws IOException {
        final String fileName = "output";
        GardenToolWriter writer = new GardenToolWriter(fileName);
        writer.writeToFile(this.input);

        File testFile = new File("./target/" + fileName + ".csv");
        assertTrue(testFile.exists() && testFile.isFile(),
                "File wasn't created");

        try (FileInputStream fis = new FileInputStream(testFile);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader bufReader = new BufferedReader(isr)) {

            assertEquals("sep = ,", bufReader.readLine());
            for (GardenTool gardenTool : input) {
                assertEquals(gardenTool.getHeaders(), bufReader.readLine());
                assertEquals(gardenTool.toCSV(), bufReader.readLine());
            }
            assertEquals(null, bufReader.readLine());

        }
    }
}
