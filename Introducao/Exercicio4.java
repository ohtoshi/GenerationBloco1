package Introducao;

import java.util.Scanner;

/*
 * 4. Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o:
 * D = (R + S)/2, onde R = (A+B)� e S = (B + C)�
 */

public class Exercicio4 {

	public static void main(String[] args) {
		
		int A, B, C;
		double R, S, D;
		
		Scanner ler = new Scanner(System.in);
				
		System.out.print("Informe o valor de A: ");
		A = ler.nextInt();
		System.out.print("Informe o valor de B: ");
		B = ler.nextInt();
		System.out.print("Informe o valor de C: ");
		C = ler.nextInt();

		R = Math.pow(A+B, 2.0);
		S = Math.pow(B+C, 2.0);
		D = (R+S)/2;
		
		System.out.println("O valor de D � "+D+".");

	}

}
