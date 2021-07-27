package com.jfdeveloper.ui;

import com.jfdeveloper.objects.Die;

import java.util.ArrayList;
import java.util.List;

public class DisplayDie {

    private int value;

    public DisplayDie(int value) {
        this.value = value;
    }
    public static void dieDsp() {
        String[][] diceLg = new String[][]{
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
        String[][] dice = new String[][]{
                {"-----",
                        "| 1 |",
                        "-----"
                },
                {"-----",
                        "| 2 |",
                        "-----"
                }
        };

        List<Die> diceSet = new ArrayList<>();
        Die die = new Die(6);
        diceSet.add(die);
        diceSet.add(die);
        diceSet.add(die);
        diceSet.add(die);

        for (Die item : diceSet) {
            Console.dieDisplayLg(item.getFaceUp());
        }
    }
    public static void diceDspy(String[][] dice) {
        int roll1 = 1; // Two made
        int roll2 = 1; // up numbers
/* Note that the index will be one off from the reflected number.
You may want to subtract 1 from your random number or put a blank die at index 0
*/

        for (int x = 0; x < dice[roll1].length; x++) {
            System.out.println(dice[roll1][x] + "\t" + dice[roll2][x]);
        }
        String[][] diceLg = new String[][]{
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
        String[][] dice2 = new String[][]{
                {"-----",
                        "| 1 |",
                        "-----"
                },
                {"-----",
                        "| 2 |",
                        "-----"
                }
        };

        List<Die> diceSet = new ArrayList<>();
        Die die = new Die(6);
        diceSet.add(die);
        diceSet.add(die);
        diceSet.add(die);
        diceSet.add(die);

        for (Die item : diceSet) {
            Console.dieDisplayLg(item.getFaceUp());
        }

         roll1 = 1; // Two made
         roll2 = 1; // up numbers
/* Note that the index will be one off from the reflected number.
You may want to subtract 1 from your random number or put a blank die at index 0
*/

        for (int x = 0; x < dice[roll1].length; x++) {
            System.out.println(dice[roll1][x] + "\t" + dice[roll2][x]);
        }
    }
}
