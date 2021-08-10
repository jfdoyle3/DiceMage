package com.jfdeveloper.actors;

import com.jfdeveloper.dice.Die;

public class Monster {
    private Die monster;


    public Monster(int monster) {
        this.monster=new Die(monster);
    }


    public void attack() {
        monster.roll();
    }

    public Die getMonster() {
        return monster;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "monster=" + monster +
                '}';
    }
}
