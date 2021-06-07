package Aula2Java;

import java.util.Scanner;

/*2- Faça um programa que entre com três números e coloque em ordem crescente.*/

public class Aula2Exer2 
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
		/*
		Menor	Meio	Maior
		num1	num2	num3
		num1	num3	num2
		num2	num1	num3
		num2	num3	num1
		num3	num1	num2
 		num3	num2	num1
		 */
		
		if (num1<=num2&num1<=num3)
		{
			System.out.println(num1+"-"+num2+"-"+num3);
		}
		else if (num1<=num3&num1<=num2)
		{
			System.out.println(num1+"-"+num3+"-"+num2);
		}
		else if (num2<=num1&num2<=num3)
		{
			System.out.println(num2+"-"+num1+"-"+num3);
		}
		else if (num2<=num3&num2<=num1)
		{
			System.out.println(num2+"-"+num3+"-"+num1);
		}
		else if (num3<=num1&num3<=num2)
		{
			System.out.println(num3+"-"+num1+"-"+num2);
		}
		else if (num3<=num2&num3<=num1)
		{
			System.out.println(num3+"-"+num2+"-"+num1);
		}
		else
		{
			System.out.println(num1+"-"+num2+"-"+num3);
		}
	}

}
