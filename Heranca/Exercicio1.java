/*
 * Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
 * comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
 * características de forma que tudo o que for comum a todos os animais fique na classe
Animal:
 */

package Heranca;

public class Exercicio1 {

	public static void main(String[] args)
	{   
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica preg = new Preguica();
		
		dog.setNome("Totó");
		dog.setIdade(3);
		dog.setSom("emite som");
		dog.correr();
		
		horse.setNome("Rapidash");
		horse.setIdade(5);
		horse.setSom("emite som");
		horse.correr();
		
		preg.setNome("Slakoth");
		preg.setIdade(10);
		preg.setSom("não emite som");
		preg.escalar();
		
		System.out.print("O nome do cachorro é "+dog.getNome()+
				", ele tem "+dog.getIdade()+" anos, "+dog.getSom()+ " e ele pode "+dog.correr()+".");
		System.out.print("\nO nome do cavalo é "+horse.getNome()+
				", ele tem "+horse.getIdade()+" anos, "+horse.getSom()+ " e ele pode "+horse.correr()+".");
		System.out.print("\nO nome da preguiça é "+preg.getNome()+
				", ela tem "+preg.getIdade()+" anos, "+preg.getSom()+ " e ela pode "+preg.escalar()+".");

	}

}
