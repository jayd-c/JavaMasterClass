package dev.ele;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog("Wolf","Big",100);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("Gren","Big",150));
        animals.add(new Fish("Goldfish","Small",5));
        animals.add(new Fish("bullfish","Medium",4));
        animals.add(new Horse("Clydestale","big",1000));
        for (Animal a: animals) {
            doAnimalStuff(a);
        }




    }
    private static void doAnimalStuff (Animal animal) {
        animal.makeNoise();
        if(animal.type.equalsIgnoreCase("slow")){
            animal.move("slow");

        } else {
            animal.move("fast");
        }
    }
}
