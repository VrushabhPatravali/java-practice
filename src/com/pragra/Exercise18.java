package com.pragra;

public class Exercise18 {

    public static void main(String[] args) {

        boolean gameOverInput = true;
        int scoreInput = 800;
        int levelCompletedInput = 5;
        int bonusInput = 100;

        int highScore = calculateScore(gameOverInput, scoreInput, levelCompletedInput, bonusInput);
        System.out.println("final score: " + highScore);

        scoreInput = 10000;
        levelCompletedInput =8;
        bonusInput = 200;

        System.out.println("final score: " + calculateScore(gameOverInput, scoreInput, levelCompletedInput, bonusInput));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            score += (levelCompleted * bonus);
        }

        return score;
    }

}
