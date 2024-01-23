package classbasics;

import java.util.Random;

public class GuessingGame {
    // number to guess
    private int numberToGuess;
    // won or not / guessed correctly or not
    boolean won;
    // number of chances
    protected int numberOfChances;
    // min number, max number (number ranges)
    private int minNumber, maxNumber;
    // messages: incorrect, correct, won
    String[] messages = {"Sorry, but that number is incorrect",
    "Congrats! You correctly guessed the number",
    "You won the game!"
    };
    // random object to generate random number
    private Random random = new Random();

    // create the instance variables. choose the correct access level
    // create a constructor: default, pass values needed

 public GuessingGame(){}

    public GuessingGame(int numberOfChances, int minNumber, int maxNumber) {
        this.numberOfChances = numberOfChances;
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }

    public GuessingGame(int numberToGuess, int numberOfChances, int minNumber, int maxNumber) {
        this(numberOfChances, minNumber, maxNumber);
        this.numberToGuess = numberToGuess;
    }
}
