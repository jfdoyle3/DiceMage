package com.jfdeveloper.objects;

import java.util.ArrayList;
import java.util.List;

public class Monster {
    List<Die> den = new ArrayList<>();

    public Monster(int dmgDie) {
        den.add(new Die(dmgDie));
    }

    public void attack() {
        // roll die.
        den.get(0).roll();
    }

    @Override
    public String toString() {
        return "Monster{" +
                "den=" + den +
                '}';
    }
}
