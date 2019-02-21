package ua.lviv.iot.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverruncatorTests {
    private static final double TEST_VALUE = 2.7;
    private Averruncator averruncator;

    @BeforeEach
    void setUp() {
        this.averruncator = new Averruncator(
                TEST_VALUE,
                TEST_VALUE,
                "Ukraine",
                "ZAZ",
                "metal",
                (int) TEST_VALUE,
                Purpose.GROUND,
                Hand.LEFT,
                TEST_VALUE
        );
    }

    @Test
    void testGetters() {
        assertEquals(TEST_VALUE, averruncator.getCutOffDiameter());
        assertEquals(Hand.LEFT, averruncator.getHand());
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
                        ", hand" +
                        ", cutOffDiameter",
                averruncator.getHeaders());
    }

    @Test
    void testToCSV() {
        assertEquals(averruncator.getWeight() +
                        ", " + averruncator.getPrice() +
                        ", " + averruncator.getCountryOfOrigin() +
                        ", " + averruncator.getManufacturer() +
                        ", " + averruncator.getMaterial() +
                        ", " + averruncator.getYearsOfWarranty() +
                        ", " + averruncator.getPurpose() +
                        ", " + averruncator.getHand() +
                        ", " + averruncator.getCutOffDiameter(),
                averruncator.toCSV());
    }
}
