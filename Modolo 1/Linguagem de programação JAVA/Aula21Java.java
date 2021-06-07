package Aula2Java;

import java.util.Scanner;

public class Aula21Java {

	public static void main(String[] args)
	{
		int op;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEscolha um numero do mes que deseja visualizar: ");
		op = ler.nextInt();
		
		switch(op)
		{
		case 1:
			System.out.println("\nJaneiro");
			break;
		case 2:
			System.out.println("\nFevereiro");
			break;
		case 3:
			System.out.println("\nMarco");
			break;
		case 4:
			System.out.println("\nAbril");
			break;
		case 5:
			System.out.println("\nMaio");
			break;
		case 6:
			System.out.println("\nJunho");
			break;
		case 7:
			System.out.println("\njulho");
			break;
		case 8:
			System.out.println("\nAgosto");
			break;
		case 9:
			System.out.println("\nSetembro");
			break;
		case 10:
			System.out.println("\nOutubro");
			break;
		case 11:
			System.out.println("\nNovembro");
			break;
		case 12:
			System.out.println("\nDezembro");
			break;
		default:
			System.out.println("\nEste numero nao e referente a nenhum mes.");
		}
		
	}

}
