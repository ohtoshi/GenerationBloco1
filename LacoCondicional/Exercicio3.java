package LacoCondicional;

import java.util.Scanner;

/*3. Fa�a um programa que receba a idade de uma pessoa
 * e mostre na sa�da em qual categoria ela se encontra:
�	10-14 infantil
�	15-17 juvenil
�	18-25 adulto
*/

public class Exercicio3 {

	public static void main(String[] args)
	{
		int idade;
	
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Insira a idade: ");
		idade = ler.nextInt();
		
		if (idade >= 10 && idade <= 14)
				System.out.print("\nA categoria na qual a pessoa est� inserida � a infantil.");
		else if (idade >=15 && idade <=17)
				System.out.print("\nA categoria na qual a pessoa est� inserida � a juvenil.");
		else if (idade >=18 && idade <=25)
			System.out.print("\nA categoria na qual a pessoa est� inserida � a adulto.");
		else
			System.out.print("\nEsta pessoa n�o est� inserida em nenhuma categoria.");
	}

}
