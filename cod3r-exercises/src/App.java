import initial.code.Artigo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

import java.lang.Math;

public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello, World!");
		
		Artigo artigo1 = new Artigo("Java Basics", "John Doe", LocalDate.of(2023, 1, 15), "Programming");
		
		System.out.println(artigo1);
		artigo1.countHello();
		if (args.length > 0) {
			System.out.println("Primeiro argumento: " + args[args.length - 1]);
		}
		
		Date data = new Date();
		System.out.println(data);
		
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: "
				+ sobrenome + "\nIdade: " + idade +
				"\nSalario: " + salario + "\n\n";
		System.out.println(maisUmaFrase);
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.",
				nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.",
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
		
		String n1 = "7.9";
		String n2 = "8.3";
		
		System.out.println(n1);
		System.out.println(n2);
		
		BigDecimal numero1 = new BigDecimal(n1);
		BigDecimal numero2 = new BigDecimal(n2);
//		Double numero1 = Double.parseDouble(n1);
//		Double numero2 = Double.parseDouble(n2);
		
		System.out.println(numero1);
		System.out.println(numero2);
		
		BigDecimal soma = numero1.add(numero2);
//		Double soma = numero1 + numero2;
		
		System.out.println(soma);
		
		System.out.println(Math.abs(-10));
		System.out.println((int) Math.pow(2, 4));
		
		System.out.println(1 ^ 3);
		System.out.println(1 ^ 1);
	}
}
