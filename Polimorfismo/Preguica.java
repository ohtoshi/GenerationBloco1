package Polimorfismo;

public class Preguica extends Animal{

	String habilidade = "subir em �rvores";

	public String escalar() {
		return habilidade;
	}
	
	@Override
	public void som() {
		System.out.print("emite sons de alta frequ�ncia");
	}
}
