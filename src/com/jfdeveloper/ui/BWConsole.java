package com.jfdeveloper.ui;

import com.jfdeveloper.dice.Die;

import java.util.List;

public class BWConsole implements Console {

    public void statusBar(String name, int health, int power, int mana) {
        System.out.printf("Wizard: %s\nHealth: %d\tPower level: %d\tMana: %d\n", name,health, power, mana);
    }

    public void manaDice(List<Die> dice) {
        for(Die die : dice)
            System.out.print("["+die.getFaceUp()+"] ");
    }


}
