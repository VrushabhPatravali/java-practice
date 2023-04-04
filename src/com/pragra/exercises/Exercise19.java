package com.pragra.exercises;

public class Exercise19 {

//    score >=1000 ---> 1
//    score >=500 but <1000 ---> 2
//    score >=100 but <500 ---> 3
//    all other scores ---> 4

    public static void main(String[] args) {

        int playerScoreInput = 700;
        String playerNameInput = "Tim";
        displayHighScorePosition(playerNameInput, calculateHighScorePosition(playerScoreInput));
        playerScoreInput = 1500;
        displayHighScorePosition(playerNameInput, calculateHighScorePosition(playerScoreInput));
        playerScoreInput = 1000;
        displayHighScorePosition(playerNameInput, calculateHighScorePosition(playerScoreInput));
        playerScoreInput = 500;
        displayHighScorePosition(playerNameInput, calculateHighScorePosition(playerScoreInput));
        playerScoreInput = 100;
        displayHighScorePosition(playerNameInput, calculateHighScorePosition(playerScoreInput));
        playerScoreInput = 25;
        displayHighScorePosition(playerNameInput, calculateHighScorePosition(playerScoreInput));

    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " ont the high score list");
    }

}
