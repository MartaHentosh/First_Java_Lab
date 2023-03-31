package ua.lviv.iot.algo.part1.lab2;
class FridgeCamera extends Fridge{
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
    public double getMaxUsableCapacity() {
        return maxSausageWeight / VOLUME_PER_KILOGRAM;
    }
}
