package com.bridgelabz.snakesladder;

import java.util.Random;

public class SnakesLadder {
    public static void main(String[] args) {
        Random random=new Random();
        int  diceRoll=random.nextInt(1,7);
        System.out.println("currunt position dice is:"+diceRoll);

    }
}
