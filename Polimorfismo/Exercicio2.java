/*2. Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior
 * e invoque o método que emite o som de cada um de forma polimórfica, isto é,
 * independente do tipo de animal.
 */

package Polimorfismo;

public class Exercicio2 {

	public static void main(String[] args)
	{   
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica preg = new Preguica();
		
		dog.setNome("Totó");
		dog.setIdade(3);
		dog.correr();
		
		horse.setNome("Rapidash");
		horse.setIdade(5);
		horse.correr();
		
		preg.setNome("Slakoth");
		preg.setIdade(10);
		preg.escalar();
		
		System.out.print("O nome do cachorro é "+dog.getNome()+
				", ele tem "+dog.getIdade()+" anos, ");dog.som();
		System.out.print(" e pode "+dog.correr()+".");
		System.out.print("\nO nome do cavalo é "+horse.getNome()+
				", ele tem "+horse.getIdade()+" anos, ");horse.som();
		System.out.print(" e pode "+horse.correr()+".");
		System.out.print("\nO nome da preguiça é "+preg.getNome()+
				", ela tem "+preg.getIdade()+" anos, ");preg.som();
		System.out.print(" e pode "+preg.escalar()+".");
	}
}