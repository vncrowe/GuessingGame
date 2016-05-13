package io.veronicacrowe;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by veronicacrowe on 4/28/16.
 */
public class GameTest {

    @Test
    public void incrementGuessCountTest(){
        GuessingGame guessingGame = new GuessingGame();
        int startValue = guessingGame.guessCount;
        int expectedValue = startValue +1;
        guessingGame.incrementGuessCount();
        int actualValue = guessingGame.guessCount;
        Assert.assertEquals("The value should increment by 1.", actualValue, expectedValue);
    }
}
