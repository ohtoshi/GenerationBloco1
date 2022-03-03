package LacoCondicional;

import java.util.Scanner;

/*1. Faça um programa que receba três inteiros e diga qual deles é o maior.
 */

public class Exercicio1 {

	public static void main(String[] args)
	{
		int num1, num2, num3, maiorNumero;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Insira o primeiro número: ");
		num1 = ler.nextInt();
		System.out.print("Insira o segundo número: ");
		num2 = ler.nextInt();
		System.out.print("Insira o terceiro número: ");
		num3 = ler.nextInt();
		
		if (num1 > num2 && num1 > num3)
			System.out.print("\nO primeiro número é o maior.");
		else if (num2 > num1 && num2 > num3)
			System.out.print("\nO segundo número é o maior.");
		else
			System.out.print("\nO terceiro número é o maior.");

	}

}
