package Aula5;

public class Automovel 
{
	//Declaracao dos atributos(variaveis de instancia) da classe
	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;
	
	//Metodo especial CONSTRUTOR
	public Automovel(String nomeProprietario,String modelo,String placa,int ano)
	{
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	}
	public Automovel(String nomeProprietario,int ano)
	{
		this.nomeProprietario = nomeProprietario;
		this.ano = ano;
	}
	//declaracao dos demais metodos da classe
	public void imprimirInfo()
	{
		System.out.println(nomeProprietario+" possui um(a) "+modelo+" com placa "+placa+" e ano "
		+ano);
	}
	public String getNomeProprietario() {
		return nomeProprietario;
	}
	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
