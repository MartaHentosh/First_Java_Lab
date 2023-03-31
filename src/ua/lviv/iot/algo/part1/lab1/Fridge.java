package ua.lviv.iot.algo.part1.lab1;
import lombok.*;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Fridge {
    private String brand = "LG";
    private String model = "GW-B509SMUM";
    private int capacity = 384;
    private boolean isDefrosting = false;
    private String energyEfficiencyClass = "A++";

    private static Fridge instance;
    public static Fridge getInstance() {
        if(instance == null){
            instance = new  Fridge();
        }
        return instance;
    }
    public void turnOnDefrosting(){
            isDefrosting = true;
    }
    public void turnOffDefrosting() {
            isDefrosting = false;
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
        fridges[3] = Fridge.getInstance();

        for (Fridge fridge : fridges) {
            fridge.turnOnDefrosting();
            fridge.turnOffDefrosting();
            fridge.deleteModelInfo();
            System.out.println(fridge);

        }
    }
}
