package ua.lviv.iot;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.managers.GardenToolManager;
import ua.lviv.iot.managers.GardenToolManagerImpl;
import ua.lviv.iot.models.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ManagerTests {
    private GardenTool object1 = new Saw(
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
    private GardenTool object2 = new Shovel(
            2,
            2,
            "Ukraine",
            "ZAZ",
            "metal",
            2,
            Purpose.GROUND,
            2
    );
    private GardenTool object3 = new Averruncator(
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
    private GardenTool object4 = new Axe(
            4,
            4,
            "Ukraine",
            "ZAZ",
            "metal",
            4,
            Purpose.GROUND,
            4
    );
    private List<GardenTool> input;
    private GardenToolManager manager;

    {
        input = new ArrayList<>();
        input.add(object3);
        input.add(object2);
        input.add(object1);
        input.add(object4);
        manager = new GardenToolManagerImpl(input);
    }

    @Test
    void testSortByPrice() {
        List<GardenTool> actual = this.manager.sortToolsByPrice(false);

        for (int i = 0; i < actual.size(); i++) {
            if (i == 0) {
                continue;
            }
            assertTrue(actual.get(i - 1).getPrice() < actual.get(i).getPrice(), "Sorting by price doesn't work");
        }
    }

    @Test
    void testReversedSortByPrice() {
        List<GardenTool> actual = this.manager.sortToolsByPrice(true);

        for (int i = 0; i < actual.size(); i++) {
            if (i == 0) {
                continue;
            }
            assertTrue(actual.get(i - 1).getPrice() > actual.get(i).getPrice(), "Sorting by price doesn't work");
        }
    }

    @Test
    void testSortByWeight() {
        List<GardenTool> actual = this.manager.sortToolsByWeight(false);

        for (int i = 0; i < actual.size(); i++) {
            if (i == 0) {
                continue;
            }
            assertTrue(actual.get(i - 1).getWeight() < actual.get(i).getWeight(), "Sorting by weight doesn't work");
        }
    }

    @Test
    void testReversedSortByWeight() {
        List<GardenTool> actual = this.manager.sortToolsByWeight(true);

        for (int i = 0; i < actual.size(); i++) {
            if (i == 0) {
                continue;
            }
            assertTrue(actual.get(i - 1).getPrice() > actual.get(i).getPrice(), "Sorting by weight doesn't work");
        }
    }

    @Test
    void testSearchByPurpose() {
        List<GardenTool> actual = this.manager.findToolsByPurpose(Purpose.WOOD_N_BRANCHES);

        for (GardenTool gardenTool : actual) {
            assertEquals(Purpose.WOOD_N_BRANCHES, gardenTool.getPurpose(), "Searching by purpose doesn't work");
        }
    }
}
