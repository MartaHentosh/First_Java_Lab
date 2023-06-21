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
public class Minibar extends Fridge {
    public static final String HEADERS = "brand,model,capacity,"
            + "maxDrinksWeight,maxDrinksVolume";
    public static final String Value = "MYSTERY,CS 15141 M,46,40,40";
    private final double maxDrinksWeight;
    private final double maxDrinksVolume;

    public Minibar(final String brand, final String model, final int capacity,
                   final int maxDrinksWeight, final int maxDrinksVolume) {
        super(brand, model, capacity);
        this.maxDrinksWeight = maxDrinksWeight;
        this.maxDrinksVolume = maxDrinksVolume;
    }

    @Override
    public double getMaxUsableCapacity() {
        return maxDrinksWeight * maxDrinksVolume;
    }

    public String getHeaders() {
        return HEADERS;
    }

    public String toCSV() {
        return Value;
    }
}
