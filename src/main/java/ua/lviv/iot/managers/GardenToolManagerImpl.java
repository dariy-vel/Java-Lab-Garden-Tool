package ua.lviv.iot.managers;

import ua.lviv.iot.models.GardenTool;
import ua.lviv.iot.models.Purpose;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public class GardenToolManagerImpl implements GardenToolManager, Serializable {
    private List<GardenTool> gardenTools;

    public GardenToolManagerImpl(List<GardenTool> gardenTools) {
        this.gardenTools = gardenTools;
    }

    @Override
    public List<GardenTool> findToolsByPurpose(Purpose purpose) {
        List<GardenTool> foundList;
        foundList = this.gardenTools.stream().filter(gt -> purpose.equals(gt.getPurpose()))
                .collect(Collectors.toList());
        return foundList;
    }

    @Override
    public List<GardenTool> sortToolsByPrice(boolean reverse) {
        int reverser = (reverse) ? -1 : 1;
        // This coefficient is used to sort list in both way depending on boolean "reverse"
        gardenTools.sort((GardenTool gt1, GardenTool gt2) -> (reverser * Double.compare(gt1.getPrice(), gt2.getPrice())));
        return gardenTools;
    }

    @Override
    public List<GardenTool> sortToolsByWeight(boolean reverse) {
        int reverser = (reverse) ? -1 : 1;
        // This coefficient is used to sort list in both way depending on boolean "reverse"
        gardenTools.sort((GardenTool gt1, GardenTool gt2) -> (reverser * Double.compare(gt1.getWeight(), gt2.getWeight())));
        return gardenTools;
    }
}
