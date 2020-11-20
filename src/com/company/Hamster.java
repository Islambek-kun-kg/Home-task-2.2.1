package com.company;

public class Hamster extends Animal {

    private int height;
    private String food;

    public Hamster(String name, String color, String food, int height) {
        super(name, color);
        this.food = food;
        this.height = height;
    }

    @Override
    public void print() {
        System.out.println(getClass().getSimpleName() +
                ":\nName - " + this.getName() +
                ";\nColor - " + this.getColor() +
                ";\nHamster`s food - " + this.food +
                ";\nHeight - " + this.height);
    }
}
