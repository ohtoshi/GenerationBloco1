/*2. Crie uma classe avi�o e apresente os atributos e m�todos referentes
 * esta classe, em seguida crie um objeto avi�o, defina as instancias deste
 * objeto e apresente as informa��es deste objeto no console.
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