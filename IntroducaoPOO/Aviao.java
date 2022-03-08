package IntroducaoPOO;

public class Aviao {
	
	// Atributos -> caracter�sticas
	
	String modelo;
	boolean voando, pronto, iniciado; 
	
	public void  ligar()
	{
		this.iniciado = true;
	}
	
	public void decolar()
	{
		if (this.iniciado == true)
		{
			System.out.println("Iniciando decolagem");
			this.voando = true;
		}
		else
			System.out.println("Para a decolagem o processo deve ser iniciado.");
	}
	
	public void desligar()
	{
		this.iniciado = false;
	}
	
	public void pousar()
	{
		if (this.voando == true)
			System.out.println("Os procedimentos de pouso foram iniciados.\n");
		else
			System.out.println("A aeronave j� esta pousada.");
	}
	
	public void estado()
	{
		System.out.println("Indique o modelo do avi�o: "+this.modelo);
		System.out.println("O avi�o est� iniciando procedimentos de decolagem? "+this.iniciado);
		System.out.println("O avi�o decolou? "+this.voando);
	}
}