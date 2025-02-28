import java.util.Random;
import java.util.Scanner;

public class NUMBERGAME {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalAttempts = 10;
        char playagain;

        do {
            int numberTobeGuess = random.nextInt(100) + 1;
            int attempts = 0;
            boolean hasWon = false;

            System.out.println("Welcome to the NUMBER GAME!");
            System.out.println("ONE NUMBER IS SELECTED BETWEEN 1 TO 100,TRY TO GUESS IT!,YOU HAVE 10 ATTEMPTS");
            
            while (attempts < totalAttempts) {
                System.out.print("Enter your guess: ");
                int playerGuess = scanner.nextInt();
                attempts++;

                if (playerGuess < numberTobeGuess) {
                    System.out.println("LESS THAN THE GUESSED NO.");
                } else if (playerGuess > numberTobeGuess) {
                    System.out.println("GREATER THAN THE GUESSED NO.");
                } else {
                    hasWon = true;
                    break;
                }
            }

            if (hasWon) {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
            } else {
                System.out.println("Sorry, you've used all " + totalAttempts + " attempts. The number was " + numberTobeGuess + ".");
            }

            System.out.print("Do you want to play again? (y/n): ");
            playagain = scanner.next().charAt(0);

        } while (playagain == 'y' || playagain == 'Y');

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}

