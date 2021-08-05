package com.jfdeveloper.ui;

import com.jfdeveloper.actors.Monster;
import com.jfdeveloper.dice.Dice;
import com.jfdeveloper.dice.Die;


import java.util.Collections;
import java.util.List;

public class ColorConsole implements Console {


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
            part1.append(Color.BLUE_BACKGROUND).append("     ")
                    .append(Color.RESET).append(" ");

            part2.append(Color.BLUE_BACKGROUND).append("  ")
                    .append(Color.WHITE_BOLD_BRIGHT).append(die.getFaceUp())
                    .append(Color.BLUE_BACKGROUND).append("  ")
                    .append(Color.RESET).append(" ");

            part3.append(Color.BLUE_BACKGROUND).append("     ")
                    .append(Color.RESET).append(" ");
        }
        part1.append("\n");
        part2.append("\n");
        part3.append("\n");
        dice.append(part1).append(part2).append(part3);
        System.out.println(dice);
        System.out.println(Color.RESET);
    }

//    public void statusBar(String name,int health, int power, int mana, Lis) {
//        System.out.printf("Name: %s\nHealth: %d\tPower level: %d\tMana: %d\n",name, health, power, mana);
//    }

    public void statusBar(String name,int hitPoints, int powerLvl,int manaPoints) {
        System.out.println("Wizard: "+name);
            for(int hp=0; hp<hitPoints; hp++)
                System.out.print(Color.RED_BACKGROUND + " "+Color.RESET+" ");

        System.out.print("\t");

        for(int pl=0; pl<powerLvl; pl++)
            System.out.print(Color.GREEN_BACKGROUND + " "+Color.RESET+" ");

        System.out.print("\t");

        for(int mana=0; mana<manaPoints; mana++)
            System.out.print(Color.BLUE_BACKGROUND + " "+Color.RESET+" ");

        System.out.print("\t\n");
    }

    @Override
    public int wizardChoice(int mana) {
        return 0;
    }

    public void wizardChoice(){}

}





