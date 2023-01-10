package com.bridgelabz.snakesladder;

import java.util.Random;

public class SnakesLadder {
    public static void main(String[] args) {
        System.out.println("This is two player game");
        int player1Position = 0;
        int player2Position = 0;

        final int WINNING_POSITION = 100;
        System.out.println("player 1 position is=" + player1Position);
        System.out.println("player 1 position is=" + player2Position);
        while (player1Position <= WINNING_POSITION && player2Position <= WINNING_POSITION) {
            Random random = new Random();
            int diceRoll1 = random.nextInt(1, 7);
            System.out.println("player 1 roll");
            //System.out.println("dice value=" + diceRoll1);
            int option = random.nextInt(0, 3);



            if (player1Position == WINNING_POSITION) {
                System.out.println("player1 won the game");
                break;

            }

            switch (option) {
                case 0:
                    //no play
                    System.out.println("no play ,the player stays in the same position");
                    break;
                case 1:
                    //ladder
                    System.out.println("ladder");
                    player1Position += diceRoll1;
                    if (player1Position > 100) {
                        player1Position = player1Position - diceRoll1;
                    }
                    // System.out.println("player move ahead:" + diceRoll1);
                    System.out.println("player got ladder,player new position is:" + player1Position);
                    break;
                case 2:
                    //snake
                    System.out.println("snake");
                    player1Position -= diceRoll1;
                    if (player1Position < 0) {
                        player1Position = 0;
                    }
                    // System.out.println("player move behind:" + diceRoll1);
                    System.out.println("player got snake ,player currunt position:" + player1Position);
                    break;
                default:
                    System.out.println("not correct");
            }

            int diceRoll2 = random.nextInt(1, 7);

//player2
            System.out.println("player2 roll");
            // System.out.println("dice value=" + diceRoll2);
            option = random.nextInt(0, 3);


            if (player2Position == WINNING_POSITION) {
                System.out.println("player2 won the game");


            }
            switch (option) {
                case 0:
                    //no play
                    System.out.println("no play ,the player stays in the same position");
                    break;
                case 1:
                    //ladder
                    System.out.println("ladder");
                    player2Position += diceRoll2;
                    if (player2Position > 100) {
                        player2Position = player2Position - diceRoll2;
                    }
                    //System.out.println("player move ahead:" + diceRoll2);
                    System.out.println("player got ladder,player new position is:" + player2Position);
                    break;
                case 2:
                    //snake
                    System.out.println("snake");
                    player2Position -= diceRoll2;
                    if (player2Position < 0) {
                        player2Position = 0;
                    }
                    // System.out.println("player move behind:" + diceRoll2);
                    System.out.println("player got snake ,player currunt position:" + player2Position);
                    break;
                default:
                    System.out.println("not correct");
            }
            System.out.println("========================================================");
        }
        if (player1Position>player2Position){
            System.out.println("=======player 1 won the game=======");
        }else {
            System.out.println("=======player 2 won the game=======");

        }
    }
}



