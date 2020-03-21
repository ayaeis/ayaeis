import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {

	static Scanner input = new Scanner(System.in);
	
	public static int answer1; //The answer to the question asking the player if they want to play or not
	public static int theLevel; // The level the player chooses
	public static int minimumNumber; // The minimum number in the chosen interval
	public static int maximumNumber; // The maximum number in the chosen interval
	public static int howManyGuesses; //How many guesses the player gets
	public static int theAnswer; // The right answer which the player has to guess
	public static int theGuessedNumber; // The number that the player guessed
	public static int guessesLeft; // How many guesses left the player has after x guesses
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		beginGuessGame();

	}
	/**
	 * This method creates the answer by generating a random number in the chosen interval
	 * @param maximumNumber the maximum number in the interval
	 * @param minimumNumber the minimum number in the interval
	 * @return returns the right answer that the player will guess
	 */
	public static int theRightAnswer(int maximumNumber, int minimumNumber) {
		Random theAnswer = new Random();
		
		return theAnswer.nextInt(maximumNumber - minimumNumber + 1) + minimumNumber;
		// (max - min + 1) + min so that the generated answer would be >=maximumNumber
	}
	/**
	 * This method contains the code thats needed to begin the game.
	 */
	public static void beginGuessGame() {
		System.out.println("Welcome to Guess the number!");
		System.out.println("You get to guess the number while you have a limited amount of guesses!");
		System.out.println();
		System.out.println("Do you want to play?");
		System.out.println("1. No 2. Yes");
		answer1 = input.nextInt();
	
		if (answer1 == 1) {
			System.out.println("Come back later!");
		}
		else if (answer1 == 2) {
			System.out.println("Now choose the level of the game you want to play");
			System.out.println("1. Easy 2. Medium 3. Hard");
			theLevel = input.nextInt();
			
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
	/**
	 * This method contains the code for the easy level of this game.
	 */
	public static void easyMode() {
		System.out.flush();
		System.out.println("You have chosen the easy level of the game!");
		System.out.println("You get to choose the interval of the number and you have 1000 guesses!");
		System.out.println();
		System.out.println("Please write the minimum number of your desired interval");
		minimumNumber = input.nextInt();
		System.out.println("Now please write the maximum number of your desired interval");
		maximumNumber = input.nextInt();
		System.out.println("Your interval is between " + minimumNumber + " and " + maximumNumber +" and you have 1000 guesses!" );
		howManyGuesses = 1000;
		
		allModes();
		
	}
	/**
	 * This method contains the code for the easy level of this game.
	 */
	public static void mediumMode() {
		System.out.flush();
		System.out.println("You have chosen the medium level of the game!");
		System.out.println("You get to choose the interval of the number and how many guesses you want!");
		System.out.println();
		System.out.println("Please write the minimum number of your desired interval");
		minimumNumber = input.nextInt();
		System.out.println("Now please write the maximum number of your desired interval");
		maximumNumber = input.nextInt();
		System.out.println("Now choose how many guesses you would like to have!");
		howManyGuesses = input.nextInt();
		System.out.println("Your interval is between " + minimumNumber + " and " + maximumNumber + " and you have " + howManyGuesses + " guesses!");
		
		allModes();
		
	}
	/**
	 * This method contains the code for the easy level of this game.
	 */
	public static void hardMode() {
		System.out.flush();
		System.out.println("You have chosen the hard level of the game!");
		minimumNumber = 50;
		maximumNumber = 1000;
		howManyGuesses = 5;
		System.out.println();
		System.out.println("The number is above " + minimumNumber + " and you have " + howManyGuesses + " guesses!");
		
		allModes();
		
	}
	/**
	 * This method contains the common code between all the levels. 
	 */
	public static void allModes() {
		
		theAnswer = theRightAnswer(maximumNumber, minimumNumber);
		System.out.println("Please write your first guess!");
		
		for(int i = howManyGuesses; i != 0; i--) {
			theGuessedNumber = input.nextInt();
			howManyGuesses--;	
			
			if (theGuessedNumber == theAnswer) {
				System.out.println("You won!");
				break;
			}
			else if (theGuessedNumber < theAnswer) {
				System.out.println("You guessed wrong! try a higher number!");
				System.out.println("You have" + howManyGuesses + "left." );
			}
			else if (theGuessedNumber > theAnswer) {
				System.out.println("You guessed wrong! try a lower number!");
				System.out.println("You have" + howManyGuesses + "left.");
			}
			if (howManyGuesses == 0) {
				System.out.println("You do not have any guesses left, you lost!");
			}
			
		}
		System.out.println();
		System.out.println("Do you want to go back to main menu?");
		System.out.println("1.No 2. Yes");
		answer1 = input.nextInt();
		
		switch (answer1) {
		case 1:
			System.out.println("Come back later!");
			break;
		case 2:
			beginGuessGame();
			
		}
	}

}
