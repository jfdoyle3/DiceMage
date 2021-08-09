package com.jfdeveloper.dice;

import java.util.*;

public class Cup {

    private static List<Die> dice = new ArrayList<>();
    private static TreeMap<Integer, Integer> groupDice;

    // TODO: fix dice
    public Cup() {
        while (dice.size() < 5) {
            dice.add(new Die());
        }
    }

    public Cup(int number) {
        while (dice.size() < number) {
            dice.add(new Die());
        }
    }

    public void roll() {
        for (Die die : dice) {
            die.roll();
        }
    }

    public void addDice(int die) {
        for (int i = 0; i < die; i++)
            dice.add(new Die());
    }

    public void roll(int selection) {
        dice.get(selection).roll();
    }

    public void roll(List<Integer> selections) {
        for (int selection : selections) {
            roll(selection);
        }
    }




    public String displayCup(){
        StringBuilder dieOutput=new StringBuilder();
        for (Die die : dice) {
            dieOutput.append(die.getFaceUp());
        }
        return dieOutput.toString();
    }

    public static List<Die> getDice() {
        return dice;
    }

    public static TreeMap<Integer, Integer> getGroupDice() {
        return groupDice;
    }

    public List<Integer> parseSelections(String input) {
        String[] inputArr = input.split(" "); // ["1", "2", "5"]
        // String[] -> List<Integer>
        List<Integer> selections = new ArrayList<>();
        for (String number : inputArr) {
            selections.add(Integer.parseInt(number) - 1);
        }
        return selections;
    }

    public int group() {
        groupDice = new TreeMap<>();
        for (Die die : dice) {
            if (!groupDice.containsKey(die.getFaceUp()))
                groupDice.put(die.getFaceUp(), 0);

            groupDice.put(die.getFaceUp(), groupDice.get(die.getFaceUp()) + 1);
      //      System.out.printf("%d ", die.getFaceUp());
        }
//        System.out.println();
//
//        for (Map.Entry<Integer, Integer> entry : groupDice.entrySet()) {
//            int key = entry.getKey();
//            int value = entry.getValue();
//            System.out.printf("K: %d  = %d | ",key,value);
//           // System.out.println();
//        }
//        System.out.println();
//        Dbug.dbug("max:",Collections.max(groupDice.values()));

        /* TODO: Move the current return value into method
                iterate through map and make a List of all
                multiple die instances.
        */
        return Collections.max(groupDice.values());
    }

}