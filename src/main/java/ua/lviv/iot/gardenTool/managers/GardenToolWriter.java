package ua.lviv.iot.gardenTool.managers;

import ua.lviv.iot.gardenTool.models.GardenTool;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;

import java.util.List;

public class GardenToolWriter {
    private File outputFile;

    public GardenToolWriter(final String fileName) {
        outputFile = new File("./target/" + fileName + ".csv");
    }

    public void writeToFile(final List<GardenTool> gardenTools) {
        try (FileOutputStream fos = new FileOutputStream(this.outputFile);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bufWriter = new BufferedWriter(osw)) {

            bufWriter.write("sep = ,");
            bufWriter.newLine();

            for (GardenTool gardenTool : gardenTools) {
                bufWriter.write(gardenTool.getHeaders());
                bufWriter.newLine();
                bufWriter.write(gardenTool.toCSV());
                bufWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
