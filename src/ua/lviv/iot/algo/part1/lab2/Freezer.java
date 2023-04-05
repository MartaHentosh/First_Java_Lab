package ua.lviv.iot.algo.part1.lab2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
class Freezer extends Fridge{
    private double maxIceWeight;
    private double maxIceVolume;
    public  Freezer(String brand,String model, int capacity,
                       int maxIceWeight, int maxIceVolume){
        super(brand,model,capacity);
        this.maxIceWeight = maxIceWeight;
        this.maxIceVolume = maxIceVolume;
    }
    @Override
    public double getMaxUsableCapacity(){
        return maxIceWeight * maxIceVolume;
    }
}
