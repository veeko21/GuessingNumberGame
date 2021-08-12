import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {
    static int guessNum;
    public static void main(String[] args) {

        //game intro
        gameIntro();
        //random number initializer from 1 - 100
        randomNumberInitializer();
        //user input guess
        userInput();
    }

    public static void gameIntro() {
        System.out.println("Welcome to the guessing game!\nGuess a number from 1 to 100!\nYou will have 10 attempts!");
    }
    
    public static int randomNumberInitializer() {
        Random random = new Random();
        int randomNum = random.nextInt(101);
        //from 1 - 100
        randomNum += 1;
        return randomNum;
    }

    public static int userInput() {
        Scanner scanner = new Scanner(System.in);
        int attempts = 10;
        int start = 1;

        while (start <= 10) {
            guessNum = scanner.nextInt();
            if (guessNum > randomNumberInitializer()) {
                System.out.println("Go lower!");
            } else if (guessNum < randomNumberInitializer()) {
                System.out.println("Go higher!");
            } else {
                System.out.println("You guessed it!");
            }
            start += 1;
        }
        return guessNum;
    }
}
