package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class FreezerTest {
    private final Freezer freezer = new Freezer("Prime Technics","MRF-8050W", 145, 120, 120);
    @Test
    void testValues(){
        double expectedMaxIceWeight = 120;
        double expectedMaxIceVolume = 120;
        Freezer fridge = new Freezer(expectedMaxIceWeight, expectedMaxIceVolume);
        assertEquals(expectedMaxIceWeight, fridge.getMaxIceWeight());
        assertEquals(expectedMaxIceVolume, fridge.getMaxIceVolume());
    }
    @Test
    void testGetMaxUsableCapacity(){
        assertEquals(14400, freezer.getMaxUsableCapacity());
    }
    @Test
    public void testToString() {
        Freezer freezer = new Freezer("Vivax","CFR-142", 146, 120, 120);
        String expectedString = "Freezer(super=Fridge(brand=Vivax, model=CFR-142, capacity=146), maxIceWeight=120.0, maxIceVolume=120.0)";
        String actualString = freezer.toString();
        assertEquals(expectedString, actualString);
    }
}
