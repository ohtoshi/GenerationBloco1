package LacoCondicional;

import java.util.Scanner;

/* 4. Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar.
 * Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
 */

public class Exercicio4 {

	public static void main(String[] args)
	{
		double num;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Insira um n�mero: ");
		num = ler.nextInt();
		
		if (num%2 != 0)
		{
			System.out.print("\nO n�mero informado � �mpar.");
			System.out.print("\nE elevado ao quadrado �: "+Math.pow(num,2)+".");
		}
		else
		{
			System.out.print("\nO n�mero informado � par.");
			System.out.print("\nE sua raiz quadrada �: "+Math.sqrt(num)+".");
		}

	}

}
