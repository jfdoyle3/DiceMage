package com.jfdeveloper.game;

import com.jfdeveloper.actors.Wizard;
import com.jfdeveloper.dice.Cup;
import com.jfdeveloper.ui.BWConsole;
import com.jfdeveloper.ui.ColorConsole;
import com.jfdeveloper.ui.Console;
import com.jfdeveloper.ui.Dbug;


import java.util.List;

public class Turn {
    
    private Wizard wiz;
    private Console console = new BWConsole();
    // private List<Wizard> wizards;

    public void turn(List<Wizard> wizards) {

        int wizardRosterSize = wizards.size();
        int wizIdxTurn = 0;

        while (true) {
            wiz = wizards.get(wizIdxTurn);
            if (wiz.getHealth() == 0)
                break;
            wiz.addMana();
            wiz.getCup().roll();
           // System.out.println(wiz.getCup().displayCup());
            console.statusBar(wiz.getName(), wiz.getHealth(), wiz.getPowerLevel(), wiz.getMana());
            while (true) {
                int choice = console.wizardChoice(wiz.getMana());
                boolean turn = choiceDecision(wizards, wizIdxTurn, choice);
                if (!turn)
                    break;
            }
            wizIdxTurn++;
            if (wizIdxTurn == wizardRosterSize)
                wizIdxTurn = 0;
        }


    }

    private boolean choiceDecision(List<Wizard> wizards,int wizNum, int choice) {
        boolean turn = true;
        switch (choice) {
            case 1 -> wizards.get(wizNum).incPower();
            case 2 -> System.out.println("spawn");
            case 3 -> console.wizardsStatus(wizards);
            case 4 -> turn = false;
            default -> System.out.println("Invalid Move");
        }
        return turn;
    }

    private void buyMonster(List<Wizard> wizards,int wizNum){


        wizards.get(wizNum).getDen().spawnMonster(20);
    }
}
