package ua.lviv.iot.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SawTests {
    private static final double TEST_VALUE = 3.5;
    private Saw saw;

    @BeforeEach
    void setUp() {
        this.saw = new Saw(
                TEST_VALUE,
                TEST_VALUE,
                "Ukraine",
                "ZAZ",
                "metal",
                (int) TEST_VALUE,
                Purpose.GROUND,
                TEST_VALUE,
                DriveType.PETROL
        );
    }

    @Test
    void testGetters() {
        assertEquals(TEST_VALUE, saw.getBladeLength());
        assertEquals(DriveType.PETROL, saw.getDriveType());
    }

    @Test
    void testGetHeaders() {
        assertEquals("weight" +
                        ", price" +
                        ", countryOfOrigin" +
                        ", manufacturer" +
                        ", material" +
                        ", yearsOfWarranty" +
                        ", purpose" +
                        ", bladeLength" +
                        ", driveType",
                saw.getHeaders());
    }

    @Test
    void testToCSV() {
        assertEquals(saw.getWeight() +
                        ", " + saw.getPrice() +
                        ", " + saw.getCountryOfOrigin() +
                        ", " + saw.getManufacturer() +
                        ", " + saw.getMaterial() +
                        ", " + saw.getYearsOfWarranty() +
                        ", " + saw.getPurpose() +
                        ", " + saw.getBladeLength() +
                        ", " + saw.getDriveType(),
                saw.toCSV());
    }
}
