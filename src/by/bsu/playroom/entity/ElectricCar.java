package by.bsu.playroom.entity;

import by.bsu.playroom.typeoftoy.CarMaterial;
import by.bsu.playroom.typeoftoy.ToySize;

public class ElectricCar extends Car{
    private int maxSpeed;

    public ElectricCar(String name, int cost, ToySize size, CarMaterial material, int maxSpeed) {
        super(name, cost, size, material);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Toy: Electric car" +  "; Name: "
                + getName() + "; Size: " + getSize()
                + "; Material: " + getMaterial() + "; Max speed: "
                + getMaxSpeed() + "; Cost: " + getCost() + "$";
    }
}
