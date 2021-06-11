package Aula6;

public class Cachorro extends Animal
{
	public Cachorro()
	{
		super("cachorro");
	}
	@Override
	public void Nome(String nomeAnimal)
	{
		System.out.println("\nNome do cachorro: "+nomeAnimal);
	}
	@Override
	public void Idade(int idadeAnimal)
	{
		System.out.println("\nQual idade do cachorro: "+idadeAnimal);
	}
	@Override
	public void Som(String somAnimal)
	{
		System.out.println("\nSom que seu cachorro realiza: "+somAnimal);
	}
	public void corre()
	{
		System.out.println("\nEle nao para queto, corre demais!");
	}
}
