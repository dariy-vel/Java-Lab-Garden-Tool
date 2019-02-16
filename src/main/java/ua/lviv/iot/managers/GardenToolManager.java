package ua.lviv.iot.managers;

import ua.lviv.iot.models.GardenTool;
import ua.lviv.iot.models.Purpose;

import java.util.List;

public interface GardenToolManager {
    public List<GardenTool> findToolsByPurpose(Purpose purpose);

    public List<GardenTool> sortToolsByPrice(boolean reverse);

    public List<GardenTool> sortToolsByWeight(boolean reverse);
}
