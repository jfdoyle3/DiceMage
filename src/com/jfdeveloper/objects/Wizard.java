package com.jfdeveloper.objects;

import com.jfdeveloper.dice.Cup;

public class Wizard {

    private String name;
    private int health;
    private int mana;
    private int powerLevel;
    private Cup cup;


    public Wizard(String name) {
        this.name = name;
        cup = new Cup();
        health = 5;
        powerLevel=6;
        mana = 1;
    }


//    public int updateScore(){
//        int roundScore=0;
//        for(Die die : cup.dice)
//            score+=die.getFaceUp();
//        score+=roundScore;
//        return roundScore;
//    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public Cup getCup() {
        return cup;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", mana=" + mana +
                ", powerLevel=" + powerLevel +
                ", cup=" + cup +
                '}';
    }
}
