package ua.lviv.iot.gardenTool.managers;

import ua.lviv.iot.gardenTool.models.GardenTool;
import ua.lviv.iot.gardenTool.models.Purpose;

import java.util.List;
import java.util.stream.Collectors;

public class GardenToolManagerImpl implements GardenToolManager {
    private List<GardenTool> gardenTools;

    public GardenToolManagerImpl(final List<GardenTool> gardenTools) {
        this.gardenTools = gardenTools;
    }

    @Override
    public List<GardenTool> findToolsByPurpose(final Purpose purpose) {
        List<GardenTool> foundList;
        foundList = this.gardenTools.stream()
                .filter(gt -> purpose.equals(gt.getPurpose()))
                .collect(Collectors.toList());
        return foundList;
    }

    @Override
    public List<GardenTool> sortToolsByPrice(final boolean reverse) {
        int reverser;
        if (reverse) {
            reverser = -1;
        } else {
            reverser = 1;
        }
        // This coefficient is used to sort list in both way
        gardenTools.sort((GardenTool gt1, GardenTool gt2) ->
                reverser * Double.compare(gt1.getPrice(), gt2.getPrice()));
        return gardenTools;
    }

    @Override
    public List<GardenTool> sortToolsByWeight(final boolean reverse) {
        int reverser;
        if (reverse) {
            reverser = -1;
        } else {
            reverser = 1;
        }
        // This coefficient is used to sort list in both way
        gardenTools.sort((GardenTool gt1, GardenTool gt2) ->
                reverser * Double.compare(gt1.getWeight(), gt2.getWeight()));
        return gardenTools;
    }
}
