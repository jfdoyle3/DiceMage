package com.jfdeveloper.ui;

import com.jfdeveloper.actors.Wizard;
import com.jfdeveloper.dice.Die;
import com.jfdeveloper.objects.Den;

import java.util.*;

public class BWConsole implements WizardConsole {

    public void statusBar(String name, int health, int power, int mana, String den) {
        System.out.printf("\nWizard: %s\nHealth: %d\tPower level: %d\tMana: %d\n", name, health, power, mana);
        System.out.printf("\nDen: ",den);
    }

    public void wizardsStatus(List<Wizard> wizards) {
        for(Wizard wizard : wizards)
            System.out.printf("\n\nWizard: %s\nHealth: %d\tPower level: %d\tMana: %d\n", wizard.getName(),wizard.getHealth(),wizard.getPowerLevel(),wizard.getMana());

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
       turnOptions.append(choices.get(3)+"\n"+choices.get(4));
        System.out.println();
        if(mana > 6 && denSize>0)
            System.out.println(optionList.append(choices.get(0)+"\n").append(choices.get(1)+"\n").append(choices.get(2)+"\n").append(turnOptions));
        if(mana>6 && denSize<=0)
            System.out.println(optionList.append(choices.get(0)+"\n").append(choices.get(1)+"\n").append(turnOptions));
        if(mana > 3 && denSize<=0)
            System.out.println(optionList.append(choices.get(0)+"\n").append(turnOptions));

        if (mana < 3 && denSize>0)
            System.out.println(optionList.append(choices.get(2)+"\n").append(turnOptions));

        if(mana<3 && denSize<=0)
            System.out.println(turnOptions);



        System.out.println("What say you?");
        return Input.inputNumber();
    }

    public void buyMonster(int mana,int denSize){
        System.out.println("Buy Monster: ");
        int dieSize=Math.abs(mana-denSize-3);
        int price=3+dieSize+denSize;
        int minDie=3;
        int maxDie=10;
        System.out.println("you can get die: "+minDie+" - "+dieSize);
        System.out.printf("\n\ndenSize:  %d\ndieSize: %d\nmana: %d\n---------\nprice: %d",denSize,dieSize,mana,price);
    }
}

