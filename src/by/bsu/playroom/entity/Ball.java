package by.bsu.playroom.entity;

import by.bsu.playroom.typeoftoy.ToySize;
import by.bsu.playroom.typeoftoy.TypeOfBall;

public class Ball extends Toy{
    private TypeOfBall typeOfBall;

    public Ball(String name, int cost, ToySize size, TypeOfBall typeOfBall) {
        super(name, cost, size);
        this.typeOfBall = typeOfBall;
    }

    public TypeOfBall getTypeOfBall() {
        return this.typeOfBall;
    }

    public void setTypeOfBall(TypeOfBall typeOfBall) {
        this.typeOfBall = typeOfBall;
    }

    @Override
    public String toString() {
        return "Toy: Ball" + "; Name: "
                + getName() + "; Size: " + getSize()
                + "; Type of ball: " + getTypeOfBall()
                + "; Cost: " + getCost() + "$";
    }
}
