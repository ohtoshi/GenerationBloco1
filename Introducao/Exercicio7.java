package Introducao;

/*
 * 7. Um sistema de equações lineares do tipo:
 * ax + by = c
 * dx + ey = f
 * Pode ser resolvido segundo mostrado abaixo:
 * x = ((c*e)-(b*f))/((a*e)-(b*d));
 * y = ((a*f)-(c*d))/((a*e)-(b*d));
 */

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		double a, b, c, d, e, f, x, y;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Insira o valor de a: ");
		a = ler.nextInt();
		
		System.out.print("Insira o valor de b: ");
		b = ler.nextInt();
		
		System.out.print("Insira o valor de c: ");
		c = ler.nextInt();
		
		System.out.print("Insira o valor de d: ");
		d = ler.nextInt();
		
		System.out.print("Insira o valor de e: ");
		e = ler.nextInt();
		
		System.out.print("Insira o valor de f: ");
		f = ler.nextInt();
		
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.print("O valor de x é "+x+" e o valor de y é "+y+".");

	}

}
