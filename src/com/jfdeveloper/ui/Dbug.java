package com.jfdeveloper.ui;

public class Dbug {

    private static final String RESET="\033[0m";
    private static final String RED_BOLD="\033[1;31m";

    public static void dbug(String note, Object object ){
            System.out.println(RED_BOLD);
            System.out.println("Dbugger: "+note+":  "+object);
            System.out.println(RESET);
    }
}

// Color Choices:
//    RED("\033[0;31m"),      // RED
//    GREEN("\033[0;32m"),    // GREEN
//    YELLOW("\033[0;33m"),   // YELLOW
//
//    RED_BOLD("\033[1;31m"),     // RED
//    GREEN_BOLD("\033[1;32m"),   // GREEN
//    YELLOW_BOLD("\033[1;33m"),  // YELLOW
//
//    RED_UNDERLINED("\033[4;31m"),       // RED
//    GREEN_UNDERLINED("\033[4;32m"),     // GREEN
//    YELLOW_UNDERLINED("\033[4;33m"),    // YELLOW
//
//    RED_BACKGROUND("\033[41m"),     // RED
//    GREEN_BACKGROUND("\033[42m"),   // GREEN
//    YELLOW_BACKGROUND("\033[43m"),  // YELLOW
//
//    RED_BRIGHT("\033[0;91m"),       // RED
//    GREEN_BRIGHT("\033[0;92m"),     // GREEN
//    YELLOW_BRIGHT("\033[0;93m"),    // YELLOW
//
//
//    RED_BOLD_BRIGHT("\033[1;91m"),      // RED
//    GREEN_BOLD_BRIGHT("\033[1;92m"),    // GREEN
//    YELLOW_BOLD_BRIGHT("\033[1;93m"),   // YELLOW
//
//    RED_BACKGROUND_BRIGHT("\033[0;101m"),       // RED
//    GREEN_BACKGROUND_BRIGHT("\033[0;102m"),     // GREEN
//    YELLOW_BACKGROUND_BRIGHT("\033[0;103m"),    // YELLOW