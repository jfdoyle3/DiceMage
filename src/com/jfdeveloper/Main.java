package com.jfdeveloper;

import com.jfdeveloper.objects.Dice;
import com.jfdeveloper.objects.Die;
import com.jfdeveloper.objects.Monster;
import com.jfdeveloper.objects.Wizard;
import com.jfdeveloper.ui.Color;
import com.jfdeveloper.ui.Console;

import java.util.*;


public class Main {

    public static void main(String[] args) {

//       List<Die> diceSet= Dice.set(5,6);
//        Monster monster=new Monster();
//        monster.spawnMonster(3);
//        monster.spawnMonster(6);
//        monster.spawnMonster(10);
//        monster.spawnMonster(8);
//
//        monster.attack();
//        System.out.println(monster.toString());
//
//        Console.manaDice(diceSet);

        Wizard wiz=new Wizard("Gandalf");

        System.out.println(wiz.toString());

        List<String> hp=new ArrayList<>();
        List<String> mn=new ArrayList<>();
        List<String> pl=new ArrayList<>();

        String blip="  ";
        for (int i=0; i<wiz.getHealth(); i++)
            hp.add(blip);
        for (int i=0; i<wiz.getMana(); i++)
            mn.add(blip);
        for (int i=0; i<wiz.getPowerLevel(); i++)
            pl.add(blip);


            Console.statusBar(hp,pl,mn);
        System.out.println();
        System.out.println();
            mn.add(blip);
        mn.add(blip);
        mn.add(blip);
        pl.remove(5);

        Console.statusBar(hp,pl,mn);


    }
}
