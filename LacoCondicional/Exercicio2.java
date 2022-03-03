package LacoCondicional;

import java.util.Scanner;

/* 2. Faça um programa que entre com três números e coloque em ordem crescente.
 */

public class Exercicio2 {

	public static void main(String[] args)
	{
		int num1, num2, num3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Insira o primeiro número: ");
		num1 = ler.nextInt();
		System.out.print("Insira o segundo número: ");
		num2 = ler.nextInt();
		System.out.print("Insira o terceiro número: ");
		num3 = ler.nextInt();
		
		if (num1 > num2 && num1 > num3 && num2 > num3)
			System.out.print("\nA ordem crescente dos números é: "+num3+", "+num2+", "+num1+".");
		else if (num1 > num2 && num1 > num3 && num3 > num2)
			System.out.print("\nA ordem crescente dos números é: "+num2+", "+num3+", "+num1+".");
		else if (num2 > num1 && num2 > num3 && num1 > num3)
			System.out.print("\nA ordem crescente dos números é: "+num3+", "+num1+", "+num2+".");
		else if (num2 > num1 && num2 > num3 && num3 > num1)
			System.out.print("\nA ordem crescente dos números é: "+num1+", "+num3+", "+num2+".");
		else if (num3 > num1 && num3 > num2 && num1 > num2)
			System.out.print("\nA ordem crescente dos números é: "+num2+", "+num1+", "+num3+".");
		else if (num3 > num1 && num3 > num2 && num2 > num1)
			System.out.print("\nA ordem crescente dos números é: "+num1+", "+num2+", "+num3+".");
		else
			System.out.print("\nA ordem crescente dos números é: "+num1+", "+num2+", "+num3+".");
			

	}

}
