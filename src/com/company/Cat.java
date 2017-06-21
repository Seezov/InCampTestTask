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

    private void Jump()
    {
        // Do a jump
        System.out.println(getName() + " jumped ");
    }

    private void Hiss()
    {
        System.out.println(getName() + " hissed ");
    }

    public void makeAction()
    {
        if(getHappinessLevel() >= 8)
            Jump();
        else
            Hiss();
    }
}
