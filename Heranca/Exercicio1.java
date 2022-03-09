/*
 * Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
 * comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
 * caracter�sticas de forma que tudo o que for comum a todos os animais fique na classe
Animal:
 */

package Heranca;

public class Exercicio1 {

	public static void main(String[] args)
	{   
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica preg = new Preguica();
		
		dog.setNome("Tot�");
		dog.setIdade(3);
		dog.setSom(true);
		dog.setCorrer(true);
		
		horse.setNome("Tot�");
		horse.setIdade(3);
		horse.setSom(true);
		horse.setCorrer(true);
		
		preg.setNome("Tot�");
		preg.setIdade(3);
		preg.setSom(true);
		preg.setCorrer(true);
		
		System.out.print("O nome do cachorro � "+dog.getNome()+", a idade dele � "+dog.getIdade());
		System.out.print("A idade dele �");
		System.out.print("\ne ele corre (" +dog.isCorrer()+ ")");


	}

}
