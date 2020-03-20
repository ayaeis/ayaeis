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
	public static void beginGuessGame() {
		
	}
	/**
	 * This method contains the code for the easy level of this game.
	 */
	public static void easyMode() {
		System.out.flush();
		System.out.println("You have chosen the easy level of the game!");
		System.out.println("You get to choose the interval of the number and you have 1000 guesses!");
		System.out.println("Please write the minimum number of your desired interval");
		minimumNumber = input.nextInt();
		System.out.println("Now please write the maximum number of your desired interval");
		maximumNumber = input.nextInt();
		System.out.println("Your interval is between" + minimumNumber + "and" + maximumNumber +"and you have 1000 guesses!" );
		howManyGuesses = 1000;
		
		allModes();
		
	}
	public static void MediumMode() {
		
	}
	public static void hardMode() {
		
	}
	public static void allModes() {
		
	}

}
