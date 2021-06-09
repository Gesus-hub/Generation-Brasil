package Aula5;

import java.util.Scanner;

/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Aula5Exer1TesteCliente 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		String nome,email,telefone,endereco,senha;
		
		System.out.println("\nQual seu nome: ");
		nome = leia.next();
		System.out.println("\nQual seu e-mail: ");
		email = leia.next();
		System.out.println("\nQual seu telefone: ");
		telefone = leia.next();
		System.out.println("\nEscolha sua senha: ");
		senha = leia.next();
		
		Aula5Exer1Cliente cadastro =  new Aula5Exer1Cliente(nome,email,telefone,senha, senha);
		
		cadastro.printAula5Exer1Cliente();
	}
}
