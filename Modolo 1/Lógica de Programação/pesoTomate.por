programa
{
	
	funcao inicio()
	{
		real  p,m

		escreva("\nInsira os quilos de tomate: ")
		leia(p)

		se (p<=50)
		{
			escreva("\nO peso nao foi excedido conforme regulamento.")
			
		}
		senao se (p>50)
		{
			p=p-50
			escreva("\nO peso ultrapassou em ",p," kg.")
			p=p*4
			escreva("\nSera necessario pagar a multa de R$",p," reais.")
			
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 356; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */