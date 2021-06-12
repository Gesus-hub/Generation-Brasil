package Aula7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivZero 
{
	public static int quociente(int numerador,int denominador) throws ArithmeticException
	{
		return numerador / denominador;
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		boolean continueLoop = true;
		
		do
		{
			try
			{
				System.out.println("\nEntre com o numerador: ");
				int numerador = scanner.nextInt();
				System.out.println("\nEntre com o denominador: ");
				int denominador = scanner.nextInt();
				
				int resultado = quociente(numerador,denominador);
				System.out.printf("\nResultado: %d / %d = %d \n",numerador,denominador,resultado);
				continueLoop = false;
			}
			catch(InputMismatchException inputMismatchException)
			{
				System.out.printf("\nException: %s\n",inputMismatchException);
				scanner.nextLine();
				System.out.println("\nVoc� deve entrar com um valor do tipo inteiro... Por favor tente novamente.\n");	
			}
			catch(ArithmeticException arithmeticException)
			{
				System.err.printf("Exception: %s\n",arithmeticException);
				System.out.println("\nZero � um denominador inv�lido. Por favor tente novamente...");		
			}
		}while(continueLoop);
	}
}