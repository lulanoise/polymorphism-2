package it.develhope.polymorphism;

public class Start {

    public static void main(String args[]) {
        //create the 3 objects
        Animal animal = new Animal("generic animal");
        Lion lion = new Lion("Simba");
        Cow cow = new Cow("Carolina");

        //execute the method
        animal.animalSound();
        lion.animalSound();
        cow.animalSound();
    }



}
