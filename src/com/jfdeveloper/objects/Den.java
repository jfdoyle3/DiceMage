package com.jfdeveloper.objects;

import com.jfdeveloper.actors.Monster;
import com.jfdeveloper.dice.Die;

import java.util.ArrayList;
import java.util.List;

public class Den {

    private List<Monster> den;

    public Den() {
        den = new ArrayList<>();
    }

    public void spawnMonster(int dmgDie) {
        den.add(new Monster(dmgDie));
    }

    public void monstersAttack() {
        for (Monster monster : den)
            monster.attack();
    }

    public void monsterAttack(int idx) {
        Monster monster = den.get(idx);
        monster.attack();
    }

    public int denSize() {
        return den.size();
    }


    @Override
    public String toString() {
        return "Den{" +
                "den=" + den +
                '}';
    }
}
