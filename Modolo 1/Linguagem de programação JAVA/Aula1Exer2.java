package Aula1Java;
	
	/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a 
	expressa em anos, meses e dias.*/

import java.util.Scanner;

public class Aula1Exer2 
{
	public static void main(String[] args)
	{
		int idade,meses,dias = 0,totalDeDias;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQuantos dias voce ja viveu?");
		totalDeDias = leia.nextInt();
		
		idade=totalDeDias/365;
		totalDeDias=totalDeDias%365;
		meses=totalDeDias/30;
		totalDeDias=totalDeDias%30;
		
		System.out.println("\nEntao voce ja viveu: "+idade+" anos, "+meses+" meses e "+dias+" dias.");
		
	}

}
