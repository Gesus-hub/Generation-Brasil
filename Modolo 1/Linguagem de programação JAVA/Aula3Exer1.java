package Aula3Java;

/*1- Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/

public class Aula3Exer1 
{
	public static void main(String[] args)
	{
		
		for(int x=1000;x<=1999;x++)
		{
			if(x%11==5)
			{
				System.out.println("\nEsses sao todos os numeros que divididos por 11 o resta e igual a 5: "+x);
			}
			
		}
	}

}
