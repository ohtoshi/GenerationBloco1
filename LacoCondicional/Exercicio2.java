package LacoCondicional;

import java.util.Scanner;

/* 2. Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
 */

public class Exercicio2 {

	public static void main(String[] args)
	{
		int num1, num2, num3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Insira o primeiro n�mero: ");
		num1 = ler.nextInt();
		System.out.print("Insira o segundo n�mero: ");
		num2 = ler.nextInt();
		System.out.print("Insira o terceiro n�mero: ");
		num3 = ler.nextInt();
		
		if (num1 > num2 && num1 > num3 && num2 > num3)
			System.out.print("\nA ordem crescente dos n�meros �: "+num3+", "+num2+", "+num1+".");
		else if (num1 > num2 && num1 > num3 && num3 > num2)
			System.out.print("\nA ordem crescente dos n�meros �: "+num2+", "+num3+", "+num1+".");
		else if (num2 > num1 && num2 > num3 && num1 > num3)
			System.out.print("\nA ordem crescente dos n�meros �: "+num3+", "+num1+", "+num2+".");
		else if (num2 > num1 && num2 > num3 && num3 > num1)
			System.out.print("\nA ordem crescente dos n�meros �: "+num1+", "+num3+", "+num2+".");
		else if (num3 > num1 && num3 > num2 && num1 > num2)
			System.out.print("\nA ordem crescente dos n�meros �: "+num2+", "+num1+", "+num3+".");
		else if (num3 > num1 && num3 > num2 && num2 > num1)
			System.out.print("\nA ordem crescente dos n�meros �: "+num1+", "+num2+", "+num3+".");
		else
			System.out.print("\nA ordem crescente dos n�meros �: "+num1+", "+num2+", "+num3+".");
			

	}

}
