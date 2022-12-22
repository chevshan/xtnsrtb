package by.bsu.playroom.entity;

import by.bsu.playroom.typeoftoy.ToySize;

public class Toy {
    private String name;
    private int cost;
    private ToySize size;

    public Toy(String name, int cost, ToySize size) {
        this.name = name;
        this.cost = cost;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public ToySize getSize() {
        return this.size;
    }

    public void setSize(ToySize size) {
        this.size = size;
    }
}
