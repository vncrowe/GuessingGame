package io.veronicacrowe;

import java.util.Scanner;

/**
 * Created by veronicacrowe on 4/28/16.
 */
public class GuessingGame {

    public int guess;
    public int guessCount = 0;
    public int secretNumber = 25;
    public int lastGuess;
    public boolean correct = false;

    Player player = new Player();   //create new player object

//when method is called it will increment guessCount by 1
    public void incrementGuessCount() {

        guessCount++;
    }
//checks to see if guess is equal to secret number
    public void checkIfGuessIsEqual() {
        if (guess == secretNumber) {
            incrementGuessCount();
            correct = true;
        }
    }
//print out if guess is larger than secretNumber
    public void checkIfGuessIsTooLarge() {
        if (guess > secretNumber) {
            System.out.println("You guessed too high..guess again!");
            incrementGuessCount();
        }
    }
//print out if guess is smaller than secretNumber
    public void checkIfGuessIsTooSmall() {
        if (guess < secretNumber) {
            System.out.println("You guessed too low... guess again!");
            incrementGuessCount();
        }
    }

    public boolean ifGuessEqualsLastGuess() {
        if (lastGuess == guess) {
            return true;
        } else
            return false;
    }
//starts game
    public void playGame() {
        Scanner sc = new Scanner(System.in);
        while (!correct) {
            player.takeAGuess();
            guess = sc.nextInt();
            checkIfGuessIsTooSmall();
            checkIfGuessIsTooLarge();
            ifGuessEqualsLastGuess();
            checkIfGuessIsEqual();
        }
        System.out.println("CORRECT!");
        System.out.println("It only took you " + guessCount + " try(s)");
    }

}