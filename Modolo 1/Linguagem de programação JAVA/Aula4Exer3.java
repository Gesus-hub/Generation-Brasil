package Aula4;

import java.util.Scanner;

/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/

public class Aula4Exer3 
{
	public static void main(String[] args)
	{
		final int l=3,c=3;
		int [][] num=new int[l][c];
		int maior=0;
		Scanner leia = new Scanner(System.in);
		
		for(int x=0;x<l;x++)
		{
			for(int y=0;y<c;y++)
			{
				System.out.println("\nEntre com os numeros: ");
				num[l][c]=leia.nextInt();
				
				if(num[l][c]>10)
				{
					maior++;
				}
			}
		}
		System.out.println("\nVoce digitou "+maior+" numeros maiores que 10.");
	}

}
