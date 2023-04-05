package ua.lviv.iot.algo.part1.lab2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
@Setter
@Getter
@AllArgsConstructor
@ToString(callSuper = true)
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
    public List<Fridge> findFridgeWithBrand(String brand) {
        return fridges.stream()
                .filter(fridge -> fridge.getBrand().equals(brand))
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        FridgeManager fridgeManager = new FridgeManager();
        fridgeManager.addFridge(new FridgeCamera("LG","GW-B509MUM", 384, 2, "electric", 2.5, 500));
        fridgeManager.addFridge(new FridgeCamera("Samsung","MSK",300,2,"electrical",3,400));
        fridgeManager.addFridge(new WineFridge("Whirlpool","FWC 455",  70, 36, 50));
        fridgeManager.addFridge(new WineFridge("Klarstein","ABC123",  60, 26, 40));
        fridgeManager.addFridge(new Freezer("Prime Technics","MRF-8050W", 145, 120, 120));
        fridgeManager.addFridge(new Freezer("Vivax","CFR-142", 146, 120, 120));
        fridgeManager.addFridge(new Minibar("MYSTERY","CS 15141 M", 46, 40, 40));
        fridgeManager.addFridge(new Minibar("Philco","PW8F", 21, 15, 15));

        for (Fridge fridge : fridgeManager.fridges) {
            System.out.println(fridge);
            System.out.println("Max usable capacity: " + fridge.getMaxUsableCapacity());
        }
        var CapacityOfFridges = fridgeManager.findFridgeWithCapacity(60);
        System.out.println("Fridge witch capacity 60 is:");
        for (Fridge fridge : CapacityOfFridges) {
            System.out.println(fridge);
        }
        var FridgeBrand = fridgeManager.findFridgeWithBrand("Samsung");
        System.out.println("Fridge with brand Samsung is:");
        for (Fridge fridge : FridgeBrand) {
            System.out.println(fridge);
        }
    }
}
