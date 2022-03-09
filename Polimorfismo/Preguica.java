package Polimorfismo;

public class Preguica extends Animal{

	String habilidade = "subir em árvores";

	public String escalar() {
		return habilidade;
	}
	
	@Override
	public void som() {
		System.out.print("emite sons de alta frequência");
	}
}
