package LacoCondicional;

import java.util.Scanner;

/*1. Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */

public class Exercicio1 {

	public static void main(String[] args)
	{
		int num1, num2, num3, maiorNumero;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Insira o primeiro n�mero: ");
		num1 = ler.nextInt();
		System.out.print("Insira o segundo n�mero: ");
		num2 = ler.nextInt();
		System.out.print("Insira o terceiro n�mero: ");
		num3 = ler.nextInt();
		
		if (num1 > num2 && num1 > num3)
			System.out.print("\nO primeiro n�mero � o maior.");
		else if (num2 > num1 && num2 > num3)
			System.out.print("\nO segundo n�mero � o maior.");
		else
			System.out.print("\nO terceiro n�mero � o maior.");

	}

}
