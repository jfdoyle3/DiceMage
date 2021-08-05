package com.jfdeveloper.ui;

import com.jfdeveloper.actors.Monster;
import com.jfdeveloper.actors.Wizard;
import com.jfdeveloper.dice.Dice;
import com.jfdeveloper.dice.Die;


import java.util.Collections;
import java.util.List;

public class ColorConsole implements Console {

    private static final String RESET="\033[0m";
    private static final String RED_BACKGROUND="\033[41m";
    private static final String GREEN_BACKGROUND="\033[42m";
    private static final String BLUE_BACKGROUND="\033[44m";
    private static final String WHITE_BOLD_BRIGHT="\033[1;97m";

    public void Dice(List<Die> dice) {
        for(Die die : dice)
        System.out.print(Color.BLUE + "["+die.getFaceUp()+"] " + Color.RESET);

    }

    public void manaDice(List<Die> list) {
      //  Collections.sort(list, Dice::group());
        System.out.println(Color.BLUE);
        StringBuilder dice = new StringBuilder();
        StringBuilder part1 = new StringBuilder();
        StringBuilder part2 = new StringBuilder();
        StringBuilder part3 = new StringBuilder();
        for (Die die : list) {
            part1.append(BLUE_BACKGROUND).append("     ")
                    .append(RESET).append(" ");

            part2.append(BLUE_BACKGROUND).append("  ")
                    .append(WHITE_BOLD_BRIGHT).append(die.getFaceUp())
                    .append(BLUE_BACKGROUND).append("  ")
                    .append(RESET).append(" ");

            part3.append(BLUE_BACKGROUND).append("     ")
                    .append(RESET).append(" ");
        }
        part1.append("\n");
        part2.append("\n");
        part3.append("\n");
        dice.append(part1).append(part2).append(part3);
        System.out.println(dice);
        System.out.println(RESET);
    }

//    public void statusBar(String name,int health, int power, int mana, Lis) {
//        System.out.printf("Name: %s\nHealth: %d\tPower level: %d\tMana: %d\n",name, health, power, mana);
//    }

    public void statusBar(String name,int hitPoints, int powerLvl,int manaPoints) {
        System.out.println("Wizard: "+name);
            for(int hp=0; hp<hitPoints; hp++)
                System.out.print(RED_BACKGROUND + "▐"+RESET+" ");

        System.out.print("\t");

        for(int pl=0; pl<powerLvl; pl++)
            System.out.print(GREEN_BACKGROUND + "▐"+RESET+" ");

        System.out.print("\t");

        for(int mana=0; mana<manaPoints; mana++)
            System.out.print(BLUE_BACKGROUND + "▐"+RESET+" ");

        System.out.print("\t\n");
    }

    @Override
    public int wizardChoice(int mana) {
        return 0;
    }

    @Override
    public void wizardsStatus(List<Wizard> wizards) {

    }

}





