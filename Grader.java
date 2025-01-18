import java.util.*;

class Grader {
	public static void main(String[] args) {
		var scan = new Scanner(System.in);

		int n;
		n = scan.nextInt(); // this is the first number in the grades.txt which will tell me how many grades there are
		int original[] = new int[n];
		int rounded[] = new int[n];

		for (int i = 0; i < n; i++) {
			original[i] = scan.nextInt();
		}
		for (int j = 0; j < n; j++) {
			if (original[j] >= 40) {
				if (original[j] % 5 == 0) { // if it is already a multiple of 5
					rounded[j] = original[j];
				} else  if (5 - (original[j] % 5) >= 3) {
					rounded[j] = original[j];
				} else {
					rounded[j] = original[j];
					rounded[j] += 5 - (original[j] % 5);
				}
			} else {
				rounded[j] = original[j];
			}
		}
		for (int k = 0; k < n; k++) {
			System.out.println(rounded[k]);
		}
		scan.close();
	}
}
