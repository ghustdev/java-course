package introdutory;

import java.util.Scanner;

public class Exe2 {
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int T = 1;
		// int T = scanner.nextInt();
		// scanner.nextLine();
		
		while (T > 0) {
			solve();
			T--;
		}
	}


	private  static void solve() {
		int n = scanner.nextInt();
		scanner.nextLine();

		if (n % 2 != 0) System.out.println("Weird");
		else if (n % 2 == 0 && (2 <= n && n <= 5)) System.out.println("Not Weird");
		else if (n % 2 == 0 && (6 <= n && n <= 20)) System.out.println("Weird");
		else if (n % 2 == 0 && n > 20) System.out.println("Not Weird");
	} 
}
