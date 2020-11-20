package com.company;

public class Dog extends Animal {

    private String breed;
    private int age;

    public Dog(String name, String color, String breed, int age) {
        super(name, color);
        this.breed = breed;
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println(getClass().getSimpleName() +
                ":\nName - " + this.getName() +
                ";\nColor - " + this.getColor() +
                ";\nBreed - " + this.breed +
                ";\nAge - " + this.age);
    }
}
