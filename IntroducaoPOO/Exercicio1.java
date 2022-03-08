/*1. Crie uma classe cliente e apresente os atributos e métodos referentes
 * esta classe, em seguida crie um objeto cliente, defina as instancias deste
 * objeto e apresente as informações deste objeto no console.
*/

package IntroducaoPOO;

public class Exercicio1 {

	public static void main(String[] args)
	{
		Cliente c1 = new Cliente();

	//	c1.estado();
		c1.nome = "José";
		c1.apelido = "Zé";
		c1.codigo = 123;
		c1.cpf = 123456789;
		c1.numPedidos = 20;
		c1.estado();
		c1.desconto();	
	}
}
