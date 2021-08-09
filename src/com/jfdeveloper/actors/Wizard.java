package com.jfdeveloper.actors;

import com.jfdeveloper.dice.Cup;
import com.jfdeveloper.dice.Die;
import com.jfdeveloper.objects.Den;
import com.jfdeveloper.ui.Dbug;

import java.util.ArrayList;
import java.util.List;

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

    // TODO: Remove
    public int setHealth(int health) {
        this.health = health;
        return health;
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

    public void bonusMana(int freqTreeMap){
        Dbug.dbug("MANA BEFORE: ",mana);
        int manaInc=freqTreeMap-2;
        mana=mana+manaInc;
        Dbug.dbug("MANA BONUS: ",manaInc);
        Dbug.dbug("MANA AFTER: ",mana);
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