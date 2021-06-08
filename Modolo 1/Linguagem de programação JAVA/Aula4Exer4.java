package Aula4;

import java.util.Scanner;

/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
menu de opções:
(1) somar as duas matrizes
(2) subtrair a primeira matriz da segunda
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
própria matriz.*/

public class Aula4Exer4 
{
	public static void main(String[] args) 
	{
		float[][] array1 = new float [2][2];
		float[][] array2 = new float [2][2];
		float[][] array3 = new float [2][2];
		float valor;
		int op,l,c;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um valor: ");
		valor = leia.nextFloat();
		
		for(l=0;l<2;l++)
		{
			for(c=0;c<2;c++)
			{
				System.out.println("\nEntre com o valor do array1: ");
				array1[l][c] = leia.nextFloat();
				System.out.println("\nEntre com o valor do array2: ");
				array2[l][c] = leia.nextFloat();
			}
		}
		System.out.println("\n\t\tMenu de opções");
		System.out.println("\n1-Somar as duas matrizes");
		System.out.println("\n2-Subtrair a primeira matriz da segunda");
		System.out.println("\n3-Adicionar uma constante as duas matrizes");
		System.out.println("\n4-Imprimir as matrizes");
		System.out.println("\n0-Sair do programa...");
		System.out.println("\nDigite a sua opção: ");
		op = leia.nextInt();
		do
		{
		
			switch(op)
			{
				case 0:
					break;
				case 1:
					for(l=0;l<2;l++)
					{
						for(c=0;c<2;c++)
						{
							array3[l][c] = array1[l][c] + array2[l][c];
							System.out.println("\nSoma: "+array3[l][c]);
						}
					}
					break;
				case 2:
					for(l=0;l<2;l++)
					{
						for(c=0;c<2;c++)
						{
							array3[l][c] = array2[l][c] - array1[l][c];
							System.out.println("\nSoma: "+array3[l][c]);
						}
					}
					break;
				case 3:
					for(l=0;l<2;l++)
					{
						for(c=0;c<2;c++)
						{
							array1[l][c] = array1[l][c] + valor;
							array2[l][c] = array2[l][c] + valor;
							System.out.println("\nArray1: "+array1[l][c]);
							System.out.println("\nArray2: "+array2[l][c]);
						}
					}
					break;
				case 4:
					for(l=0;l<2;l++)
					{
						for(c=0;c<2;c++)
						{
							System.out.println("\nArray1: "+array1[l][c]);
							System.out.println("\nArray2: "+array2[l][c]);
						}
					}
					break;
				default:
				System.out.println("\nOpção Inválida...");
			}
			System.out.println("\n\t\tMenu de opções");
			System.out.println("\n1-Somar as duas matrizes");
			System.out.println("\n2-Subtrair a primeira matriz da segunda");
			System.out.println("\n3-Adicionar uma constante as duas matrizes");
			System.out.println("\n4-Imprimir as matrizes");
			System.out.println("\n0-Sair do programa...");
			System.out.println("\nDigite a sua opção: ");
			op = leia.nextInt();
		
		}while(op!=0);	
	}
}
