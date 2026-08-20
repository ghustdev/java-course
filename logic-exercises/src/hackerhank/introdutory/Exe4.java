package introdutory;

import java.util.Scanner;

public class Exe4 {
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
		System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=scanner.next();
            int x=scanner.nextInt();
            
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
	} 
}
