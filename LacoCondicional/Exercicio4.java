package LacoCondicional;

import java.util.Scanner;

/* 4. Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar.
 * Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
 */

public class Exercicio4 {

	public static void main(String[] args)
	{
		double num;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		num = ler.nextInt();
		
		if (num%2 != 0)
		{
			System.out.print("\nO número informado é ímpar.");
			System.out.print("\nE elevado ao quadrado é: "+Math.pow(num,2)+".");
		}
		else
		{
			System.out.print("\nO número informado é par.");
			System.out.print("\nE sua raiz quadrada é: "+Math.sqrt(num)+".");
		}

	}

}
