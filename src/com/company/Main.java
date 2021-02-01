package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("dog");
        createObject("cat");
        createObject("hamster");
        createObject("ds");
    }

    public static Animal createObject(String className) {
        switch (className) {
            case "dog":
                Animal dog = new Dog("Reks", "Black", "Hasky", 25);
                dog.print();
                System.out.println("------------------------------------------------------------------");
                return dog;
            case "cat":
                Animal cat = new Cat("Vasya", "White", "House", 10);
                cat.print();
                System.out.println("------------------------------------------------------------------");
                return cat;
            case "hamster":
                Animal hamster = new Hamster("Pon pon", "Brown", "Carrot", 8);
                hamster.print();
                System.out.println("------------------------------------------------------------------");
                return hamster;
            default:
                return null;
        }
    }
}
