package Introducao;

import java.util.Scanner;

/*
 * 5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno.
 * Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente. 
 */

public class Exercicio5 {

	public static void main(String[] args) {

		double N1, N2, N3, media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Insira a primeira nota: ");
		N1 = ler.nextInt();
		System.out.print("Insira a segunda nota: ");
		N2 = ler.nextInt();
		System.out.print("Insira a terceira nota: ");
		N3 = ler.nextInt();
		
		media = ((N1*2)+(N2*3)+(N3*5))/10;
		
		System.out.println("A m�dia do alune �: "+media);

	}

}
