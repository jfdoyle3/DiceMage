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
        int turnX=0;
        while (true) {
            wiz = wizards.get(wizIdxTurn);
            if(turnX==0)
                wiz.getDen().spawnMonster(3);

            if (wiz.getHealth() == 0)
                break;

            wiz.getCup().roll();
            wiz.addMana();

            checkForBonusMana();

            String output = wiz.getCup().displayCup();
            console.manaDice(output);

            console.statusBar(wiz.getName(), wiz.getHealth(), wiz.getPowerLevel(), wiz.getMana(),wiz.getDen().toString());
            while (true) {
                int choice = console.wizardChoice(wiz.getMana(), wiz.getDen().denSize());
                boolean turn = choiceDecision(wizards, wizIdxTurn, choice);
                if (!turn)
                    break;
            }
            wizIdxTurn++;
            turnX++;
            if (wizIdxTurn == wizardRosterSize)
                wizIdxTurn = 0;
        }
    }

    private void checkForBonusMana() {
        int bonusMana = wiz.getCup().group();
        if (bonusMana >= 3)
            wiz.bonusMana(bonusMana);
    }


    private boolean choiceDecision(List<Wizard> wizards, int wizNum, int choice) {
        boolean turn = true;
        switch (choice) {
            case 1 -> wizards.get(wizNum).incPower();
            case 2 -> System.out.println("spawn");
            case 3 -> System.out.println("Attack");
            case 4 -> console.wizardsStatus(wizards);
            case 5 -> turn = false;
            default -> System.out.println("Invalid Move");
        }
        return turn;
    }

    private void buyMonster(List<Wizard> wizards, int wizNum) {


        wizards.get(wizNum).getDen().spawnMonster(20);
    }
}
