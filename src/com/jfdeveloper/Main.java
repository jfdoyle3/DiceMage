package com.jfdeveloper;

import com.jfdeveloper.game.Game;
import com.jfdeveloper.ui.BWConsole;
import com.jfdeveloper.ui.Console;

public class Main {

    public static void main(String[] args) {

//        Game game = new Game();
//        game.play();
       // game.testWiz();
        Console console=new BWConsole();

        console.buyMonster(6,2);
    }
}
