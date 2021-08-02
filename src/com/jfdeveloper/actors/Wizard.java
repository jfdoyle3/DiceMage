package com.jfdeveloper.actors;

import com.jfdeveloper.actors.Monster;
import com.jfdeveloper.dice.Cup;
import com.jfdeveloper.dice.Die;

public class Wizard {

    private String name;
    private int health;
    private int mana;
    private int powerLevel;
    private Cup cup;
    private Monster monster;


    public Wizard(String name) {
        this.name = name;

        health = 5;
        powerLevel=6;
        cup = new Cup(6);
        mana = 1;
        monster=new Monster();
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

    public Monster getMonster() {
        return monster;
    }

    public void spawnMonster(int cost, int dmgDie) {
        mana-=cost;
        monster.den.add(new Die(dmgDie));
    }

    public void addMana(){
        mana++;
    }

    public void incPower(){
        mana-=3;
        powerLevel++;
        cup.addDice(1);
    }

    public void addPower(){
        powerLevel++;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", mana=" + mana +
                ", powerLevel=" + powerLevel +
                ", cup=" + cup +
                ", monster=" + monster +
                '}';
    }
}
