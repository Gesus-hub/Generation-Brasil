package Aula3Java;

import java.util.Scanner;

public class Aula3Exer6 
{

	public static void main(String[] args) 
{
		int num,somamult3=0,contmult3=0;
		float mediamult3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um numero: ");
		num = leia.nextInt();
		
		do
		{
			while(num!=0)
				if(num!=0)
				{
					if(num%3==0)
					{
						somamult3=somamult3+num;
						contmult3++;
					}
					
				}
			System.out.println("\nEntre com um numero: ");
			num = leia.nextInt();
		}
		while(num!=0);
		mediamult3=somamult3/contmult3;
		
		System.out.printf("\nMédia dos números múltiplos de 3: %.2f",mediamult3);

	}

}
