package ua.lviv.iot;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.models.*;

import java.lang.reflect.GenericArrayType;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GardenToolTests {
    public static final int TEST_VALUE = 1;

    @Test
    void testAxe() {
        Axe axe = new Axe();
        axe.setBladeWidth(TEST_VALUE);
        assertEquals(TEST_VALUE, axe.getBladeWidth());
    }

    @Test
    void testAverruncator() {
        Averruncator averruncator = new Averruncator();

        averruncator.setCutOffDiameter(TEST_VALUE);
        assertEquals(TEST_VALUE, averruncator.getCutOffDiameter());

        averruncator.setHand(Hand.LEFT);
        assertEquals(Hand.LEFT, averruncator.getHand());
    }

    @Test
    void testSaw() {
        Saw saw = new Saw();

        saw.setBladeLength(TEST_VALUE);
        assertEquals(TEST_VALUE, saw.getBladeLength());

        saw.setDriveType(DriveType.PETROL);
        assertEquals(DriveType.PETROL, saw.getDriveType());
    }

    @Test
    void testShovel() {
        Shovel shovel = new Shovel();

        shovel.setHandleLength(TEST_VALUE);
        assertEquals(TEST_VALUE, shovel.getHandleLength());
    }

    @Test
    void testGardenToolGettersAndSetters() {
        GardenTool gardenTool = new Axe();
        gardenTool.setCountryOfOrigin("Ukraine");
        gardenTool.setManufacturer("LAZ");
        gardenTool.setMaterial("Steel");
        gardenTool.setYearsOfWarranty(TEST_VALUE);
        gardenTool.setPurpose(Purpose.WOOD_N_BRANCHES);
        assertAll("Getters/setters don't work properly",
                () -> assertEquals("Ukraine", gardenTool.getCountryOfOrigin()),
                () -> assertEquals("LAZ", gardenTool.getManufacturer()),
                () -> assertEquals("Steel", gardenTool.getMaterial()),
                () -> assertEquals(TEST_VALUE, gardenTool.getYearsOfWarranty()),
                () -> assertEquals(Purpose.WOOD_N_BRANCHES, gardenTool.getPurpose())
        );
    }
}
