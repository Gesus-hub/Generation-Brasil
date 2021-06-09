package Aula6;

public class Preguica extends Animal
{
	private String raca;
	private double tamanho;
	private double peso;
	
	public Preguica(String raca, double tamanho, double peso)
	{
		super(nome,idade);
		this.raca = raca;
		this.tamanho = tamanho;
		this.peso = peso;
	}
	public void infoPreguica()
	{
		System.out.println("\nNome: "+getNome());
		System.out.println("\nIdade: "+getIdade());
		System.out.println("\nRaca: "+raca);
		System.out.println("\nTamanho: "+tamanho);
		System.out.println("\nPeso: "+peso);
		
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	} 
}
