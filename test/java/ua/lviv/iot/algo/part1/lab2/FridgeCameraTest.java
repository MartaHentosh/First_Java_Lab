package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FridgeCameraTest {
    private final FridgeCamera fridgeCamera = new FridgeCamera("LG","GW-B509MUM", 384, 2, "electric", 2.5, 500);
    @Test
    void testValues(){
        int expectedEntries = 2;
        String expectedTypeOfBelt = "electric" ;
        double expectedSpeedOfBelt = 2.5;
        double expectedMaxSausageWeight = 500;
        FridgeCamera fridge = new FridgeCamera(expectedEntries, expectedTypeOfBelt, expectedSpeedOfBelt,expectedMaxSausageWeight);
        assertEquals(expectedEntries, fridge.getEntries());
        assertEquals(expectedTypeOfBelt,fridge.getTypeOfBelt());
        assertEquals(expectedSpeedOfBelt, fridge.getSpeedOfBelt());
        assertEquals(expectedMaxSausageWeight, fridge.getMaxSausageWeight());
    }
    @Test
    void getMaxUsableCapacity(){
        assertEquals(50000, fridgeCamera.getMaxUsableCapacity());
    }
    @Test
    public void testToString() {
        FridgeCamera fridgeCamera = new FridgeCamera("Samsung", "FC1234", 100,
                2, "rubber", 2.5, 20.0);
        String expectedString = "FridgeCamera(super=Fridge(brand=Samsung, model=FC1234, capacity=100), entries=2, typeOfBelt=rubber, speedOfBelt=2.5, maxSausageWeight=20.0)";
        String actualString = fridgeCamera.toString();
        assertEquals(expectedString, actualString);
    }
}
