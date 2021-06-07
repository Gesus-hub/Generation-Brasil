package Aula3Java;

import java.util.Scanner;

public class Aula31Java 
{
	public static void main(String[] args)
	{
		int num,somapar=0,contpar=0;
		float mediapar;
		Scanner liza = new Scanner(System.in);
		
		System.out.println("\nEntre com um numero: ");
		num = liza.nextInt();
		
		while(num!=0)
		{
			if(num%2==0)
			{
				somapar=somapar+num;
				contpar++;
			}
			System.out.println("\nEntre com um numero: ");
			num=liza.nextInt();
			
		}
		mediapar=somapar/contpar;
		
		System.out.printf("\nMedia dos numeros pares: %2.2f",mediapar);
	}

}
