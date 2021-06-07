package Aula4;

import java.util.Scanner;

public class Aula4Java 
{

	public static void main(String[] args) 
	{
		final int y=4;
		float [] notas = new float[y];
		float somanotas=0,media;
		Scanner leia = new Scanner(System.in);
		
		for(int x=0;x<notas.length;x++)
		{
			System.out.println("\nEntre com a sua nota: ");
			notas[x] = leia.nextFloat();
					
			somanotas += notas[x]; // somanotas = somanota + notas[x]
		}
		media = somanotas / notas.length;
		System.out.printf("\nMédia das notas: %2.2f",media);
	}

}
