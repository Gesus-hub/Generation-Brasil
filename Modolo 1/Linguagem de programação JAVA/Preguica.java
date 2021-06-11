package Aula6;

public class Preguica extends Animal
{
	public Preguica()
	{
		super("preguica");
	}
	@Override
	public void Nome(String nomeAnimal)
	{
		System.out.println("\nNome da preguicinha: "+nomeAnimal);
	}
	@Override
	public void Idade(String idadeAnimal)
	{
		System.out.println("\nIdade da preguicinha: "+idadeAnimal);
	}
	@Override
	public void Som(String somAnimal)
	{
		System.out.println("\nSom que a preguica realiza: "+somAnimal);
	}
	public void subirArvore()
	{
		System.out.println("\nA preguica dorme cerca de 14h por dia nas arvores.");
	}
}
