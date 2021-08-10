package com.jfdeveloper.ui;

import com.jfdeveloper.actors.Wizard;

import java.util.*;

public class BWConsole implements WizardConsole {

    public void statusBar(String name, int health, int power, int mana) {
        System.out.printf("\nWizard: %s\nHealth: %d\tPower level: %d\tMana: %d\n", name, health, power, mana);
    }

    public void wizardsStatus(List<Wizard> wizards) {
        for(Wizard wizard : wizards) {
            System.out.printf("\n\nWizard: %s\nHealth: %d\tPower level: %d\tMana: %d\n", wizard.getName(), wizard.getHealth(), wizard.getPowerLevel(), wizard.getMana());
            wizard.getDen().displayDen();
        }
    }

    public void manaDice(String dieFaces) {
        char unsortedDieFaces[] = dieFaces.toCharArray();
        Arrays.sort(unsortedDieFaces);
        for (char dieFace : unsortedDieFaces)
            System.out.print("[" + dieFace + "] ");
    }

    public int wizardChoice(int mana, int denSize) {
        StringBuilder optionList=new StringBuilder();
        StringBuilder turnOptions=new StringBuilder();
      //  LinkedHashMap<Integer,String> options=new LinkedHashMap<>();
        List<String> choices = new ArrayList<>(Arrays.asList("1) Increase Power Level", "2) Spawn Monster","3) Attack", "4) Check Status", "5) End Turn"));
//        for (int idx=0; idx<choices.size(); idx++ ) {
//            if (!options.containsKey(idx+1))
//                options.put(idx+1, choices.get(idx));
//        }
//
//        for(Map.Entry<Integer,String> entry : options.entrySet()){
//            int key=entry.getKey();
//            String value=entry.getValue();
//            Dbug.dbug("key: ",key);
//            Dbug.dbug("value: ", value);
//        }
//       turnOptions.append(choices.get(3)+"\n"+choices.get(4));
//        System.out.println();
//        if(mana > 6 && denSize>0)
//            System.out.println(optionList.append(choices.get(0)+"\n").append(choices.get(1)+"\n").append(choices.get(2)+"\n").append(turnOptions));
//        if(mana>6 && denSize<=0)
//            System.out.println(optionList.append(choices.get(0)+"\n").append(choices.get(1)+"\n").append(turnOptions));
//        if(mana > 3 && denSize<=0)
//            System.out.println(optionList.append(choices.get(0)+"\n").append(turnOptions));
//
//        if (mana < 3 && denSize>0)
//            System.out.println(optionList.append(choices.get(2)+"\n").append(turnOptions));
//
//        if(mana<3 && denSize<=0)
//            System.out.println(turnOptions);
        System.out.println("\n");
        for(String choice : choices)
            System.out.println(choice);

        System.out.println("What is your choice?");
        return Input.inputNumber();
    }

    public int buyMonster(int mana, int denSize){
        System.out.println("Buy Monster: ");
        int dieSize=Math.abs(mana-denSize-3);
        int minDie=3;
        int maxDie=10;
        if(dieSize<3)
            dieSize=minDie;
       if(dieSize>10)
           dieSize=maxDie;

        System.out.println("you can get die: "+minDie+" - "+dieSize);
        int buy=Input.inputNumber();
        int bought=buy+denSize;
        return bought;
    }
}

