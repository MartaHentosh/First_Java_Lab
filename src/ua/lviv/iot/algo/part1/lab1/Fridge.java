package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Fridge {
    private String brand;
    private String model;
    private int capacity;
    private boolean isDefrosting;
    private String energyEfficiencyClass;

    public static Fridge instance;
    public static Fridge getInstance() {
        if(instance == null){
            return new Fridge();
        }
        return instance;
    }
    public void turnOnDefrosting(){
        if (isDefrosting) {
            System.out.println("The defrosting is already on.");
        } else {
            isDefrosting = true;
            System.out.println("The defrosting has been turned on.");
        }
    }

    public void turnOffDefrosting() {
        if (!isDefrosting) {
            System.out.println("The defrosting is already off.");
        } else {
            isDefrosting = false;
            System.out.println("The defrosting has been turned off.");
        }
    }

    public void deleteModelInfo() {
        if (model == null) {
            System.out.println("The model information is already deleted.");
        } else {
            model = null;
            System.out.println("The model information has been deleted.");
        }
    }
    public static void main(String[]args) {
        Fridge[] fridges = new Fridge[4];

        fridges[0] = new Fridge();
        fridges[1] = new Fridge("Samsung", "RB36T677FB1", 360, false, "A+");
        fridges[2] = Fridge.getInstance();
        fridges[2].setBrand("LG");
        fridges[2].setModel("GW-B509SMUM");
        fridges[2].setCapacity(384);
        fridges[2].setDefrosting(false);
        fridges[2].setEnergyEfficiencyClass("A++");
        fridges[3] = Fridge.getInstance();
        fridges[3].setBrand("BOSCH");
        fridges[3].setModel("KGN39VI306");
        fridges[3].setCapacity(400);
        fridges[3].setDefrosting(true);
        fridges[3].setEnergyEfficiencyClass("A++");


        for (int i = 0; i < fridges.length; i++) {
            Fridge fridge = fridges[i];
            fridge.turnOnDefrosting();
            fridge.turnOffDefrosting();
            fridge.deleteModelInfo();
            System.out.println(fridges[i]);

        }
    }

}