package com.bridgelabz.snakesladder;

import java.util.Random;
import java.util.Scanner;

public class SnakesLadder {
    public static void main(String[] args) {
        int start_position = 0;
        int player_position = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("starting position of player is:" +start_position);
        Random random=new Random();
        int dice_roll=random.nextInt(1,7);
        System.out.println("roll the die:"+dice_roll);

        int option=random.nextInt(0,3);
        switch (option) {
            case 0:
                //no play
                System.out.println("no play ,the player stays in the same position");
                break;
            case 1:
                //ladder
                player_position += dice_roll;
                System.out.println("player move ahead:" + dice_roll);
                System.out.println("player got ladder,player new position is:" + player_position);
                break;
            case 2:
                //snake
                player_position -= dice_roll;

                System.out.println("player move behind:" + dice_roll);
                System.out.println("player got snake ,player currunt position:" + player_position);
                break;


        }



    }
}
