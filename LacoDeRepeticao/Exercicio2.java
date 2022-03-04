package LacoDeRepeticao;

import java.util.Scanner;

/*2. Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */

public class Exercicio2 {

	public static void main(String[] args)
	{
		int num, contadorPar = 0, contadorImpar = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for (int x = 0; x < 10; x++)
		{
			System.out.print("Digite um número: ");
			num = ler.nextInt();
			
			if (num%2 == 0) {
				contadorPar++;
			}
			else {
				contadorImpar++;
			}	
		}
		
		System.out.print("\nA quantidade de números pares é: "+contadorPar);
		System.out.print("\nA quantidade de números ímpares é: "+contadorImpar);
	}
}
