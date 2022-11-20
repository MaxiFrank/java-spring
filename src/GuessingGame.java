package src;

import java.util.Random;
import java.util.Scanner;


public class GuessingGame {

    public static void main (String[] args) {
        new GuessingGame();
    }

    public GuessingGame() {
        System.out.println("Howdy, what's your name?");
        System.out.println("(type in your name) ");

        Scanner userInput = new Scanner(System.in);

        String userName = userInput.nextLine();

        System.out.println(userName + " I'm thinking of a number between 1 and 100.");
        System.out.println("Try to guess my number.");

        Random randomNumber = new Random();
        int correctNumber = randomNumber.nextInt(100);
        int tries = 0;

        while (true){
            int guess = userInput.nextInt();
            if (guess > correctNumber) {
                System.out.println("Your guess is too low, try again.");
            } if (guess < correctNumber) {
                System.out.println("Your guess is too high, try again.");
            } else {
                System.out.println("Well done, " + userName + "! You found my number in "+ tries + " tries!");
            tries += 1;
            }
        }
    }
}
