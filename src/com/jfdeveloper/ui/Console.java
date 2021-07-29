package com.jfdeveloper.ui;

import com.jfdeveloper.objects.Die;

import java.util.List;

public class Console {




    public static void wizardBar(int health, int power, int mana) {
        System.out.printf("Health: %d\tPower level: %d\tMana: %d", health, power, mana);
    }

    public static void manaDice(List<Die> dice) {
        for(Die die : dice)
        System.out.print(Color.BLUE + "["+die.getFaceUp()+"] " + Color.RESET);

    }

    public static void statusBar(List<String> hitPoints, List<String> manaPoints) {
        System.out.println(Color.RED_BOLD_BRIGHT + hitPoints.toString() + Color.RESET);
        System.out.println(Color.BLUE_BOLD_BRIGHT + manaPoints.toString() + Color.RESET);
    }

}





