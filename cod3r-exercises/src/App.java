import initial.code.Artigo;

import java.time.LocalDate;

public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello, World!");
		
		Artigo artigo1 = new Artigo("Java Basics", "John Doe", LocalDate.of(2023, 1, 15), "Programming");
		
		System.out.println(artigo1);
		artigo1.countHello();
		if (args.length > 0) {
			System.out.println("Primeiro argumento: " + args[args.length - 1]);
		}
	}
}
