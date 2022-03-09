/*2. Implemente um programa que crie os 3 tipos de animais definidos no exerc�cio anterior
 * e invoque o m�todo que emite o som de cada um de forma polim�rfica, isto �,
 * independente do tipo de animal.
 */

package Polimorfismo;

public class Exercicio2 {

	public static void main(String[] args)
	{   
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica preg = new Preguica();
		
		dog.setNome("Tot�");
		dog.setIdade(3);
		dog.correr();
		
		horse.setNome("Rapidash");
		horse.setIdade(5);
		horse.correr();
		
		preg.setNome("Slakoth");
		preg.setIdade(10);
		preg.escalar();
		
		System.out.print("O nome do cachorro � "+dog.getNome()+
				", ele tem "+dog.getIdade()+" anos, ");dog.som();
		System.out.print(" e pode "+dog.correr()+".");
		System.out.print("\nO nome do cavalo � "+horse.getNome()+
				", ele tem "+horse.getIdade()+" anos, ");horse.som();
		System.out.print(" e pode "+horse.correr()+".");
		System.out.print("\nO nome da pregui�a � "+preg.getNome()+
				", ela tem "+preg.getIdade()+" anos, ");preg.som();
		System.out.print(" e pode "+preg.escalar()+".");
	}
}