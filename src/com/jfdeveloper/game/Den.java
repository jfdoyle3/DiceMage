package com.jfdeveloper.game;

import com.jfdeveloper.actors.Monster;
import com.jfdeveloper.actors.Wizard;
import com.jfdeveloper.dice.Die;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Den {

    private List<Monster> den;
    private TreeMap<Integer, Integer> treeDen;

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

    public void removeMonster(int idx) {
        den.remove(idx);
    }

    public void monsterAttack(int idx) {
        Monster monster = den.get(idx);
        monster.attack();
    }

    public int denSize() {
        return den.size();
    }

    public void displayDen() {
        System.out.print("Den: ");
        for (Monster monster : den)
            System.out.print(monster.getMonster() + " ");
    }

    public boolean isEmpty() {
        return den.size() == 0 ? true : false;
    }

    public List<Monster> denAction() {
        return den;
    }

    @Override
    public String toString() {
        return "Den{" +
                "den=" + den +
                '}';
    }
}
