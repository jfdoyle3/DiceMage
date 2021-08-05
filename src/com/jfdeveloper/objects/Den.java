package com.jfdeveloper.objects;

import com.jfdeveloper.actors.Monster;
import com.jfdeveloper.actors.Wizard;
import com.jfdeveloper.dice.Die;

import java.util.ArrayList;
import java.util.List;

public class Den extends Monster{

    private Monster monster;
    private Wizard wizard;
    private List<Die> den;

    public Den(){

    }

    public void spawnMonster(int dmgDie) {
        den.add(new Die(dmgDie));
    }

    public List<Die> getDen() {
        return den;
    }
}
