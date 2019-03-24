package ua.lviv.iot.gardenTool.managers;

import ua.lviv.iot.gardenTool.models.GardenTool;
import ua.lviv.iot.gardenTool.models.Purpose;

import java.util.List;

public interface GardenToolManager {
    List<GardenTool> findToolsByPurpose(Purpose purpose);

    List<GardenTool> sortToolsByPrice(boolean reverse);

    List<GardenTool> sortToolsByWeight(boolean reverse);
}
