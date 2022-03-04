package LacoDeRepeticao;

import java.util.Scanner;

/*3. Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
 */

public class Exercicio3 {

	public static void main(String[] args)
	{
		int idade = 0, contador1 = 0, contador2 = 0;
		
		Scanner ler = new Scanner(System.in);
		
		while (idade>-99)
		{
				System.out.print("Digite a idade: ");
				idade = ler.nextInt();
				
				if (idade < 21)
					contador1++;
				else if (idade > 50)
					contador2++;
		}
		
		System.out.println("O número de pessoas com menos de 21 anos é: "+contador1);
		System.out.println("O número de pessoas com mais de 50 anos é: "+contador2);
		

	}

}
