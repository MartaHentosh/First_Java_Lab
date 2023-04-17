package ua.lviv.iot.algo.part1.lab2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
public class FridgesWriter {
    public String writeToFile(List<Fridge> fridges) throws IOException {
        if (fridges == null || fridges.isEmpty()) {
            return null;
        }
        String FileName = "result.csv";
        try (FileWriter writer = new FileWriter(FileName)) {
            for (Fridge fridge : fridges) {
                writer.write(fridge.getHeaders());
                writer.write("\n");
                writer.write(fridge.toCSV());
                writer.write("\n");
            }
        }
        return FileName;
    }
}
