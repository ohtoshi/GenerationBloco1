package Polimorfismo;

public class Cavalo extends Animal{

	String habilidade = "correr";
		
	public String correr() {
		return habilidade;
	}
	
	@Override
	public void som() {
		System.out.print("relincha");
	}
}
