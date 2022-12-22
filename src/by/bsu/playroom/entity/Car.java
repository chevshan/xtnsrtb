package by.bsu.playroom.entity;

import by.bsu.playroom.typeoftoy.CarMaterial;
import by.bsu.playroom.typeoftoy.ToySize;

public class Car extends Toy{
    private CarMaterial material;

    public Car(String name, int cost, ToySize size, CarMaterial material) {
        super(name, cost, size);
        this.material = material;
    }

    public CarMaterial getMaterial() {
        return this.material;
    }

    public void setMaterial(CarMaterial material) {
        this.material = material;
    }
}