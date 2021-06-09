package Aula5;

import java.util.Scanner;

public class Aula5Exer3TesteEle 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		String potencia,polegada,entrada,sinal;
		
		System.out.println("\nInforme a potencia da TV: ");
		potencia = leia.next();
		System.out.println("\nInforme a polegada da TV: ");
		polegada = leia.next();
		System.out.println("\nInforme o tipo de entrada: ");
		entrada = leia.next();
		System.out.println("\nInforme o sinal: ");
		sinal = leia.next();
		
		Aula5Exer3Ele especificacao =  new Aula5Exer3Ele(potencia,polegada,entrada,sinal);
		
		especificacao.printAula5Exer3Ele();

	}

}
