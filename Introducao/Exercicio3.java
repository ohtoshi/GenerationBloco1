package Introducao;

import java.util.Scanner;

/*
 * 3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos e
 * mostre-o expresso em horas, minutos e segundos. 
 */

public class Exercicio3 {

	public static void main(String[] args) {
		
		int tempo, tempoMinutos, tempoHoras, tempoSegundos;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o tempo de dura��o do evento em segundos: ");
		tempo = ler.nextInt();
		
		tempoHoras = tempo/3600;
		tempoMinutos = tempo%3600/60;
		tempoSegundos = tempo%3600%60;
		
		System.out.println("\nO tempo de dura��o do evento foi de  "+tempoHoras+" horas, "+tempoMinutos+" minutos "+"e "+tempoSegundos+" segundos.");

	}

}
