package com.jfdeveloper.objects;

public class Player {

    private String name;
    private int playerNumber;
    // private Cup cup=new Cup();
    private int score=0;


    public Player(String name, int playerNumber) {
        this.name = name;
        this.playerNumber=playerNumber;
    }

    public Player(String name){
        this.name=name;
        playerNumber=1;
    }

//    public int updateScore(){
//        int roundScore=0;
//        for(Die die : cup.dice)
//            score+=die.getFaceUp();
//        score+=roundScore;
//        return roundScore;
//    }

    public String getName() {
        return name;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }



    public String toString() {
        return "Player:" +
                "\nname:'" + name + '\'' +
                "\nplayerNumber: " + playerNumber;
    }
}
