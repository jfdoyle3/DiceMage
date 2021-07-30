package com.jfdeveloper.game;

import com.jfdeveloper.objects.Wizard;
import com.jfdeveloper.ui.Input;

public class Game {

    private Wizard wiz;
    private int wizards = 2;

    public Game() {
//        System.out.println("How many Wizards?");
//        int wizards = Input.inputNumber();
        for (int i = 0; i < wizards; i++) {
            System.out.println("What is your name?");
            wiz = new Wizard((Input.inputString()).trim());
        }
    }

    public void play(){

    }

}
