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
@ToString
abstract  class Fridge{
    protected String brand;
    protected String model;
    protected int capacity;
    public abstract double getMaxUsableCapacity();
}
