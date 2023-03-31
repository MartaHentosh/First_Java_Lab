package ua.lviv.iot.algo.part1.lab2;
class WineFridge extends Fridge{
    private double maxBottlesWeight;
    private double maxBottlesVolume;
    public  WineFridge(String brand, String model,int capacity,
                       int maxBottlesWeight, int maxBottlesVolume){
        super(brand,model,capacity);
        this.maxBottlesWeight = maxBottlesWeight;
        this.maxBottlesVolume = maxBottlesVolume;
    }
    @Override
    public double getMaxUsableCapacity() {
        return maxBottlesVolume * maxBottlesWeight;
    }
}