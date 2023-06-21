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
public
class Freezer extends Fridge{
    public static final String HEADERS = "brand, model, capacity, maxIceWeight, maxIceVolume" ;
    public static final String value = "Prime Technics, MRF-8050W, 145, 120, 120" ;
    private double maxIceWeight;
    private double maxIceVolume;
    public  Freezer(String brand,String model, int capacity,
                    int maxIceWeight, int maxIceVolume){
        super(brand,model,capacity);
        this.maxIceWeight = maxIceWeight;
        this.maxIceVolume = maxIceVolume;
    }

    @Override
    public String getHeaders() {
        return HEADERS;
    }

    @Override
    public String toCSV() {
        return value;
    }

    @Override
    public double getMaxUsableCapacity(){
        return maxIceWeight * maxIceVolume;
    }
}
