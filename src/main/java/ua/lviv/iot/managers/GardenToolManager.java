package ua.lviv.iot.managers;

import ua.lviv.iot.models.GardenTool;
import ua.lviv.iot.models.Purpose;

import java.util.List;

public interface GardenToolManager {
    List<GardenTool> findToolsByPurpose(Purpose purpose);

    List<GardenTool> sortToolsByPrice(boolean reverse);

    List<GardenTool> sortToolsByWeight(boolean reverse);
}
