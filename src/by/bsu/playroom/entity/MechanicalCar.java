package by.bsu.playroom.entity;

import by.bsu.playroom.typeoftoy.CarMaterial;
import by.bsu.playroom.typeoftoy.MechanicalCarModel;
import by.bsu.playroom.typeoftoy.ToySize;

public class MechanicalCar extends Car{

    private MechanicalCarModel model;

    public MechanicalCar(String name, int cost, ToySize size, CarMaterial material, MechanicalCarModel model) {
        super(name, cost, size, material);
        this.model = model;
    }

    public MechanicalCarModel getModel() {
        return this.model;
    }

    public void setModel(MechanicalCarModel model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Toy: Mechanical car" +  "; Name: "
                + getName() + "; Size: " + getSize()
                + "; Material: " + getMaterial() + "; Model: "
                + getModel() + "; Cost: " + getCost() + "$";
    }
}
