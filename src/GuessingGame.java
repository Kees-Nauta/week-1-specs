import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public GuessingGame() {
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("What is your name?");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        Random rand = new Random();
        int number = rand.nextInt(100) + 1;

        int tries =0;
        while (true) {
            System.out.println("Guess a number between 1 and 100:");
            int guess;
            try {
                guess = input.nextInt();
            } catch (InputMismatchException e) {
                String bad_input = input.next();
                System.out.println("that's not an integer, try again");
                continue;
            }

            if (guess < 1 || guess > 100) {
                System.out.println(guess + " is not a valid number, try again");
                continue;
            }

            tries = tries + 1;

            if (guess < number) {
                System.out.println("Your guess is to low, try again.");
            } else if (guess > number) {
                System.out.println("Your guess is to high, try again.");
            } else {
                System.out.println("Well done " + name + "!");
                System.out.println("You found my number in " + tries + " tries!");
                break;
            }
        }
    }
}
