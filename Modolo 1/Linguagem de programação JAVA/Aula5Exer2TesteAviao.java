package Aula5;

import java.util.Scanner;

/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

public class Aula5Exer2TesteAviao 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		String helice,motor,asa,tremDePouso;
		
		System.out.println("\nInforme o tamanho da helice: ");
		helice = leia.next();
		System.out.println("\nInforme a potencia do motor: ");
		motor = leia.next();
		System.out.println("\nInforme o tamanho da asa: ");
		asa = leia.next();
		System.out.println("\nInforme o diametrio do trem de pouso: ");
		tremDePouso = leia.next();
		
		Aula5Exer2Aviao especificacao =  new Aula5Exer2Aviao(helice,motor,asa,tremDePouso);
		
		especificacao.printAulaExer2Aviao();
	}

}
