import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {
	static Scanner input = new Scanner(System.in);
	
	public static int answer1;
	public static int theLevel; 
	public static int minimumNumber; 
	public static int maximumNumber;
	public static int howManyGuesses;
	public static int theAnswer;
	public static int theGuessedNumber;
	public static int guessesLeft;
	

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
		
	}
	public static void beginGuessGame() {
		
	}
	public static void easyMode() {
		
	}
	public static void MediumMode() {
		
	}
	public static void hardMode() {
		
	}

}
