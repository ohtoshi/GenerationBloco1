package LacoDeRepeticao;

import java.util.Scanner;

/* 5. Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)
 */

public class Exercicio5 {

	public static void main(String[] args)
	{
		int num = 0, soma = 0;
				
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.print("Insira um n�mero: ");
			num = ler.nextInt();
			
			soma = num + soma;
			
		}while (num>0);
		
		System.out.print("\nA soma dos n�meros informados �: "+soma);
	}

}
