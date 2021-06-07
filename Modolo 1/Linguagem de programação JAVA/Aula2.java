package Aula2Java;

import java.util.Scanner;

//Aula de condicional.

public class Aula2 
{
	public static void main(String[] args)
	{
		
		int num;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com um valor: ");
		num = ler.nextInt();
		
		if(num>0)
		{
			System.out.println("\nEste numero e positivo!");
		}
		else if(num<0)
		{
			System.out.println("\nEste numero e negativo!");
		}
		else
		{
			System.out.println("\nEste numero e o proprio zero.");
		}
		
	}

}
