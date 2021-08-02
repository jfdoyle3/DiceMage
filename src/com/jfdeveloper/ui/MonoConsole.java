package com.jfdeveloper.ui;

import com.jfdeveloper.dice.Die;

import java.util.List;

public class MonoConsole implements Console {

    public void statusBar(int health, int power, int mana) {
        System.out.printf("Health: %d\tPower level: %d\tMana: %d", health, power, mana);
    }

    public void manaDice(List<Die> dice) {
        for(Die die : dice)
            System.out.print("["+die.getFaceUp()+"] ");
    }


}
