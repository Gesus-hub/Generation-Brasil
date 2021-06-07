package Aula1Java;

import java.util.Scanner;

public class Aula1 
{
	
	public static void main(String[] args) 
	{
		double n1,n2,n3,media;
		Scanner leia= new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota: ");
		n1=leia.nextFloat();
		
		System.out.println("\nEntre com a segunda nota: ");
		n2=leia.nextFloat();

		System.out.println("\nEntre com a terceira nota: ");
		n3=leia.nextFloat();
		
		media=(n1+n2+n3)/3;
		
		System.out.println("\nA media das notas e: "+media);
		System.out.printf("\nA media das notas arredondada: %2.2f", media);
		
		n1 = Math.sqrt(n2);//sqrt e a raiz dentro do math
		n3 = Math.pow(n1, 3);//pow e potencia dentro do math
		
		
	}

}
