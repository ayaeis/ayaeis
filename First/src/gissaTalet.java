import java.util.Random;
import java.util.Scanner;

public class gissaTalet {

	private static Scanner input;
	public static Int answer1; // för att se till om man vill fortsätta med spelet.
	public static Int theLevel; // väljer nivån man vill ha.
	public static Int minimumNumber; // minsta talet inom intervallet.
	public static Int maximumNumber; // största talet inom intervallet.
	public static Int howManyGuesses; // antalet gissningar spelaren vill ha.
	public static Int theAnswer; // talet som slumpas fram och är det rätta svaret.
	public static Int theGuessedNumber; // spelarens gissning.
	public static Int guessesLeft; // hur många gissningar är kvar.


	
	public static void main(String[] args) {
		guessGame();
	}
	/**
	 * This method creates the answer by generating a random number.
	 * @param maximumNumber the maximum number in the interval, chosen by player.
	 * @param minimumNumber the minimum number in the interval, chosen by player.
	 * @return
	 */
	public static int theRightAnswer(int maximumNumber,int minimumNumber) {
		Random theAnswer = new Random();
		return theAnswer.nextInt(maximumNumber - minimumNumber + 1) + minmumNumber; 
		// (max - min + 1) + min för att vi skall kunna få 
	}
	/**
	 * This method contains the coding needed to launch the game
	 */
	public static void guessGame() {
		do {
			while(run){
				System.out.println("Welcome to guess the number!");
				System.out.println("Do you want to guess the numer? Please answer with 1 for yes or 2 for no");
				int answer1 = input.nextInt();
				if (answer1 == 2) {
					System.out.println("Come back later!");
					break;
				}
				else if {
					System.out.println("In order to start you have to choose the level!" +
				"1. Easy" + "2. Medium" + "3. Hard");
					int theLevel = input.nextInt();
					switch (theLevel) {
					case 1:
						easyMode();
						break;
						
					case 2:
						mediumMode();
						break;
						
					case 3:
						hardMode();
						break;
						
					}		
				}
			}
		}
		
	}
	/**
	 * This method contains the easy level of the game
	 */
	public static void easyMode() {
		System.out.flush();
		System.out.println("Write the minimum number of the interval");
		int minimumNumber = input.nextInt();
		System.out.println("Choose the maximum number of the interval");
		int maximumNumer = input.nextInt();
		System.out.println("You choose an interval between" + minimumNumber + "-" maximumNumber + "and you have 1000 guesses!");
		System.out.println("Goodluck!");
		int howManyGuesses = 1000;
		theWayTheGameWorks();
		
	}
	/**
	 * This method contains the medium level of the game
	 */
	public static void mediumMode() {
		System.out.flush();
		System.out.println("Please choose the minmum number of the interval");
		int minimumNumber = input.nextInt();
		System.out.println("Please choose the maximum number of the interval");
		int maximumNumber = input.nextInt();
		System.out.println("Please choose how many guesses you want to have");
		int howManyGuesses = input.nextInt();
		System.out.println("Your number is between" + minimumNumber + "-" + maximumNumber + "and you have" + howManyGuesses + "guesses!");
		
		theWayTheGameWorks();
	}
	/**
	 * This method contains the hard level of the game
	 */
	public static void hardMode() {
		System.out.flush();
		int maximumNumber = 1000;
		int minimumNumber = 400;
		int howManyGuesses = 5;
		System.out.println("Choose a number larger than" + maximumNumber + "and you have" + howManyGuesses + "guesses");
		theWayTheGameWorks();
	}
	public static void theWayTheGameWorks() {
		System.out.println("Write your first guess!");
		theAnswer = theRightAnswer(maximumNumber, minimumNumber);
		
		for (int 1 = 1; 1<= howManyGuesses; i--) {
			int theGuessedNumber = input.nextInt();
			howManyGuesses--;
			
			if (theGuessedNumber == theAnswer) {
				System.out.println("You won!");
				break;
			}
			else if (howManyGuesses != 0) {
				if (theGuessedNumber > theAnswer) {
					System.out.println("You guessed wrong! Try a lower number");
					System.out.println("You have " + howManyGuesses " guesses left");
					
				}
				else if (theGuessedNumber < theAnswer) {
					System.out.println("You guessed wrong! Try a higher numebr");
					System.out.println("You have" + howManyGuesses + "guesses left");
				}
			}
			else {
				System.out.println("You lost!");
				break;
			}
		}
	}
}