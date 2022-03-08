package IntroducaoPOO;

public class Cliente {
	
	// Atributos -> características
	
	String nome, apelido;
	int codigo, numPedidos;
	long cpf;
	
	// Métodos -> comportamentos
	
	public void desconto()
	{
		if (this.numPedidos==20)
			System.out.print("\n"+apelido+", você terá 5% de desconto no próximo pedido!\n");
		else
			System.out.print("\n"+apelido+", muito obrigade pela compra e preferência! Volte sempre!\n");
	}
	
	public void estado()
	{
		System.out.println("Nome: "+ this.nome);
		System.out.println("Apelido: " + this.apelido);
		System.out.println("Código cliente: "+ this.codigo);
		System.out.println("CPF: "+this.cpf);
		System.out.print("Número de pedidos: "+this.numPedidos);
	}
}


