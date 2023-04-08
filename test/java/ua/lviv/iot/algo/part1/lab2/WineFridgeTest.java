package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class WineFridgeTest {
    private final WineFridge wineFridge = new WineFridge("Whirlpool", "FWC 455", 70, 36, 50);
    @Test
    void testValues(){
        double expectedMaxBottlesWeight = 36;
        double expectedMaxBottlesVolume = 50;
        WineFridge fridge = new WineFridge(expectedMaxBottlesWeight, expectedMaxBottlesVolume);
        assertEquals(expectedMaxBottlesWeight, fridge.getMaxBottlesWeight());
        assertEquals(expectedMaxBottlesVolume, fridge.getMaxBottlesVolume());
    }
    @Test
    void testGetMaxUsableCapacity(){
        assertEquals(1800, wineFridge.getMaxUsableCapacity());
    }
    @Test
    public void testToString() {
        WineFridge wineFridge = new WineFridge("Klarstein","ABC123",  60, 26, 40);
        String expectedString = "WineFridge(super=Fridge(brand=Klarstein, model=ABC123, capacity=60), maxBottlesWeight=26.0, maxBottlesVolume=40.0)";
        String actualString = wineFridge.toString();
        assertEquals(expectedString, actualString);
    }
}
