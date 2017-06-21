package com.company;

/**
 * Created by Seezov on 17-Jun-17.
 */

public class Animal {

    private String name;
    //Encapsulation
    private byte happinessLevel = 0;
    private static final byte HAPPINESS_LEVEL_INCREASE = 2;
    private static final byte HAPPINESS_LEVEL_DECREASE = 3;
    private static final byte MAX_HAPPINESS_LEVEL = 10;

    Animal(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public byte getHappinessLevel()
    {
        return happinessLevel;
    }

    public void feed()
    {
        if(happinessLevel > MAX_HAPPINESS_LEVEL) return;
        happinessLevel += HAPPINESS_LEVEL_INCREASE;
    }

    public boolean isAnimalHappy()
    {
        if(happinessLevel >= 8)
            return true;
        else
            return false;
    }

    private void Action()
    {
        // Do some kind of action
    }

    public void actionWasPerformed()
    {
        happinessLevel -= HAPPINESS_LEVEL_DECREASE;
        if(happinessLevel < 0)
            happinessLevel = 0;
    }

    public void makeAction()
    {
        if(happinessLevel >= 8)
            Action();
    }

}
