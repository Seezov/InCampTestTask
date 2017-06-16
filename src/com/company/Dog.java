package com.company;

/**
 * Created by Seezov on 17-Jun-17.
 */
//Inheritance
public class Dog extends Animal {

    Dog(String name)
    {
        super(name);
    }

    public String makeSound()
    {
        if(getHappinessLevel() >= 8)
            return "Woof";
        else
            return "";
    }
}
