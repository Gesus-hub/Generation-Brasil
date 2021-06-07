package Aula3Java;

import java.util.Scanner;

	/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	idade for =-99. (WHILE)*/

public class Aula3Exer3 
{
	public static void main(String[] args)
	{
		int idade=0,contp21=0,contp50=0;
		Scanner leia = new Scanner(System.in);
		
		while(idade!=-99)
		{
			System.out.println("\nQual sua idade: ");
			idade = leia.nextInt();	
			
			if(idade>0 & idade<21)
			{
				contp21++;
			}
			else if(idade>50)
			{
				contp50++;
			}
		}
		System.out.println("\nParticiparam da pesquisa "+contp21+" pessoas com ate 21 anos.");
		System.out.println("\nParticiparam da pesquisa "+contp50+" pessoas com mais de 50 anos.");
	}
}
