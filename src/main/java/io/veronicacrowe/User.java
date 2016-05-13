package io.veronicacrowe;

/**
 * Created by veronicacrowe on 4/28/16.
 */
/*Write a guessing game where the user has to guess a secret number. After every guess
the program tells the user whether their number was too large or too small. At the end
the number of tries needed should be printed.
 */
public class User {
    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        game.playGame();
    }

}

