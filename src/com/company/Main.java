package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("dog");
        createObject("cat");
        createObject("hamster");
        createObject("ds");

    }

    public static String createObject(String className) {
        switch (className) {
            case "dog":
                Dog dog = new Dog("Reks", "Black", "Hasky", 25);
                dog.print();
                System.out.println("------------------------------------------------------------------");
                break;
            case "cat":
                Cat cat = new Cat("Vasya", "White", "House", 10);
                cat.print();
                System.out.println("------------------------------------------------------------------");
                break;
            case "hamster":
                Hamster hamster = new Hamster("Pon pon", "Brown", "Carrot", 8);
                hamster.print();
                System.out.println("------------------------------------------------------------------");
                break;
        }
        return null;
    }
}
