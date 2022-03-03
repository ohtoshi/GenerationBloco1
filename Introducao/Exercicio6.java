package Introducao;

import java.util.Scanner;

/*
 * 6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2),
 * escreva a distância entre eles. A fórmula que efetua tal cálculo é: 
 * d = raiz quadrada de: (x2-x1)² + (y2-y1)²
 */

public class Exercicio6 {

	public static void main(String[] args) {

		double x1, x2, y1, y2, d;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Insira o valor de x1: ");
		x1 = ler.nextInt();
		System.out.print("Insira o valor de x2: ");
		x2 = ler.nextInt();
		System.out.print("Insira o valor de y1: ");
		y1 = ler.nextInt();
		System.out.print("Insira o valor de y2: ");
		y2 = ler.nextInt();

		d = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		System.out.println("O resultado de D é "+d);

	}

}
