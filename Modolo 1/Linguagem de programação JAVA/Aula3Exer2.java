package Aula3Java;

import java.util.Scanner;

/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

public class Aula3Exer2 
{
	public static void main(String[] args)
	{
		int num,contpar=0,contimpar=0;
		Scanner leia = new Scanner(System.in);
		
		/*System.out.println("\nEntre com o primeiro numero: ");
		num1 = leia.nextInt();
		System.out.println("\nEntre com o segundo numero: ");
		num2 = leia.nextInt();
		System.out.println("\nEntre com o terceiro numero: ");
		num3 = leia.nextInt();
		System.out.println("\nEntre com o quarto numero: ");
		num4 = leia.nextInt();
		System.out.println("\nEntre com o quinto numero: ");
		num5 = leia.nextInt();
		System.out.println("\nEntre com o sexto numero: ");
		num6 = leia.nextInt();
		System.out.println("\nEntre com o setimo numero: ");
		num7 = leia.nextInt();
		System.out.println("\nEntre com o oitavo numero: ");
		num8 = leia.nextInt();
		System.out.println("\nEntre com o nono numero: ");
		num9 = leia.nextInt();
		System.out.println("\nEntre com o decimo numero: ");
		num10 = leia.nextInt();*/
		
		for(int x=0;x<=10;x++)
		{
			System.out.println("\nEntre com um numero: ");
			num = leia.nextInt();
			
			if(num%2==0)
			{
				contpar++;
			}
			else
			{
				contimpar++;
			}
			
		}
		System.out.println("\nDos numero informador "+contpar+" sao pares.");
		System.out.println("\nDos numero informador "+contimpar+" sao impares.");
		
	}

}
