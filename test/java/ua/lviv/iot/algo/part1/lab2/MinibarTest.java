package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class MinibarTest {
    private final Minibar minibar = new Minibar("MYSTERY","CS 15141 M", 46, 40, 40);
    @Test
    void testValues(){
        int expectedMaxDrinksWeight = 40;
        int expectedMaxDrinksVolume = 40;
        Minibar fridge = new Minibar("MYSTERY","CS 15141 M", 46,expectedMaxDrinksWeight, expectedMaxDrinksVolume);
        assertEquals(expectedMaxDrinksWeight, fridge.getMaxDrinksWeight());
        assertEquals(expectedMaxDrinksVolume, fridge.getMaxDrinksVolume());
    }
    @Test
    void testGetMaxUsableCapacity(){
        assertEquals(1600,minibar.getMaxUsableCapacity());
    }
    @Test
    public void testToString() {
        Minibar minibar = new Minibar("Philco","PW8F", 21, 15, 15);
        String expectedString = "Minibar(super=Fridge(brand=Philco, model=PW8F, capacity=21), maxDrinksWeight=15.0, maxDrinksVolume=15.0)";
        String actualString = minibar.toString();
        assertEquals(expectedString, actualString);
    }
}
