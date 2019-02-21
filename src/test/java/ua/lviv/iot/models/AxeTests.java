package ua.lviv.iot.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AxeTests {
    private static final double TEST_VALUE = 1;
    private Axe axe;

    @BeforeEach
    void setUp() {
        this.axe = new Axe(
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
    void testGetter() {
        assertEquals(TEST_VALUE, this.axe.getBladeWidth());
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
                        ", bladeWidth",
                axe.getHeaders());
    }
}
