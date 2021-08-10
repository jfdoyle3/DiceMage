package com.jfdeveloper.actors;

import com.jfdeveloper.dice.Cup;
import com.jfdeveloper.game.Den;
import com.jfdeveloper.ui.Dbug;

public class Wizard {

    private Den den;
    private String name;
    private int health;
    private int mana;
    private int powerLevel;
    private Cup cup;


    public Wizard(String name) {
        this.name = name;
        health = 5;
        powerLevel=6;
        cup = new Cup(6);
        mana = 1;
        den=new Den();
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

    public void dmgHealth(){
        health--;
    }

    public Den getDen() {
        return den;
    }

    public void addMana(){
        mana++;
    }

    public void incPower(){
        mana-=3;
        powerLevel++;
        cup.addDice(1);
    }
    public void removeMana(int amount){
        mana-=amount;
    }

    public void bonusMana(int freqTreeMap){
        int manaInc=freqTreeMap-2;
        mana=mana+manaInc;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", mana=" + mana +
                ", powerLevel=" + powerLevel +
                ", cup=" + cup +
                ", den=" + den +
                '}';
    }

 
}