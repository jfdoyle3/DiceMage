package com.jfdeveloper.game;

import com.jfdeveloper.actors.Wizard;


public class Game {

    private Wizard wiz;
    private int wizards = 2;

    public Game() {
//        System.out.println("How many Wizards?");
//        int wizards = Input.inputNumber();
//        for (int i = 0; i < wizards; i++) {
//            System.out.println("What is your name?");
//            wiz = new Wizard((Input.inputString()).trim());
             wiz=new Wizard("Gandalf");
 //       }
    }

    public void play(){


        wiz.getCup().roll();
        System.out.println(wiz.getCup().displayCup());

        System.out.println(wiz.toString());

        wiz.addMana();
        wiz.addMana();
        wiz.addMana();
        wiz.addMana();

        wiz.getCup().roll();
        System.out.println(wiz.getCup().displayCup());

        System.out.println(wiz.toString());

        wiz.incPower();
        wiz.spawnMonster(3,3);

        wiz.getCup().roll();
        System.out.println(wiz.getCup().displayCup());

        System.out.println(wiz.toString());
    }

}
