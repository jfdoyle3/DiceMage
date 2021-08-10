package com.jfdeveloper.game;

import com.jfdeveloper.actors.Wizard;
import com.jfdeveloper.ui.BWConsole;

import com.jfdeveloper.ui.WizardConsole;


import java.util.List;

public class Turn {

    private Wizard wiz;
    private WizardConsole console = new BWConsole();
    // private List<Wizard> wizards;

    public void turn(List<Wizard> wizards) {

        int wizardRosterSize = wizards.size();
        int wizIdxTurn = 0;

        while (true) {
            wiz = wizards.get(wizIdxTurn);
            if (wiz.getHealth() == 0)
                break;

            wiz.getCup().roll();
            wiz.addMana();

            checkForBonusMana();

            String output = wiz.getCup().displayCup();
            console.manaDice(output);

            dashBoard();
            while (true) {
                int choice = console.wizardChoice(wiz.getMana(), wiz.getDen().denSize());
                boolean turn = choiceDecision(wizards, wizIdxTurn, choice);
                if (!turn)
                    break;
            }
            wizIdxTurn++;

            if (wizIdxTurn == wizardRosterSize)
                wizIdxTurn = 0;
        }
    }

    private void dashBoard() {
        console.statusBar(wiz.getName(), wiz.getHealth(), wiz.getPowerLevel(), wiz.getMana());
        wiz.getDen().displayDen();
    }


    private void checkForBonusMana() {
        int bonusMana = wiz.getCup().group();
        if (bonusMana >= 3)
            wiz.bonusMana(bonusMana);
    }


    private boolean choiceDecision(List<Wizard> wizards, int wizNum, int choice) {
        boolean turn = true;
        int oppWiz=0;
        switch (choice) {
            case 1 -> wizards.get(wizNum).incPower();
            case 2 -> buyMonster();
            case 3 -> {

                monsterAttack(wizards.get(0),wizards.get(1));
            }
            case 4 -> console.wizardsStatus(wizards);
            case 5 -> turn = false;
            default -> System.out.println("Invalid Move");
        }
        return turn;
    }

    private void buyMonster() {
        int monsterDie=console.buyMonster(wiz.getMana(),wiz.getDen().denSize());
        wiz.getDen().spawnMonster(monsterDie);
        wiz.removeMana(3+monsterDie);

    }

    private void monsterAttack(Wizard wiz1, Wizard wiz2) {
        System.out.println("roll: ");
        if (wiz2.getDen().denSize() == 0) {
            wiz2.dmgHealth();
            return;
        }
        System.out.println("den1: "+wiz1.getDen().denSize());
        System.out.println("den2: "+wiz2.getDen().denSize());
        wiz1.getDen().denAction().get(0).getMonster().roll();
        wiz2.getDen().denAction().get(0).getMonster().roll();

        int wiz1Attack = wiz1.getDen().denAction().get(0).getMonster().getFaceUp();
        int wiz2Attack = wiz2.getDen().denAction().get(0).getMonster().getFaceUp();


        System.out.println("\nG");
        wiz1.getDen().displayDen();
        System.out.println("\nM");
        wiz2.getDen().displayDen();

            if (wiz1Attack == wiz2Attack) {
                System.out.println("Tie: both die");
                wiz1.getDen().removeMonster(0);
                wiz2.getDen().removeMonster(0);
            } else {
                if (wiz1Attack > wiz2Attack) {
                    System.out.println("\nwiz1 Wins");
                    wiz2.getDen().removeMonster(0);
                } else {
                    System.out.println("\nwiz2 Wins");
                    wiz1.getDen().removeMonster(0);
                }
            }
        }


}
