package introdutory;

import java.util.Scanner;

public class Exe3 {
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		scanner.useLocale(java.util.Locale.US);

		int T = 1;
		// int T = scanner.nextInt();
		// scanner.nextLine();
		
		while (T > 0) {
			solve();
			T--;
		}
	}


	private static void solve() {
		int i = scanner.nextInt(); scanner.nextLine();
		double d = scanner.nextDouble(); scanner.nextLine();
		String s = scanner.nextLine();

		System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
	} 
}
