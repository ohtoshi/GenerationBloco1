/*2. Crie uma classe avião e apresente os atributos e métodos referentes
 * esta classe, em seguida crie um objeto avião, defina as instancias deste
 * objeto e apresente as informações deste objeto no console.
*/

package IntroducaoPOO;

public class Exercicio2 {

	public static void main(String[] args)
	{
		Aviao boeing = new Aviao();
		Aviao boeing2 = new Aviao();		
		
		boeing.modelo = "Boeing 777";
		boeing2.modelo = "Boeing 737";
		
		boeing.ligar();
		boeing.decolar();		
		boeing.estado();
		boeing.pousar();
		
		boeing2.estado();
		boeing2.desligar();
		boeing2.pousar();	
	}
}