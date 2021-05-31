import java.util.Scanner;
import java.util.Random;



public class Number_Play {

	    public static void guessingNumberGame()
	    {
	        Scanner sc = new Scanner(System.in);
	        Random ran = new Random();
	        int number = ran.nextInt(100)+1;

	        int K = 5;

	        int i, guess;

	        System.out.println("A number is chose between 1 to 100."+"\nGuess the number within 5 trials.");

	        for (i = 0; i < K; i++) {

	            System.out.println(
	                    "Guess the number:");

	            guess = sc.nextInt();

	            if (number == guess) {
	                System.out.println("Congratulations! You guessed the number.");
	                break;
	            }
	            else if (number > guess
	                    && i != K - 1) {
	                System.out.println(
	                        "The number is "
	                                + "greater than " + guess);
	            }
	            else if (number < guess
	                    && i != K - 1) {
	                System.out.println(
	                        "The number is"
	                                + " less than " + guess);
	            }
	        }

	        if (i == K) {
	            System.out.println(
	                    "You have exhausted"
	                            + " K trials.");

	            System.out.println(
	                    "The number was " + number);
	        }
	    }


	    public static void main(String arg[])
	    {
	        guessingNumberGame();
	    }
	}



