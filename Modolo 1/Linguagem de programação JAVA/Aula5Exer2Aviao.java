package Aula5;

/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

public class Aula5Exer2Aviao 
{
	private String helice;
	private String motor;
	private String asa;
	private String tremDePouso;
	
	public Aula5Exer2Aviao(String helice,String motor,String asa,String tremDePouso)
	{
		this.helice = helice;
		this.motor = motor;
		this.asa = asa;
		this.tremDePouso = tremDePouso;
	}
	public void printAulaExer2Aviao()
	{
		System.out.println("\nTamanho da helice �: "+helice);
		System.out.println("\nO motor ultilizado �: "+motor);
		System.out.println("\nTamanho da asa: "+asa);
		System.out.println("\nDiametro do trem de pouso: "+tremDePouso);
	}
	public String getHelice() {
		return helice;
	}
	public void setHelice(String helice) {
		this.helice = helice;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getAsa() {
		return asa;
	}
	public void setAsa(String asa) {
		this.asa = asa;
	}
	public String getTremDePouso() {
		return tremDePouso;
	}
	public void setTremDePouso(String tremDePouso) {
		this.tremDePouso = tremDePouso;
	}
	
}
