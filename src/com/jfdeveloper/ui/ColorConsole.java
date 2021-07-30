package com.jfdeveloper.ui;

import com.jfdeveloper.objects.Die;

import java.util.List;

public class ColorConsole {


    public static void manaDice(List<Die> dice) {
        for(Die die : dice)
        System.out.print(Color.BLUE + "["+die.getFaceUp()+"] " + Color.RESET);

    }

    public static void statusBar(List<String> hitPoints, List<String> powerLvl,List<String> manaPoints) {
            for(String point : hitPoints){
                System.out.print(Color.RED_BACKGROUND + point+Color.RESET+" ");
            }
        System.out.print("\t");

        for(String point : powerLvl){
            System.out.print(Color.GREEN_BACKGROUND + point+Color.RESET+" ");
        }
        System.out.print("\t");

        for(String point : manaPoints){
            System.out.print(Color.BLUE_BACKGROUND + point+Color.RESET+" ");
        }
        System.out.print("\t\n");

//        System.out.print(Color.RED_BACKGROUND + hitPoints.toString() + Color.RESET+"\t");
 //       System.out.print( Color.GREEN_BACKGROUND+ powerLvl.toString() + Color.RESET+"\t");
  //     System.out.print(Color.BLUE_BACKGROUND + manaPoints.toString() + Color.RESET);
    }

}





