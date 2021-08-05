package com.jfdeveloper.game;

import com.jfdeveloper.actors.Wizard;
import com.jfdeveloper.dice.Dice;
import com.jfdeveloper.dice.Die;
import com.jfdeveloper.ui.BWConsole;
import com.jfdeveloper.ui.Console;
import com.jfdeveloper.ui.Dbug;
import com.jfdeveloper.ui.Input;

import java.util.ArrayList;
import java.util.List;


public class Game{

    private Wizard wiz;
//    private int wizards = 2;
    private Console console = new BWConsole();
    private int choice;
    private boolean turn;
    private List<Wizard> wizards=new ArrayList<>();


    public Game() {
        System.out.println("How many Wizards?");
        int players = Input.inputNumber();
        for (int i = 0; i < players; i++) {
            System.out.println("What is your name?");
            wizards.add(new Wizard((Input.inputString()).trim()));
        }
    }

    public void play() {

        Turn turn=new Turn();
        turn.turn(wizards);
        System.out.println("game over");

    }


}
