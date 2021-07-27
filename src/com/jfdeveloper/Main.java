package com.jfdeveloper;

import com.jfdeveloper.objects.Dice;
import com.jfdeveloper.objects.Die;
import com.jfdeveloper.ui.Console;

import java.util.*;


public class Main {

    public static void main(String[] args) {

       List<Die> diceSet= Dice.set(5,6);

        System.out.println(diceSet.toString());




    }
}
