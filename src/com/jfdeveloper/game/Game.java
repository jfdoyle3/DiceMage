package com.jfdeveloper.game;

import com.jfdeveloper.actors.Wizard;
import com.jfdeveloper.ui.*;

import java.util.ArrayList;
import java.util.List;


public class Game{

    private Wizard wiz;
//    private int wizards = 2;
    private WizardConsole console = new BWConsole();
    private int choice;
    private boolean turn;
    private List<Wizard> wizards=new ArrayList<>();


    public Game() {


    //   initWizards();
    }

    public void play() {

        Turn turn=new Turn();
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

    public void testBuy(){

    }
    public void testWiz(){
        Wizard g=new Wizard("G");
        Wizard m=new Wizard("M");

        // TODO: spawn monsters into den
    //    g.getDen().spawnMonster(20);
        m.getDen().spawnMonster(20);
    //    g.getDen().spawnMonster(20);
        m.getDen().spawnMonster(20);

        // TODO: Display Dens
        System.out.println("G");
        g.getDen().displayDen();
        System.out.println();
        System.out.println("M");
        m.getDen().displayDen();
        System.out.println();
        System.out.println("\ng: "+g.getDen().isEmpty()+"\nm: "+m.getDen().isEmpty());
        // TODO: Attack rolls
        int maxSize=0;
//        if(g.getDen().isEmpty())
        
        m.getDen().denAction().get(0).getMonster().roll();
        g.getDen().denAction().get(0).getMonster().roll();

        // TODO: get attack results
        int mAttack=m.getDen().denAction().get(0).getMonster().getFaceUp();
        int gAttack=g.getDen().denAction().get(0).getMonster().getFaceUp();

        //TODO: display dens - show new rolls
        System.out.println("\nG");
        g.getDen().displayDen();
        System.out.println("\nM");
        m.getDen().displayDen();

        //TODO: determine who won
        if(mAttack>gAttack)
            System.out.println("\nM Wins");

        else
            System.out.println("\nG Wins");

    }

}
