import java.util.Random;
import java.util.Scanner;

public class dornas {

   static Scanner inputFromPlayer = new Scanner(System.in);

   public static int chooseLevel;
   public static int minimumNumber = 0;
   public static int maximumNumber;
   public static int rightNumber;
   public static int guessesLeft;
   public static int numberOfGuesses = 10;
   public static int guessedNumber;
   public static int playAgainOrQuit;


   public static void main(String[] args) {
       guessingNumberGame();
   }

   public static int answerNum(int maximumNumber, int minimumNumber) {
       Random rightNum = new Random();

       return rightNum.nextInt(maximumNumber - minimumNumber + 1) +
               minimumNumber;

   }

   public static void guessingNumberGame() {

           System.out.println("Welcome to guessing number game!");
           System.out.println();
           System.out.println("On this game you have only 10 chances to guess right\n" +
                   "If you guess right, you win the game\n" +
                   "If you don't have any guesses left, you lose the game.");
       System.out.println();
       System.out.println("Choose the level that you want to play:\n"+
               "1.Easy Level\n"+
                   "2.Medium Level\n"+
                   "3.Difficulty Level");
           System.out.println();

           choosingLevel();

       }

   public static void playingAgainOrNot() {
       System.out.println("Do you want to play again?");
       System.out.println();
       System.out.println("Write the number that you want");
       System.out.println("1.Yes\n 2.No");
       System.out.println();

       playAgainOrQuit = inputFromPlayer.nextInt();

       switch (playAgainOrQuit) {
       case 1:
    	   guessingNumberGame();
    	   break;
       case 2:
    	   System.out.println("bye");
    	   break;
       }
 
   }

   public static void choosingLevel() {
       chooseLevel = inputFromPlayer.nextInt();
       if (chooseLevel == 1) {
           easyLevel();
       } else if (chooseLevel == 2) {
           mediumLevel();
       } else if (chooseLevel == 3) {
           difficultyLevel();
       }
   }


   public static void easyLevel() {
       System.out.flush();
       numberOfGuesses = 10;
       System.out.println("You have only 10 guesses");
       System.out.println("You are going to guess between 0-10");
       maximumNumber = 10;
       minimumNumber = 0;

       systemOfTheGame();
   }

   public static void mediumLevel() {
       System.out.flush();
       System.out.println("You have only 10 guesses");
       numberOfGuesses = 10;
       System.out.println("You are going to guess between 0-50");
       maximumNumber = 50;

       systemOfTheGame();

   }

   public static void difficultyLevel() {
       System.out.flush();
       System.out.println("You have only 10 guesses");
       numberOfGuesses = 10;
       System.out.println("You are going to guess between 0-100");
       minimumNumber = 0;
       maximumNumber = 100;

       systemOfTheGame();
   }

   public static void systemOfTheGame() {
       rightNumber = answerNum(maximumNumber, minimumNumber);
        System.out.println("Guess a number");
       for (int i = 1; i <= numberOfGuesses; i--) {
          
           guessedNumber = inputFromPlayer.nextInt();
           numberOfGuesses--;

           if (guessedNumber == rightNumber) {
               System.out.println("Congrats!\n" +
                       "You won the game!");
               playingAgainOrNot();

           } else if (guessedNumber < rightNumber) {
               System.out.println("Sorry you guessed wrong\n" +
                       "the number is higher\n" +
                       "You have " + numberOfGuesses + " guesses left");
           } else if (guessedNumber > rightNumber) {
               System.out.println("Sorry you guessed wrong\n" +
                       "the number is lower\n" +
                       "you have " + numberOfGuesses + " guesses left");

           } if (numberOfGuesses == 0) {
               System.out.println("Sorry you lost the game");
               playingAgainOrNot();
           }

       }
   }
}

