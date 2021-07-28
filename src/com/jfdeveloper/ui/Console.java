package com.jfdeveloper.ui;

import com.jfdeveloper.objects.Die;

import java.util.List;

public class Console {

    public static void dieDisplayLg(int value) {
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
    }

    public static void disDisplaySm() {
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
    }


    public static void wizardBar(int health, int power, int mana) {
        System.out.printf("Health: %d\tPower level: %d\tMana: %d", health, power, mana);
    }

    public static void manaDice(List<Die> dice) {

        System.out.println(Color.BLUE+dice.toString()+Color.RESET);

    }
    public static void hpBar(List<String> hitPoints){

        System.out.println(Color.RED_BOLD_BRIGHT+hitPoints.toString()+Color.RESET);

    }

}





