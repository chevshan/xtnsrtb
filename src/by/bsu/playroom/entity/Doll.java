package by.bsu.playroom.entity;

import by.bsu.playroom.typeoftoy.ToySize;
import by.bsu.playroom.typeoftoy.TypeOfDoll;

public class Doll extends Toy{
    private TypeOfDoll typeOfDoll;

    public Doll(String name, int cost, ToySize size, TypeOfDoll typeOfDoll) {
        super(name, cost, size);
        this.typeOfDoll = typeOfDoll;
    }

    public TypeOfDoll getTypeOfDoll() {
        return this.typeOfDoll;
    }

    public void setTypeOfDoll(TypeOfDoll typeOfDoll) {
        this.typeOfDoll = typeOfDoll;
    }

    @Override
    public String toString() {
        return "Toy: Doll" +  "; Name: "
                + getName() + "; Size: " + getSize()
                + "; Type of doll: " + getTypeOfDoll()
                + "; Cost: " + getCost() + "$";
    }
}
