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

    private void BringAStick()
    {
        // Bring a stick to the owner
        System.out.println(getName() + " brought you a stick ");
    }

    private void Bark()
    {
        System.out.println(getName() + " barked ");
    }

    public void makeAction()
    {
        if(getHappinessLevel() >= 8)
            BringAStick();
        else
            Bark();
    }
}
