//package com.jfdeveloper.ui;
//
//import com.jfdeveloper.actors.Wizard;
//import com.jfdeveloper.dice.Die;
//import com.jfdeveloper.game.Den;
//
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class ColorConsole implements WizardConsole {
//
//    private static final String RESET="\033[0m";
//    private static final String RED_BACKGROUND="\033[41m";
//    private static final String GREEN_BACKGROUND="\033[42m";
//    private static final String BLUE_BACKGROUND="\033[44m";
//    private static final String WHITE_BOLD_BRIGHT="\033[1;97m";
//
//    public void Dice(List<Die> dice) {
//        for(Die die : dice)
//        System.out.print(Color.BLUE + "["+die.getFaceUp()+"] " + Color.RESET);
//
//    }
//
//    public void manaDice(String dieFaces) {
//        char unsortedDieFaces[] = dieFaces.toCharArray();
//        Arrays.sort(unsortedDieFaces);
//        System.out.println(Color.BLUE);
//        StringBuilder dice = new StringBuilder();
//        StringBuilder part1 = new StringBuilder();
//        StringBuilder part2 = new StringBuilder();
//        StringBuilder part3 = new StringBuilder();
//        for (char dieFace : unsortedDieFaces) {
//            part1.append(BLUE_BACKGROUND).append("     ")
//                    .append(RESET).append(" ");
//
//            part2.append(BLUE_BACKGROUND).append("  ")
//                    .append(WHITE_BOLD_BRIGHT).append(dieFace)
//                    .append(BLUE_BACKGROUND).append("  ")
//                    .append(RESET).append(" ");
//
//            part3.append(BLUE_BACKGROUND).append("     ")
//                    .append(RESET).append(" ");
//        }
//        part1.append("\n");
//        part2.append("\n");
//        part3.append("\n");
//        dice.append(part1).append(part2).append(part3);
//        System.out.println(dice);
//        System.out.println(RESET);
//    }
//
////    public void statusBar(String name,int health, int power, int mana, Lis) {
////        System.out.printf("Name: %s\nHealth: %d\tPower level: %d\tMana: %d\n",name, health, power, mana);
////    }
//
//
//    public void statusBar(String name, int hitPoints, int powerLvl, int manaPoints, Den den) {
//        System.out.println("Wizard: "+name);
//            for(int hp=0; hp<hitPoints; hp++)
//                System.out.print(Color.RED + "???"+RESET);
//
//        System.out.print("\t");
//
//        for(int pl=0; pl<powerLvl; pl++)
//            System.out.print(Color.GREEN + "???"+RESET);
//
//        System.out.print("\t");
//
//        for(int mana=0; mana<manaPoints; mana++)
//            System.out.print(Color.BLUE + "???"+RESET);
//
//        System.out.print("\t\n");
//    }
//
//
//
//    @Override
//    public int wizardChoice(int mana, int denSize) {
//        List<String> choices = new ArrayList<>(Arrays.asList("Increase Power Level", "Spawn Monster", "Check Status", "End Turn"));
//        System.out.println();
//        int idx = 0;
//        if (mana < 3)
//            idx = 2;
//        for (int i = idx; i < choices.size(); i++)
//            System.out.printf("%d) %s\n", i + 1, choices.get(i));
//
//        System.out.println("What say you?");
//        return Input.inputNumber();
//    }
//
//    @Override
//    public void wizardsStatus(List<Wizard> wizards) {
//
//    }
//
//    @Override
//    public void buyMonster(int mana, int denSize) {
//
//    }
//
//}
//
//
//
//
//
