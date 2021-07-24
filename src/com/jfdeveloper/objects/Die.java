package com.jfdeveloper.objects;


import java.util.Random;

public class Die {

    private int faces;
    private int faceUp;
    private Random random=new Random();


    public Die (int faces){
        this.faces=faces;
        faceUp=1;
    }

    public void roll(){
       this.faceUp= random.nextInt(faces)+1;
    }

    public int getFaceUp(){
        return faceUp;
    }

    public int getFaces(){return faces;}

    @Override
    public String toString() {
        return "\n-----\n" +
                "| "+ faceUp +" |\n"+
                "-----";
    }
}