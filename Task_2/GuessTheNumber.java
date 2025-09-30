import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

      
        int minRange = 1;
        int maxRange = 100;
        String playAgain;

        do {
            
            int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
            int numberOfTries = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("\n--- Welcome to the Number Guessing Game! ---");
            System.out.println("I've picked a number between " + minRange + " and " + maxRange + ".");
            System.out.println("Try to guess it!");

           
            while (!hasGuessedCorrectly) {
                System.out.print("Enter your guess: ");
                
                
                if (scanner.hasNextInt()) {
                    int userGuess = scanner.nextInt();
                    numberOfTries++; 

                    if (userGuess < numberToGuess) {
                        System.out.println("Too low! Try again.");
                    } else if (userGuess > numberToGuess) {
                        System.out.println("Too high! Try again.");
                    } else {
                        hasGuessedCorrectly = true;
                        System.out.println("🎉 Congratulations! You guessed the number!");
                        System.out.println("It took you " + numberOfTries + " tries.");
                    }
                } else {
                    System.out.println("That's not a valid number. Please try again.");
                    scanner.next();
                }
            }

            
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing! Goodbye. 👋");
        scanner.close(); 
    }
}