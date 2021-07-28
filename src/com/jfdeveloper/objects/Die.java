package com.jfdeveloper.objects;


import java.util.Random;

public class Die {

    private final long SEED= System.currentTimeMillis();
    private int faces;
    private int faceUp;
    private Random random=new Random(SEED);


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


    public String displayDie() {
        return "\n-----\n" +
                "| "+ faceUp +" |\n"+
                "-----";
    }

    @Override
    public String toString() {
        return "{" +
                  faceUp +
                '}';
    }
}