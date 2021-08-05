package com.jfdeveloper.game;

import com.jfdeveloper.actors.Wizard;
import com.jfdeveloper.dice.Dice;
import com.jfdeveloper.dice.Die;
import com.jfdeveloper.ui.BWConsole;
import com.jfdeveloper.ui.Console;
import com.jfdeveloper.ui.Dbug;

import java.util.List;


public class Game<choiceDecision> {

    private Wizard wiz;
    private int wizards = 2;
    private Console console = new BWConsole();
    private int choice;
    private boolean turn;


    public Game() {
//        System.out.println("How many Wizards?");
//        int wizards = Input.inputNumber();
//        for (int i = 0; i < wizards; i++) {
//            System.out.println("What is your name?");
//            wiz = new Wizard((Input.inputString()).trim());
        wiz = new Wizard("Gandalf");
        //       }
    }

    public void play() {


        wiz.addMana();
        wiz.addMana();
        wiz.addMana();
        wiz.addMana();
        wiz.getCup().roll();
        System.out.println(wiz.getCup().displayCup());
        console.statusBar(wiz.getName(), wiz.getHealth(), wiz.getPowerLevel(), wiz.getMana());
        while(true) {
            int choice = console.wizardChoice(wiz.getMana());
            boolean turn=choiceDecision(choice);
            if (!turn)
                break;
        }



    }

    public boolean choiceDecision(int choice) {
        boolean turn=true;
        switch (choice) {
            case 1 -> wiz.incPower();
            case 2 -> wiz.spawnMonster(3, 3);
            case 3 -> console.statusBar(wiz.getName(), wiz.getHealth(), wiz.getPowerLevel(), wiz.getMana());
            case 4 -> turn = false;
            default -> System.out.println("Invalid Move");
        }
        return turn;
    }

}
