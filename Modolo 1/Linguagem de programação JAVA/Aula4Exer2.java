package Aula4;

import java.util.Scanner;

/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre:
� Os n�meros pares digitados;
� A soma dos n�meros pares digitados;
� Os n�meros �mpares digitados;
� A quantidade de n�meros �mpares digitados.*/

public class Aula4Exer2 
{
	public static void main(String[] args)
	{
		final int z=6;
		int[] num = new int[z];
		int contpar=0,somapar=0, paresdig=0,contimpar=0,somaimpar=0;
		Scanner leia = new Scanner(System.in);
		
		for(int x=0;x<num.length;x++)
		{
			System.out.println("\nEntre com os numeros: ");
			num[x]=leia.nextInt();
		
			if(num[x]%2==0)
			{
				contpar++;
				somapar+=num[x];	
			}
			else
			{
				contimpar++;
				somaimpar+=num[x];
			}
		}
		System.out.println("\nA soma dos numeros pares informados �: "+somapar);
		System.out.println("\nForam informados "+contimpar+" numeros impares.");
		
		System.out.println("\nOs numeros pares informados foram: ");
		
		for(int x=0;x<num.length;x++)
		{
		
			if(num[x]%2==0)
			{
				System.out.println("\n\t"+num[x]);
			}
		}	
		System.out.println("\nOs numeros impares informados foi: ");
		for(int x=0;x<num.length;x++)
		{
			if(num[x]%2==1)
			{
				System.out.println("\n\t"+num[x]);
			}
		}	
	}

}
