package Introducao;

/*
 * 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor
 * e dos impostos (aplicados ao custo de f�brica).
 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
 * escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor. 
 */

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		double cConsumidor, cFabrica, perDistribuidor, impostos;
				
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Insira o valor do custo de f�brica: R$ ");
		cFabrica = ler.nextInt();
		
		perDistribuidor = cFabrica*0.28;
		impostos = cFabrica*0.45;

		
		cConsumidor = cFabrica + perDistribuidor + impostos;
		
		
		System.out.print("O custo do carro ao consumidor � R$ "+cConsumidor+".");
	}

}
