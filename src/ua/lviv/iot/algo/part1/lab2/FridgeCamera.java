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
class FridgeCamera extends Fridge{
    public static final String HEADERS = "brand, model, capacity, entries, typeOfBelt, speedOfBelt, maxSausageWeight" ;
    public static final String value = "LG, GW-B509MUM, 384, 2, electric, 2.5, 500" ;
    private int entries;
    private String typeOfBelt ;
    private double speedOfBelt;
    private double maxSausageWeight;
    static final double VOLUME_PER_KILOGRAM = 0.01;
    public FridgeCamera(String brand, String model, int capacity,
                        int entries, String typeOfBelt, double speedOfBelt, double maxSausageWeight) {
        super(brand,model,capacity);
        this.entries = entries;
        this.typeOfBelt = typeOfBelt;
        this.speedOfBelt = speedOfBelt;
        this.maxSausageWeight = maxSausageWeight;
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
    public double getMaxUsableCapacity() {
        return maxSausageWeight / VOLUME_PER_KILOGRAM;
    }
}
