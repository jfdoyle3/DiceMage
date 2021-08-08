package com.jfdeveloper.dice;

import com.jfdeveloper.ui.Dbug;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
// TODO: fix dice
public class Dice {
    private static List<Die> diceSet;
    private static TreeMap<Integer, Integer> groupDice;

    public static List<Die> set(int quantity, int faces) {
        diceSet = new ArrayList<>();
        for (int idx = 0; idx < quantity; idx++)
            diceSet.add(new Die(faces));
        return diceSet;
    }

    public static void roll(int dieNumber) {
        Die rollDie = diceSet.get(dieNumber);
        rollDie.roll();
    }

    public static void rollDice(List<Die> dice) {
        for (int idx = 0; idx < dice.size(); idx++) {
            roll(idx);
        }
    }

    public static List<Integer> scoreDice(List<Die> dice) {
        List<Integer> diceList = new ArrayList<>();
        for (Die die : dice) {
            diceList.add(die.getFaceUp());
        }
        return diceList;
    }

    public static TreeMap<Integer, Integer> group(List<Integer> dice) {
        for (int die : dice) {
            if (!groupDice.containsKey(die))
                groupDice.put(die, 0);

            groupDice.put(die, groupDice.get(die) + 1);
        }
        for(Map.Entry<Integer,Integer> entry : groupDice.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            Dbug.dbug("key: ",key);
            Dbug.dbug("value: ", value);
            }
        return groupDice;
    }

}
