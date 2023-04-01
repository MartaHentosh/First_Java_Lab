package ua.lviv.iot.algo.part1.lab2;
import lombok.*;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
class Minibar extends Fridge{
    private double maxDrinksWeight;
    private double maxDrinksVolume;
    public  Minibar(String brand,String model, int capacity,
                    int maxDrinksWeight, int maxDrinksVolume){
        super(brand,model,capacity);
        this.maxDrinksWeight = maxDrinksWeight;
        this.maxDrinksVolume = maxDrinksVolume;
    }
    @Override
    public double getMaxUsableCapacity(){

        return maxDrinksWeight * maxDrinksVolume;
    }
}