package com.jfdeveloper.objects;

import java.util.ArrayList;
import java.util.List;

public class Monster {
    List<Die> den;

    public Monster() {
        den = new ArrayList<>();
    }

    public void spawnMonster(int dmgDie) {
        den.add(new Die(dmgDie));
    }

    public void attack() {
        for(int idx=0; idx<den.size(); idx++)
            den.get(idx).roll();
    }

    public void attack(int idx) {
            den.get(idx).roll();
    }

    @Override
    public String toString() {
        return "Monster{" +
                "den=" + den +
                '}';
    }
}
