package it.develhope.polymorphism;

public class Animal {
    public String animalName;

    //constructor that instantiate "animalName"
    public Animal (String animalName) {
        this.animalName = animalName;
    }
    // a method that prints, to override in other subclasses
    public void animalSound() {
        System.out.println("default animal sound");
    }
}
