package Introducao;

import java.util.Scanner;

/*
 * 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos,
 * meses e dias.
 */

public class Exercicio2 {

	public static void main(String[] args) {
		
		int idade, idadeAnos, idadeMeses, idadeDias;	
		Scanner ler = new Scanner(System.in);		
		
		System.out.print("Informe sua idade em dias: ");
		idade=ler.nextInt();
		
		idadeAnos = idade/365;
		idadeMeses = idade%365/30;
		idadeDias = idade%365%30;
		
		System.out.println("\nVocê tem "+idadeAnos+" anos, "+idadeMeses+" meses "+"e "+idadeDias+" dias.");

	}

}
