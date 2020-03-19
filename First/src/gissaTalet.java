import java.util.Random;
import java.util.Scanner;

public class gissaTalet {

	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);

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
	public static void easyMode() {
		System.out.flush();
		System.out.println("Write the minimum number of the interval");
		int minimumNumber = input.nextInt();
		System.out.println("Choose the maximum number of the interval");
		int maximumNumer = input.nextInt();
		System.out.println("You choose an interval between" + minimumNumber + "-" maximumNumber + "and you have unlimited guesses!");
		System.out.println("Goodluck!");
		
		
	}
	

}