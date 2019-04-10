package hu.elte.pos.model;

public class ItemModel {
    private int cost;
    private String name;

    public ItemModel(int cost, String name) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return this.name;
    }

    public int getCost() {
        return cost;
    }
}