package com.jfdeveloper.dice;

import com.jfdeveloper.ui.Dbug;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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

    public void groupDisplay(List<Die> dice2) {
        for (Die die : dice2) {
            if (!groupDice.containsKey(die))
                groupDice.put(die.getFaceUp(), 0);

            groupDice.put(die.getFaceUp(), groupDice.get(die) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : groupDice.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            Dbug.dbug("key: ",key);
            Dbug.dbug("value: ", value);
        }
    }

}