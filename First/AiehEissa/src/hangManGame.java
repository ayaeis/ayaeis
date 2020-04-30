import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class hangManGame {
	static Scanner input = new Scanner(System.in);
	static Random random = new Random();
	public static char[] randomWordToGuess; // the correct, randomly chosen word.
	public static int amountOfGuesses; // the amount of guesses the player will have, different depending on the difficulty.
	public static char[] playerGuess; // the list where the player's correct guesses will be stored, will be compared with the correct answer.
	public static char guessInput; //the player's guess.
	public static ArrayList<Character> wrongGuesses = new ArrayList<Character>(); // the list where the player's wrong guesses will be showed.
	public static int howManyWrongGuesses;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		choosesWordToBeGuessed();
		startGame();
		backToMainMenu();
			}
	/**
	 * A method that chooses a random word out of a list of words, by using the Random-function to choose the index (place) of the word in the list
	 * and then converts the word to a char-list. 
	 */
	public static void choosesWordToBeGuessed() {
		String[] guesses = {"programing", "bed", "candle", "pencil", "flower", "fruit", "juice", "fake", "light", "pen", "phone", "school"};
		randomWordToGuess = guesses[random.nextInt(guesses.length)].toCharArray();
	}
	/**
	 * A method that creates a new char-array, which will store the player's correct guesses. This list will be as long as the chosen word.
	 * and it fills the list with '_', resembling "unknown" letters. 
	 */
	public static void createPlayerGuess() {
		playerGuess = new char[randomWordToGuess.length];
		for (int i= 0; i< playerGuess.length; i++) {
			playerGuess[i] = '_';
		}
		System.out.println(playerGuess);
	}
	/**
	 * A method that catches the errors that occur in case the player writes a data type other than an int, for an int.
	 * @return returns the player's int input.
	 */
	public static int isNextIntValid() {
		while(true) {
			try {
				return input.nextInt();
			}
			catch (Exception e) {
				System.out.println("Try writing a number instead");
				input.nextLine();
				continue;
			}
		}
	}
	/**
	 * A method that starts the game by welcoming the player and checking if s/he wants to play.
	 * It also calls other methods depending on the player's choice of difficulty.
	 */
	public static void startGame() {
		System.out.println("Welcome to HangMan game!");
		System.out.println("In this game, you will get a random word to guess, and you will have limited amount of guesses");
		System.out.println("Do you want to play?");
		System.out.println("Please answer with 1 for yes, and 2 for no");
		
		boolean answering = true;
		// A while-loop so that the player will have to keep writing in numbers until s/he answers with 1 or 2. 
		while (answering) {
		int  doYouWantToPlay = isNextIntValid();
		
		if(doYouWantToPlay == 2) {
			System.out.println("Come back later!");
			break;
		}
		else if(doYouWantToPlay == 1) {
			System.out.println("Great you want to play!");
			System.out.println("Now choose the difficulty, type 1 for easy and 2 for advanced");
			int difficulty = isNextIntValid();
			switch (difficulty) {
			case 1:
				easyGameSetup();
				break;
				
			case 2:
				advancedGameSetup();
				break;	
			default:
				System.out.println("You did not follow the instructions! come back later.");
			}
			break;
		}
		else if (doYouWantToPlay!=1 || doYouWantToPlay!= 2) {
			System.out.println("Please answer with 1 or 2");
		}
	  }
	}
	/**
	 * A method that tells the player it is an easy game, and chooses the amount of guesses.
	 */
	public static void easyGameSetup() {
		System.out.println("You have choosen the easy game");
		System.out.println("You will have 3 free wrong guesses before the hangMan starts hanging!");
		System.out.println("Good luck!");
		howManyWrongGuesses = 10;
		guessTheWord();
	}
	/**
	 * A method that tells the player it is a hard game, and chooses the amount of guesses.
	 */
	public static void advancedGameSetup() {
		System.out.println("You have chosen the advanced game");
		System.out.println("Once the hangman dies, you lose!");
		System.out.println("Good luck!");
		howManyWrongGuesses = 7;
		guessTheWord();
	}
	/**
	 * A method where the player will have to guess the word.
	 * It calls in other methods to check if each input is correct, and if the word has been guessed or not.
	 */
	public static void guessTheWord() { 	
		System.out.println("The word you should guess is:");
		createPlayerGuess();
		System.out.println("the word is " + randomWordToGuess.length + " letters long");
		
		boolean wordIsGuessed = false;
		while (!wordIsGuessed && howManyWrongGuesses!=0) { 
			System.out.println("write your next guess");
				 guessInput = input.next().charAt(0); // Takes the first letter only in case a word was written.
				doesRightAnswerContainInput();
				wordIsGuessed = isWordGuessed();
				System.out.println("The word" + Arrays.toString(playerGuess)); // Made the char-list to a string so that it can be printed without a for-loop.
				if (wrongGuesses.size() == 0) { // so the list will not be printed if there hasnt been any wrong guesses.
					System.out.println("You have no wrong guesses yet.");
				}
				else {
				System.out.println("Your wrong guesses: " + wrongGuesses); 
				} 
		}
		if(wordIsGuessed= false || howManyWrongGuesses == 0) {
			System.out.println("You lost :(");
			System.out.println("The right anwer was:");
			System.out.println(randomWordToGuess);
		}
		
	}
	/**
	 * A method that checks if the player's input is correct by checking if the char-list contains the input.
	 * It adds the input to either the list where the player's correct guesses are stored, or the list with wrong guesses.  
	 * It also calls a method that is going to print out the hang man. 
	 */
	public static void doesRightAnswerContainInput() {
		boolean correctInput= false; 
		for(int i=0; i< randomWordToGuess.length; i++) {
			if(randomWordToGuess[i] == guessInput) {
				System.out.println("correct guess!");
				playerGuess[i] = guessInput;
				correctInput = true;
		  }
		}
		if (correctInput != true) {
			System.out.println("wrong guess!");
			if(wrongGuesses.contains(guessInput)) { // So that the wrong guesses list will not have the same letter twice.
			}
			else {
			wrongGuesses.add(guessInput);
			}
			howManyWrongGuesses--;
		}		
		printOutHangMan();
	}
	/**
	 * A method that checks if the word has been guessed by checking if there is any '_' left in the list where the player's correct guesses get stored.
	 * @return returns true or false depending on the answer. Those will either continue the while-loop in guesstheWord();, or end it. 
	 */
	public static boolean isWordGuessed() { 
		for(int i=0; i<playerGuess.length; i++) {
			if (playerGuess[i] == '_') {
				return false;
			}
		}
		System.out.println("Congratulations! You have guessed the word");
		return true;
	}
	/**
	 * A method that checks if the player wants to go back to main menu.
	 * Calls in another method in case the player wants to.
	 */
	public static void backToMainMenu() {
		System.out.println("Do you want to go back to main menu?");
		System.out.println("1. Yes 2. No");
		while (true) {
		int playAgain = isNextIntValid();
		if (playAgain == 1) {
			startGame();
			break;
		}
		else if(playAgain == 2) {
			System.out.println("See you later!");
			break;
		}
		else {
			System.out.println("1. Yes 2. No");		
		}
	  }
	}
	/**
	 * A method that prints out the hang man depending how many times the player has guessed wrong. 
	 */
	public static void printOutHangMan() {
		if (howManyWrongGuesses == 6) {
			System.out.println("  +---+\n" +
	                "   |  |\n" +
	                "      |\n" +
	                "      |\n" +
	                "      |\n" +
	                "      |\n" +
	                "=========");
		}
		else if(howManyWrongGuesses == 5) {
			System.out.println("  +---+\n" +
	                "   |   |\n" +
	                "   O   |\n" +
	                "       |\n" +
	                "       |\n" +
	                "       |\n" +
	                "==========");
		}
		else if(howManyWrongGuesses == 4) {
			 System.out.println("  +---+\n" +
		            "   |   |\n" +
		            "   O   |\n" +
		            "   |   |\n" +
		            "       |\n" +
		            "       |\n" +
		            "==========");
		}
		else if(howManyWrongGuesses == 3) {
			System.out.println("  +---+\n" +
	                "   |   |\n" +
	                "   O   |\n" +
	                "  /|   |\n" +
	                "       |\n" +
	                "       |\n" +
	                "==========");
		}
		else if(howManyWrongGuesses == 2) {
			System.out.println("The hangman is on..");
			System.out.println("  +---+\n" +
	                "   |   |\n" +
	                "   O   |\n" +
	                "  /|\\ |\n" +
	                "       |\n" +
	                "       |\n" +
	                "===========");
		}
		else if(howManyWrongGuesses == 1) {
			System.out.println("  +---+\n" +
	                "   |   |\n" +
	                "   O   |\n" +
	                "  /|\\ |\n" +
	                "  /    |\n" +
	                "       |\n" +
	                "==========");
		}
		else if(howManyWrongGuesses == 0) {
			System.out.println("  +---+\n" +
	                "   |   |\n" +
	                "   O   |\n" +
	                "  /|\\ |\n" +
	                "  / \\ |\n" +
	                "       |\n" +
	                "==========");
		}
	}
}


