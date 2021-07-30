package com.jfdeveloper.objects;

import com.jfdeveloper.objects.Die;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Dice {
    private static List<Die> diceSet;
    private static TreeMap<Integer,Integer> groupDice;

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

    public static Map<Integer,Long> group(List<Integer> dice) {
        Map<Integer, Long> freq = dice.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("freq:: " + freq);
        return freq;
    }

}
