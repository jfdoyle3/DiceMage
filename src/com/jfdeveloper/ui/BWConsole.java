package com.jfdeveloper.ui;

import com.jfdeveloper.actors.Monster;
import com.jfdeveloper.actors.Wizard;
import com.jfdeveloper.dice.Die;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BWConsole implements Console {

    public void statusBar(String name, int health, int power, int mana) {
        System.out.printf("Wizard: %s\nHealth: %d\tPower level: %d\tMana: %d\n", name, health, power, mana);
    }

    public void wizardsStatus(List<Wizard> wizards) {
        for(Wizard wizard : wizards)
            System.out.printf("Wizard: %s\nHealth: %d\tPower level: %d\tMana: %d\n", wizard.getName(),wizard.getHealth(),wizard.getPowerLevel(),wizard.getMana());
    }

    public void manaDice(List<Die> dice) {
        for (Die die : dice)
            System.out.print("[" + die.getFaceUp() + "] ");
    }

    public int wizardChoice(int mana) {
        List<String> choices = new ArrayList<>(Arrays.asList("Increase Power Level", "Spawn Monster", "Check Status", "End Turn"));
        System.out.println();
        int idx = 0;
        if (mana < 3)
            idx = 2;
        for (int i = idx; i < choices.size(); i++)
            System.out.printf("%d) %s\n", i + 1, choices.get(i));

        System.out.println("What say you?");
        return Input.inputNumber();
    }

    public void buyMonster(int mana,int denSize){
        System.out.println("Buy Monster: ");
        int dieSize=Math.abs(mana-denSize-3);
        int price=3+dieSize+denSize;
        int minDie=3;
        System.out.println("you can get die: "+minDie+" - "+dieSize);
        System.out.printf("\n\ndenSize:  %d\ndieSize: %d\nmana: %d\n---------\nprice: %d",denSize,dieSize,mana,price);
    }
}

