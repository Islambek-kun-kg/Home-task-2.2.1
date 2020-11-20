package com.company;

public class Cat extends Animal {

    private String type;
    private int weight;

    public Cat(String name, String color, String type, int weight) {
        super(name, color);
        this.type = type;
        this.weight = weight;
    }

    @Override
    public void print() {
        System.out.println(getClass().getSimpleName() +
                ":\nName - " + this.getName() +
                ";\nColor - " + this.getColor() +
                ";\nType - " + this.type +
                ";\nWeight - " + this.weight);
    }
}
