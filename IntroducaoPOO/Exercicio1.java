/*1. Crie uma classe cliente e apresente os atributos e m�todos referentes
 * esta classe, em seguida crie um objeto cliente, defina as instancias deste
 * objeto e apresente as informa��es deste objeto no console.
*/

package IntroducaoPOO;

public class Exercicio1 {

	public static void main(String[] args)
	{
		Cliente c1 = new Cliente();

	//	c1.estado();
		c1.nome = "Jos�";
		c1.apelido = "Z�";
		c1.codigo = 123;
		c1.cpf = 123456789;
		c1.numPedidos = 20;
		c1.estado();
		c1.desconto();	
	}
}
