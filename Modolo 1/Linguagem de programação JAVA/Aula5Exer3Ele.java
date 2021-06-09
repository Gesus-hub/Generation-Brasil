package Aula5;

/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/

public class Aula5Exer3Ele 
{
	private String potencia;
	private String polegada;
	private String entrada;
	private String sinal;
	
	public Aula5Exer3Ele(String potencia,String polegada,String entrada,String sinal)
	{
		this.potencia = potencia;
		this.polegada = polegada;
		this.entrada = entrada;
		this.sinal = sinal;
	}
	public void printAula5Exer3Ele()
	{
		System.out.println("\nO aparelho possui: "+potencia+" Volts.");
		System.out.println("\nO aparelho possui: "+polegada+" polegadas.");
		System.out.println("\nO aparelho possui: "+entrada+".");
		System.out.println("\nO aparelho possui: "+sinal+".");
	}
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	public String getPolegada() {
		return polegada;
	}
	public void setPolegada(String polegada) {
		this.polegada = polegada;
	}
	public String getEntrada() {
		return entrada;
	}
	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
	public String getSinal() {
		return sinal;
	}
	public void setSinal(String sinal) {
		this.sinal = sinal;
	}
}
