package com.jfdeveloper.ui;

public class Console {

    public static void dieDisplay(int value) {
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

        public static void wizardBar(int health, int power, int mana){
            System.out.printf("Health: %d\tPower level: %d\tMana: %d",health,power,mana);
        }






}



