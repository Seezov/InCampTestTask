package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        //Adding two different object to array
        animals.add(new Cat("Simba"));
        animals.add(new Dog("Otis"));

        Animal currentAnimal;
        //Polymorphism is represented by "makeSound" method .
        //User doesn't know to which animal object he is referring to until this animal makes a sound.
        for (int i = 0; i < animals.size(); i++)
        {
            currentAnimal = animals.get(i);
            if(currentAnimal.makeSound() == "")
                System.out.println(currentAnimal.getName() + " isn't happy ");
            else
                System.out.println(currentAnimal.getName() + " goes " + currentAnimal.makeSound());
        }

        for (int i = 0; i < animals.size(); i++)
        {
            currentAnimal = animals.get(i);
            // Feed animals until they are happy
            do
            {
                currentAnimal.feed();
            }while (currentAnimal.makeSound() == "");

            if(currentAnimal.makeSound() == "")
                System.out.println(currentAnimal.getName() + " isn't happy ");
            else
                System.out.println(currentAnimal.getName() + " goes " + currentAnimal.makeSound());
        }
    }
}
