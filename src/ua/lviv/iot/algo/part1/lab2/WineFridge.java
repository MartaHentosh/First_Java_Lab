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
public class WineFridge extends Fridge {
    public static final String HEADERS = "brand,model,capacity,"
            + "maxBottlesWeight,maxBottlesVolume";
    public static final String Value = "Whirlpool,FWC 455,70,36,50";
    private double maxBottlesWeight;
    private double maxBottlesVolume;

    public WineFridge(final String brand, final String model,
                      final int capacity,
                      final int maxBottlesWeight,
                      final int maxBottlesVolume) {
        super(brand, model, capacity);
        this.maxBottlesWeight = maxBottlesWeight;
        this.maxBottlesVolume = maxBottlesVolume;
    }

    @Override
    public double getMaxUsableCapacity() {
        return maxBottlesVolume * maxBottlesWeight;
    }

    public String getHeaders() {
        return HEADERS;
    }

    public String toCSV() {
        return Value;
    }
}
