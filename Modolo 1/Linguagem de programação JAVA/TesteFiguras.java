package Aula7;

public class TesteFiguras 
{
	public static void main(String[] args) 
	{
		Quadrado fig1 = new Quadrado(10,"Quadrado LEGAL");
		Retangulo fig2 = new Retangulo(3,4,"Retangulo DA PAZ");
		
		System.out.println("\n"+fig1.getNome()+" : "+fig1.getDiagonal()+"\n"+fig1.getArea());
		System.out.println("\n"+fig2.getNome()+" : "+fig2.getDiagonal());	
	}
}