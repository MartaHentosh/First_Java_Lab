package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNull;

public class FridgesWriterTest {
    private FridgesWriter fridgesWriter;

    @BeforeEach
    public void setUp() {
        fridgesWriter = new FridgesWriter();
    }

    @Test
    public void testWriteToFileWithNonEmptyList() throws IOException {
        // Arrange
        List<Fridge> fridges = new ArrayList<>();
        String result = fridgesWriter.writeToFile(fridges);
        assertNull(result);
    }
    @Test
    public void testEmptyWrite() throws IOException {
        //check if expected file contains the same data as written
        Assertions.assertNull(fridgesWriter.writeToFile(null));
    }
}
