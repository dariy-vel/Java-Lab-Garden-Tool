package ua.lviv.iot.managers;

import ua.lviv.iot.models.GardenTool;

import java.io.*;
import java.util.List;

public class GardenToolWriter {
    private File outputFile;

    public GardenToolWriter(String fileName) {
        outputFile = new File("./target/" + fileName + ".csv");
    }

    public void writeToFile(List<GardenTool> gardenTools) throws IOException {
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
        } finally {

        }
    }
}
