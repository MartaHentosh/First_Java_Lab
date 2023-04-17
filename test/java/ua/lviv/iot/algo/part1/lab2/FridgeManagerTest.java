package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
class FridgeManagerTest {
    @Test
    void testAddWineFridge() {
        FridgeManager fridgeManager = new FridgeManager();
        WineFridge fridge = new WineFridge("Bosch","AA12",50,10, 2);
        fridgeManager.addFridge(fridge);
        assertTrue(fridgeManager.getFridges().contains(fridge));
    }
    @Test
    void testFindFridgeWithBrand() {
        FridgeManager fridgeManager = new FridgeManager();
        Fridge fridge1 = new FridgeCamera("Samsung","MSK",300,2,"electrical",3,400);
        Fridge fridge2 = new FridgeCamera("LG","GW-B509MUM", 384, 2, "electric", 2.5, 500);
        fridgeManager.addFridge(fridge1);
        fridgeManager.addFridge(fridge2);
        List<Fridge> fridgeWithBrand = fridgeManager.findFridgeWithBrand("Samsung");
        assertEquals(1, fridgeWithBrand.size());
        assertTrue(fridgeWithBrand.contains(fridge1));
        assertFalse(fridgeWithBrand.contains(fridge2));
    }
    @Test
    void testFindFridgeWithCapacity() {
        FridgeManager fridgeManager = new FridgeManager();
        Fridge fridge1 = new WineFridge("Whirlpool","FWC 455",  70, 36, 50);
        Fridge fridge2 = new WineFridge("Klarstein","ABC123",  60, 26, 40);
        fridgeManager.addFridge(fridge1);
        fridgeManager.addFridge(fridge2);
        List<Fridge> fridgesWithCapacity = fridgeManager.findFridgeWithCapacity(60);
        assertEquals(1, fridgesWithCapacity.size());
        assertTrue(fridgesWithCapacity.contains(fridge2));
        assertFalse(fridgesWithCapacity.contains(fridge1));
    }
    @Test
    void testToString() {
        FridgeManager fridgeManager = new FridgeManager();
        fridgeManager.addFridge(new FridgeCamera("LG","GW-B509MUM", 384, 2, "electric", 2.5, 500));
        fridgeManager.addFridge(new FridgeCamera("Samsung","MSK",300,2,"electrical",3,400));
        fridgeManager.addFridge(new WineFridge("Whirlpool","FWC 455",  70, 36, 50));
        fridgeManager.addFridge(new WineFridge("Klarstein","ABC123",  60, 26, 40));
        fridgeManager.addFridge(new Freezer("Prime Technics","MRF-8050W", 145, 120, 120));
        fridgeManager.addFridge(new Freezer("Vivax","CFR-142", 146, 120, 120));
        fridgeManager.addFridge(new Minibar("MYSTERY","CS 15141 M", 46, 40, 40));
        fridgeManager.addFridge(new Minibar("Philco","PW8F", 21, 15, 15));

        String expected = "FridgeManager(fridges=[FridgeCamera(super=Fridge(brand=LG, model=GW-B509MUM, capacity=384), entries=2, typeOfBelt=electric, speedOfBelt=2.5, maxSausageWeight=500.0), FridgeCamera(super=Fridge(brand=Samsung, model=MSK, capacity=300), entries=2, typeOfBelt=electrical, speedOfBelt=3.0, maxSausageWeight=400.0), WineFridge(super=Fridge(brand=Whirlpool, model=FWC 455, capacity=70), maxBottlesWeight=36.0, maxBottlesVolume=50.0), WineFridge(super=Fridge(brand=Klarstein, model=ABC123, capacity=60), maxBottlesWeight=26.0, maxBottlesVolume=40.0), Freezer(super=Fridge(brand=Prime Technics, model=MRF-8050W, capacity=145), maxIceWeight=120.0, maxIceVolume=120.0), Freezer(super=Fridge(brand=Vivax, model=CFR-142, capacity=146), maxIceWeight=120.0, maxIceVolume=120.0), Minibar(super=Fridge(brand=MYSTERY, model=CS 15141 M, capacity=46), maxDrinksWeight=40.0, maxDrinksVolume=40.0), Minibar(super=Fridge(brand=Philco, model=PW8F, capacity=21), maxDrinksWeight=15.0, maxDrinksVolume=15.0)])";

        assertEquals(expected, fridgeManager.toString());
    }

}
