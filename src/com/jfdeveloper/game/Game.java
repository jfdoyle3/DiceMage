package com.jfdeveloper.game;

import com.jfdeveloper.actors.Monster;
import com.jfdeveloper.actors.Wizard;
import com.jfdeveloper.ui.*;

import java.util.ArrayList;
import java.util.List;


public class Game {

    private Wizard wiz;
    //    private int wizards = 2;
    private WizardConsole console = new BWConsole();
    private int choice;
    private boolean turn;
    private List<Wizard> wizards = new ArrayList<>();


    public Game() {

           initWizards();
    }

    public void play() {

        Turn turn = new Turn();
        turn.turn(wizards);
        System.out.println("game over");

    }

    private void initWizards() {
//        System.out.println("How many Wizards?");
//        int players = Input.inputNumber();
        for (int i = 0; i < 2; i++) {
            System.out.println("What is your name?");
            wizards.add(new Wizard((Input.inputString()).trim()));
        }
    }

    public void testBuy() {

    }

    public void testWiz() {
        Wizard attacker = new Wizard("Attacker");
        Wizard defender = new Wizard("Defender");


        // TODO: spawn monsters into den
        attacker.getDen().spawnMonster(20);
        attacker.getDen().spawnMonster(20);

        defender.getDen().spawnMonster(20);
        defender.getDen().spawnMonster(20);

        // TODO: Display Dens
        display(attacker, defender);
//        System.out.println("\n\nis Den Empty");
//        System.out.println("Attacker: " + attacker.getDen().isEmpty() + "\nDefender: " + defender.getDen().isEmpty());

        // TODO: Get size of both dens
        int denSizeAttacker = attacker.getDen().denSize();
        int denSizeDefender = defender.getDen().denSize();

        // TODO: Get Den List
        List<Monster> monsterAttack = attacker.getDen().denAction();
        List<Monster> monsterDefend = defender.getDen().denAction();

        // TODO: Attack rolls
        int idx = 0;
        while (!monsterAttack.isEmpty()) {
            System.out.println("Round: "+idx);

            display(attacker,defender);
            if (defender.getDen().isEmpty()) {
                System.out.println("no more");
                break;
//            for(int monster=0; monster<denSizeAttacker; monster++) {
//                attacker.getDen().denAction().get(monster).getMonster().roll();
                //  defender.dmgHealth();
                //   }
            } else {

                System.out.println("defender has monsters.");
            }
        }
        //    attacker.getDen().denAction().get(0).getMonster().roll();
        //  defender.getDen().denAction().get(0).getMonster().roll();

        // TODO: get attack results

        //  int attack = attacker.getDen().denAction().get(0).getMonster().getFaceUp();
        //    int defend=defender.getDen().denAction().get(0).getMonster().getFaceUp();

        //TODO: display dens - show new rolls
        display(attacker, defender);

        //TODO: determine who won
        System.out.println("\n-------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------");
//        if(defend>attack)
//            System.out.println("\nDefender Wins");
//
//        else
//            System.out.println("\nAttacker Wins");

    }

    private void display(Wizard attacker, Wizard defender) {
        System.out.println("-----------------------------------------------");
        System.out.println("Attacker");
        System.out.println(attacker);
        attacker.getDen().displayDen();
        System.out.println("\n-----------------------------------------------");
        System.out.println("Defender");
        System.out.println(defender);
        defender.getDen().displayDen();
        System.out.println("\n-----------------------------------------------");
        System.out.println("-----------------------------------------------");
    }

}
