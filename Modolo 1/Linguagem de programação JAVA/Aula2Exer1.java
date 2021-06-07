package Aula2Java;

import java.util.Scanner;

/*1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/

public class Aula2Exer1
{

	public static void main(String[] args)
	{
		int num1,num2,num3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro numero: ");
		num1 = leia.nextInt();
		
		System.out.println("\nEntre com o segundo numero: ");
		num2 = leia.nextInt();
		
		System.out.println("\nEntre com o terceiro numero: ");
		num3 = leia.nextInt();
		
		if(num1>num2&num1>num3)
		{
			System.out.println("\nO "+num1+" e o maior numero informado.");
		}
		else if(num2>num1&num2>num3)
		{
			System.out.println("\nO "+num2+" e o maior numero informado.");
		}
		else
		{
			System.out.println("\nO "+num3+" e o maior numero informado.");
		}

	}

}
