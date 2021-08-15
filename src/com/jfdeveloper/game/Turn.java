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
            if (wizards.get(wizIdxTurn).getHealth() == 0){
                for(Wizard wizWon : wizards){
                    if(wizWon.getHealth()>0)
                    System.out.println("Wizard: "+wizWon.getName()+" won!");
                }
                break;
            }


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
            System.out.println("Bonus Mana: "+(bonusMana-2));
            wiz.bonusMana(bonusMana);
    }


    private boolean choiceDecision(List<Wizard> wizards, int wizNum, int choice) {
        boolean turn = true;
        int oppWiz=0;
        if (choice==1 || choice==2 && wizards.get(wizNum).getMana()<3)
            choice=6;
        if(choice==3 && wizards.get(wizNum).getDen().isEmpty()){
            choice=6;
        }
        switch (choice) {
            case 1 -> wizards.get(wizNum).incPower();
            case 2 -> buyMonster();
            case 3 -> {
                if(wizNum==0)
                    oppWiz=1;
                monsterAttack(wizards.get(wizNum),wizards.get(oppWiz));
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
        for (int idx = 0; idx < wiz1.getDen().denSize(); idx++) {
            if (wiz2.getDen().denSize() == 0) {
                wiz2.dmgHealth();
                return;
            }
            System.out.println("den1: " + wiz1.getDen().denSize());
            System.out.println("den2: " + wiz2.getDen().denSize());

            wiz1.getDen().denAction().get(idx).getMonster().roll();
            wiz2.getDen().denAction().get(idx).getMonster().roll();

            int wiz1Attack = wiz1.getDen().denAction().get(idx).getMonster().getFaceUp();
            int wiz2Attack = wiz2.getDen().denAction().get(idx).getMonster().getFaceUp();


            System.out.println("\nG");
            wiz1.getDen().displayDen();
            System.out.println("\nM");
            wiz2.getDen().displayDen();

            if (wiz1Attack == wiz2Attack) {
                System.out.println("Tie: both die");
                wiz1.getDen().removeMonster(idx);
                wiz2.getDen().removeMonster(idx);
            } else {
                if (wiz1Attack > wiz2Attack) {
                    System.out.println("\nwiz1 Wins");
                    wiz2.getDen().removeMonster(idx);
                } else {
                    System.out.println("\nwiz2 Wins");
                    wiz1.getDen().removeMonster(idx);
                }
            }
        }
    }

}
