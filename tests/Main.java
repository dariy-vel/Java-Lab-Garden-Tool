package ua.lviv.iot.lab_3.tests;

import ua.lviv.iot.lab_3.managers.GardenToolManager;
import ua.lviv.iot.lab_3.managers.GardenToolManagerImpl;
import ua.lviv.iot.lab_3.models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GardenTool saw = new Saw();
        GardenTool shovel = new Shovel();
        GardenTool averruncator = new Averruncator();
        GardenTool axe = new Axe();

        saw.setPrice(3.45);
        shovel.setPrice(1.5);
        averruncator.setPrice(1);
        axe.setPrice(0.6);

        saw.setWeight(20.5);
        shovel.setWeight(3);
        averruncator.setWeight(78.1);
        axe.setWeight(51.8);

        saw.setPurpose(Purpose.GROUND);
        shovel.setPurpose(Purpose.WOOD_N_BRANCHES);
        averruncator.setPurpose(Purpose.WOOD_N_BRANCHES);
        axe.setPurpose(Purpose.SNOW);

        List<GardenTool> gardenTools = new ArrayList<>();
        gardenTools.add(saw);
        gardenTools.add(shovel);
        gardenTools.add(averruncator);
        gardenTools.add(axe);

        GardenToolManager manager = new GardenToolManagerImpl(gardenTools);
        List<GardenTool> forWood = manager.findToolsByPurpose(Purpose.WOOD_N_BRANCHES);
        forWood.forEach((GardenTool tool) -> {
            System.out.println(tool.getPurpose().toString());
        });
        System.out.println("-----------------------");

        List<GardenTool> sortedPyPrice = manager.sortToolsByPrice(false);
        sortedPyPrice.forEach((GardenTool tool) -> {
            System.out.println(tool.getPrice());
        });
        System.out.println("-----------------------");

        List<GardenTool> sortedByWeight = manager.sortToolsByWeight(false);
        sortedByWeight.forEach((GardenTool tool) -> {
            System.out.println(tool.getWeight());
        });

    }
}
