package Aula3Java;

import java.util.Scanner;

public class Aula3Java
{
	public static void main(String[] args)
	{
		float n1,n2,n3,media,mediageral,somamedia=0;
		Scanner jamelao = new Scanner(System.in);
		
		for(int x=1;x<=4;x++)
		{
			 System.out.println("\nEntre com a primeira nota: ");
			 n1 = jamelao.nextFloat();
			 System.out.println("\nEntre com a segunda nota: ");
			 n2 = jamelao.nextFloat();
			 System.out.println("\nEntre com a terceira nota: ");
			 n3 = jamelao.nextFloat();
			 
			 media = (n1+n2+n3)/3;
			 
			 System.out.printf("\nMedia da alune: %2.2f", media);
			 somamedia=somamedia+media;
		}
		mediageral = somamedia/4;
		System.out.printf("\nMedia geral: %2.2f",mediageral);
			
	}
}
