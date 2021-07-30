package com.jfdeveloper.ui;

import com.jfdeveloper.objects.Die;

import java.util.List;

public class Console {

    public static void wizardBar(int health, int power, int mana) {
        System.out.printf("Health: %d\tPower level: %d\tMana: %d", health, power, mana);
    }

    public static void manaDice(List<Die> dice) {
        for(Die die : dice)
            System.out.print("["+die.getFaceUp()+"] ");

    }
}
