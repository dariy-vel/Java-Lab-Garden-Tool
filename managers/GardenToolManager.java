package ua.lviv.iot.lab_3.managers;

import ua.lviv.iot.lab_3.models.GardenTool;
import ua.lviv.iot.lab_3.models.Purpose;

import java.util.List;

public interface GardenToolManager {
    public List<GardenTool> findToolsByPurpose(Purpose purpose);

    public List<GardenTool> sortToolsByPrice(boolean reverse);

    public List<GardenTool> sortToolsByWeight(boolean reverse);
}
