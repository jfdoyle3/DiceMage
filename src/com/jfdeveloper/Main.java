package com.jfdeveloper;

import com.jfdeveloper.objects.Die;
import com.jfdeveloper.ui.Console;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        String[][] dice = new String[][]{
                {"* * * * *", // Die 1 -> this line is dice[0][0]
                        "*       *",
                        "*   #   *",
                        "*       *",
                        "* * * * *"
                },
                {"* * * * *", // Die 2
                        "*    #  *",
                        "*       *",
                        "*  #    *",
                        "* * * * *"
                }
        };

        List<Die> diceSet=new ArrayList<>();
        Die die= new Die(6);
        diceSet.add(die);
        diceSet.add(die);
        diceSet.add(die);
        diceSet.add(die);

        for(Die item : diceSet){
           Console.dieDisplay(item.getFaceUp());
        }

        int roll1 = 1; // Two made
        int roll2 = 1; // up numbers
/* Note that the index will be one off from the reflected number.
You may want to subtract 1 from your random number or put a blank die at index 0
*/

        for(int x=0; x<dice[roll1].length; x++){
            System.out.println(dice[roll1][x] + "\t" + dice[roll2][x]);
        }



    }
}
