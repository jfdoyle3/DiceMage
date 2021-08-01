package com.jfdeveloper.dice;


import java.util.Random;

public class Die {

    private final long SEED= System.currentTimeMillis();
    private int faces;
    private int faceUp;
    private Random random=new Random();


    public Die(){
        faces=6;
        faceUp=1;
    }

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

    @Override
    public String toString() {
        return "[" +
                  faceUp +
                ']';
    }
}