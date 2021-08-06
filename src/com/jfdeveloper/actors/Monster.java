package com.jfdeveloper.actors;

import com.jfdeveloper.dice.Die;

import java.util.ArrayList;
import java.util.List;

public class Monster {
    private Die monster;

    public Monster(int monster) {
        this.monster=new Die(monster);
    }

    @Override
    public String toString() {
        return "Monster{" +
                "monster=" + monster +
                '}';
    }
}
