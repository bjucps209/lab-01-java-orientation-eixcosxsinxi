import java.util.*;

class Guess {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		int secretNum;
		int numGuesses = 0;
		int guess = 0;

		secretNum = rand.nextInt(10) + 1;
		while (guess != secretNum) {
			guess = scan.nextInt();
			numGuesses += 1;

			if (guess < secretNum) {
				System.out.println("Your guess is too low.");
			}
			else if (guess > secretNum) {
				System.out.println("Your guess is too high");
			}
			else {
				System.out.println("You got it!");
			}
		}
		System.out.println("It took you " + numGuesses + " guesses.");
	}
}
