package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class FridgeTest {
    private final Fridge fridge = new Fridge("Samsung","ABC123",500) {
        @Override
        public double getMaxUsableCapacity() {
            return 0;
        }
    };
    @Test
    void testGetBrand() {
        assertEquals("Samsung", fridge.getBrand());
    }
    @Test
    void testGetModel() {
        assertEquals("ABC123", fridge.getModel());
    }
    @Test
    void testGetCapacity() {
        assertEquals(500, fridge.getCapacity());
    }
    @Test
    void testGetMaxUsableCapacity() {
        assertEquals(0, fridge.getMaxUsableCapacity(), 0.0001);
    }
}
