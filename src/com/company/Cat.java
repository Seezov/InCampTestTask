package com.company;

/**
 * Created by Seezov on 17-Jun-17.
 */
//Inheritance
public class Cat extends Animal {

    Cat(String name)
    {
        super(name);
    }

    public String makeSound()
    {
        if(getHappinessLevel() >= 8)
            return "Meow";
        else
            return "";
    }
}
