package com.company;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        //Adding two different object to array
        animals.add(new Cat("Simba"));
        animals.add(new Dog("Otis"));

        Animal currentAnimal;
        //Polymorphism is represented by "makeAction" method .
        for (int i = 0; i < animals.size(); i++)
        {
            currentAnimal = animals.get(i);
            currentAnimal.makeAction();
            // Feed the current animal until it is happy
            do
            {
                currentAnimal.feed();
            }while (!currentAnimal.isAnimalHappy() );
            currentAnimal.makeAction();
        }
    }
}
