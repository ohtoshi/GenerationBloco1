package IntroducaoPOO;

public class Cliente {
	
	// Atributos -> caracter�sticas
	
	String nome, apelido;
	int codigo, numPedidos;
	long cpf;
	
	// M�todos -> comportamentos
	
	public void desconto()
	{
		if (this.numPedidos==20)
			System.out.print("\n"+apelido+", voc� ter� 5% de desconto no pr�ximo pedido!\n");
		else
			System.out.print("\n"+apelido+", muito obrigade pela compra e prefer�ncia! Volte sempre!\n");
	}
	
	public void estado()
	{
		System.out.println("Nome: "+ this.nome);
		System.out.println("Apelido: " + this.apelido);
		System.out.println("C�digo cliente: "+ this.codigo);
		System.out.println("CPF: "+this.cpf);
		System.out.print("N�mero de pedidos: "+this.numPedidos);
	}
}


