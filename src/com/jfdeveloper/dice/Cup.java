package com.jfdeveloper.dice;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Cup {
    private static List<Die> dice = new ArrayList<>();
    private static TreeMap<Integer, Integer> groupDice;
    // TODO: fix dice
    public Cup() {
        while(dice.size() < 5) {
            dice.add(new Die());
        }
    }
    public Cup(int number) {
        while(dice.size() < number) {
            dice.add(new Die());
        }
    }

    public void roll() {
        for (Die die : dice) {
            die.roll();
        }
    }

    public void addDice(int die){
        for(int i=0; i<die; i++)
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

    public String displayCup() {
        String output = "";
        for (Die die : dice) {
            output += die.getFaceUp() + " ";
        }
        return output.trim();
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

    public static TreeMap<Integer, Integer> group() {
        for (Die die : dice) {
            if (!groupDice.containsKey(die))
                groupDice.put(die.getFaceUp(), 0);

            groupDice.put(die.getFaceUp(), groupDice.get(die) + 1);
        }

        return groupDice;
    }

}