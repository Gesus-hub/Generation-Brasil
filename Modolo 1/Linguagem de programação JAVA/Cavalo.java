package Aula6;

public class Cavalo extends Animal
{
	public Cavalo()
	{
		super("cavalo");
	}
	public void Nome(String nomeAnimal)
	{
		System.out.println("\nNome do cavalo: "+nomeAnimal);
	}
	public void Idade(int idadeAnimal)
	{
		System.out.println("\nQual a idade do cavalo: "+idadeAnimal);
	}
	public void Som(String somAnimal)
	{
		System.out.println("\nSom que o cavalo realiza: "+somAnimal);
	}
	public void Correr()
	{
		System.out.println("\nMeu cavalo ama correr pelos pastos verdejantes!");
	}
}
