package Aula1Java;

import java.util.Scanner;

/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa
	em segundos e mostre-o expresso em horas, minutos e segundos.*/

public class Aula1Exer3 
{
	public static void main(String[] args)
	{
		int segundos,minutos,hora,ts;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\nQuanto tempo levou o evento em segundos: ");
		ts = leia.nextInt();
		
		hora=ts/3600;
		minutos=(ts%3600)/60;
		segundos=(ts%3600)%60;
		
		System.out.println("\nHoras: "+hora+", Minutos: "+minutos+", Segundos: "+segundos);
			
	}

}
