package com.jfdeveloper.objects;

import com.jfdeveloper.actors.Monster;
import com.jfdeveloper.dice.Die;

import java.util.ArrayList;
import java.util.List;

public class Den{

//    private Monster monster;
//    private Wizard wizard;
    private List<Monster> den;

    public Den(){

        den=new ArrayList<>();

    }

    public void spawnMonster(int dmgDie) {
        den.add(new Monster(dmgDie));
    }




    @Override
    public String toString() {
        return "Den{" +
                "den=" + den +
                '}';
    }
}
