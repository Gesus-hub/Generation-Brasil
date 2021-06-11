package Aula6;

import java.util.Scanner;

public class TesteAnimal 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		Animal animal = null;
		int x;
		do
		{
			System.out.println("\nQual o tipo do seu animal?\n\n1-Cachorro\n2-Cavalo\n3-Preguica\n");
			x=leia.nextInt();
			
			if(x==1)
			{
				animal=cachorro;
				System.out.println("\nQual nome do seu doguinho: ");
				String nome = leia.next();
				System.out.println("\nQuantos aninhos ele tem: ");
				int idade = leia.nextInt();
				System.out.println("\nQual som seu cachorro realiza: ");
				String som = leia.next();
				System.out.println("-----------------------------------------------------");
				
				cachorro.Nome(nome);
				cachorro.Idade(idade);
				cachorro.Som(som);
				Cachorro.Corre();
			}else if(x==2)
			{
				animal=cavalo;
				System.out.println("\nQual nome do seu pocoto: ");
				String nome = leia.next();
				System.out.println("\nQuanto anos ele tem: ");
				int idade = leia.nextInt();
				System.out.println("\nQual som seu pocoto realiza: ");
				String som = leia.next();
				System.out.println("-----------------------------------------------------");
				
				cavalo.Nome(nome);
				cavalo.Idade(idade);
				cavalo.Som(som);
				cavalo.Correr();
			}else if(x==3)
			{
				animal=preguica;
				System.out.println("\nQual nome da sua preguica: ");
				String nome = leia.next();
				System.out.println("\nQuantos anos ela tem: ");
				int idade = leia.nextInt();
				System.out.println("\nQual som ela realiza: ");
				String som = leia.next();
				System.out.println("-----------------------------------------------------");
				
				preguica.Nome(nome);
				preguica.Idade(idade);
				preguica.Som(som);
				preguica.subirArvore();
			}else
			{
				System.out.println("\nInformacao invalida!");
			}
		}
		while(x<=0 || x>=4);	
	}

}
