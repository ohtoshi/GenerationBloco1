package Introducao;

import java.util.Scanner;

/*
 * 1. Faça um sistema que leia a idade de uma pessoa expressa em anos,
 * meses e dias e mostre-a expressa apenas em dias. 
 */

public class Exercicio1 {

	public static void main(String[] args) {
		
		int idadeAnos, idadeMeses, idadeDias, idadeDiasFinal, idadeAnosConvertido, idadeMesesConvertido;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe sua idade (em anos, meses e dias): anos - ");
		idadeAnos=ler.nextInt();
		System.out.print("Informe sua idade (em anos, meses e dias): meses - ");
		idadeMeses=ler.nextInt();
		System.out.print("Informe sua idade (em anos, meses e dias): dias - ");
		idadeDias=ler.nextInt();
		
		idadeAnosConvertido = idadeAnos*365;
		idadeMesesConvertido = idadeMeses*30;
		idadeDiasFinal = idadeAnosConvertido+idadeMesesConvertido+idadeDias;
		
		System.out.println("\nSua idade em dias é de: "+idadeDiasFinal+" dias");
		
	}

}
