package Aula5;

public class TesteAutomovel 
{
	public static void main(String[] args) 
	{
		//Instanciando um objeto da classe Automovel
		Automovel auto1 = new Automovel("Mara Jozicleia","BMW X4","XLC-9232",2022);
		
		//Troca de mensagens(chamada ao metodo imprimirInfo())
		auto1.imprimirInfo();
		
		System.out.println("\n*****Transferencia de Proprietaria(o)*****");
		auto1.setNomeProprietario("Bruno Constantino");
		auto1.imprimirInfo();
		
		Automovel auto2 = new Automovel("Denise Mignoli","Toyota Corolla","KYA-8576",2021);
		auto2.imprimirInfo();
		System.out.println("\n*****Mudanca de Placa*****");
		auto2.setPlaca("ACE-2756");
		auto2.imprimirInfo();
	}

}
