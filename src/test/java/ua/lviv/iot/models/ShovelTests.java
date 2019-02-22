package ua.lviv.iot.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShovelTests {
    private static final double TEST_VALUE = 2.3;
    private Shovel shovel;

    @BeforeEach
    void setUp() {
        this.shovel = new Shovel(
                TEST_VALUE,
                TEST_VALUE,
                "Ukraine",
                "ZAZ",
                "metal",
                (int) TEST_VALUE,
                Purpose.GROUND,
                TEST_VALUE
        );
    }

    @Test
    void testGetters() {
        assertEquals(TEST_VALUE, shovel.getHandleLength());
    }

    @Test
    void testGetHeaders() {
        assertEquals("weight"
                        + ", price"
                        + ", countryOfOrigin"
                        + ", manufacturer"
                        + ", material"
                        + ", yearsOfWarranty"
                        + ", purpose"
                        + ", handleLength",
                shovel.getHeaders());
    }

    @Test
    void testToCSV() {
        assertEquals(shovel.getWeight()
                        + ", " + shovel.getPrice()
                        + ", " + shovel.getCountryOfOrigin()
                        + ", " + shovel.getManufacturer()
                        + ", " + shovel.getMaterial()
                        + ", " + shovel.getYearsOfWarranty()
                        + ", " + shovel.getPurpose()
                        + ", " + shovel.getHandleLength(),
                shovel.toCSV());
    }
}
