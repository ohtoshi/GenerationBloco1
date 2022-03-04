package LacoDeRepeticao;

import java.util.Scanner;

/*4. Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos
 * indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado:
 * idade, sexo (1-feminino / 2-masculino / 3-Outros),
 * e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3,
 * se a pessoa era agressiva).
 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas,
 * calcule e mostre: (WHILE)
 * 
•	o número de pessoas calmas; 
•	o número de mulheres nervosas; 
•	o número de homens agressivos; 
•	o número de outros calmos;
•	o número de pessoas nervosas com mais de 40 anos; 
•	o número de pessoas calmas com menos de 18 anos.
*/

public class Exercicio4 {

	public static void main(String[] args)
	{
		int x = 0, idade = 0, contCalm = 0, mat[][] = new int[5][3];
		
		Scanner ler = new Scanner(System.in);
		
		while (x<5)
		{
			for (int y=0; y<3; y++)
			{
				if (y == 0)
				{
					System.out.print("Informe sua idade: ");
					mat[x][y] = ler.nextInt();
				}
				else if (y == 1)
				{
					System.out.print("Informe seu sexo: ");
					mat[x][y] = ler.nextInt();	
				}
				else
				{
					System.out.print("Informe seu temperamento: ");
					mat[x][y] = ler.nextInt();
				}
			}
			
		} 
		

	}

}
