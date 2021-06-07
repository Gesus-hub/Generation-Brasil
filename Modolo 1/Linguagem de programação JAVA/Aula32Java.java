package Aula3Java;

import java.util.Scanner;

public class Aula32Java 
{

	public static void main(String[] args) 
	{
		int num,somapar=0,somaimpar=0,contpar=0,contimpar=0,somageral=0;
		float mediapar,mediaimpar,mediageral=0;
		Scanner luis= new Scanner(System.in);
		
		System.out.println("\nEntre com um numero: ");
		num=luis.nextInt();
		
		do
		{
			if(num>=0)
			{
				if(num%2==0)
				{
					somapar+=num;
					contpar++;
				}
				else
				{
					somaimpar+=num;
					contimpar++;
				}
				somageral+=num;
			}
			System.out.println("\nEntre com um numero: ");
			num = luis.nextInt();
		}
		while(num!=0);
		
		mediapar=somapar/contpar;
		mediaimpar=somaimpar/contimpar;
		mediageral=mediaimpar+mediapar;
		System.out.printf("\nMedia dos numeros pares: %.2f", mediapar);
		System.out.printf("\nMedia dos numeros impares: %.2f", mediaimpar);
		System.out.printf("\nMedia geral: %.2f", mediageral);
	}

}
