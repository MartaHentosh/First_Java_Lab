package ua.lviv.iot.algo.part1.lab2;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FridgeManager {
    private final List<Fridge> fridges = new LinkedList<>();
    public void addFridge(Fridge fridge) {
        this.fridges.add(fridge);
    }
     public List<Fridge> findFridgeWithCapacity(int capacity) {
        return fridges.stream().
        filter(fridge -> fridge.getCapacity() == capacity).
                collect(Collectors.toList());
    }
    public void main(String[] args) {
        FridgeManager fridgeManager = new FridgeManager();

        fridgeManager.addFridge(new FridgeCamera("LG","GW-B509MUM", 384, 2, "electric", 2.5, 500));
        fridgeManager.addFridge(new FridgeCamera("Samsung","MSK",300,2,"electrical",3,400));
        fridgeManager.addFridge(new WineFridge("Whirlpool","FWC 455",  70, 36, 50));
        fridgeManager.addFridge(new WineFridge("Klarstein","ABC123",  60, 26, 40));
        fridgeManager.addFridge(new Freezer("Prime Technics","MRF-8050W", 145, 120, 120));
        fridgeManager.addFridge(new Freezer("Vivax","CFR-142", 146, 120, 120));
        fridgeManager.addFridge(new Minibar("MYSTERY","CS 15141 M", 46, 40, 40));
        fridgeManager.addFridge(new Minibar("Philco","PW8F", 21, 15, 15));

        var CapacityOfFridges = fridgeManager.findFridgeWithCapacity(60);
        System.out.println("Fridge witch capacity 60 is:");
        for (Fridge fridge : CapacityOfFridges) {
            System.out.println(fridge.getCapacity());
        }

        for (Fridge fridge : fridges) {
            System.out.println(fridge.toString());
            System.out.println("Max usable capacity: " + fridge.getMaxUsableCapacity());
        }
    }
}