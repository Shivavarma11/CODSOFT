import java.util.Scanner;
import java.util.Random;

class NumberGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        boolean playOnce = true;
        while (playOnce) {
            int comGuessedNo = r.nextInt(100) + 1;
            int attempts = 1;
            boolean guessedNum = false;
            System.out.println();
            System.out.println("welcome to  number guessing game!");
            System.out.println();
            System.out.println("Computer has chosen a number between 1 to 100, try to guess the number.");
            System.out.println("you have max 10 attempts to guess the number.");
            while (!guessedNum && attempts <= 10) {
                System.out.println("guess the number:");
                int userGuessedNo = s.nextInt();
                if (userGuessedNo == comGuessedNo) {
                    System.out.println(
                            "Congratulations ! you have guessed the number " + comGuessedNo + " correctly in "
                                    + attempts
                                    + " attempts.");
                    guessedNum = true;
                } else if (userGuessedNo < comGuessedNo) {
                    System.err.println("too low! try again");
                } else {
                    System.err.println("too high! try again");
                }
                attempts++;

            }
            System.out.println();
            if (!guessedNum) {
                System.err.println("sorry ! you are exceded your attempts. the required number was" + comGuessedNo);
            }

            System.out.println();
            System.out.println("Do u want to play again ?   (yes/no)");
            String response = s.next().toLowerCase();
            if (response.equals("yes")) {
                playOnce = true;
            } else {
                playOnce = false;
            }

        }
        System.out.println();
        System.out.println("Thank you for playing the game !");

    }

}