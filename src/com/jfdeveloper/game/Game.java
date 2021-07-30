package com.jfdeveloper.game;

import com.jfdeveloper.objects.Wizard;
import com.jfdeveloper.ui.Console;

import java.util.Scanner;

public class Game {

    private Wizard wiz;


    public Game() {
        System.out.println("How many Wizards?");
        int wizards= Input.inputNumber();
        for(int i=0; i<wizards; i++){
        System.out.println("What is your name?");
        wiz = new Wizard((Input.inputString()).trim());
    }

}
