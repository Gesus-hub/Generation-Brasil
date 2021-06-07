programa
{
	
	funcao inicio()
	{
		real C,N,E
		cadeia nome

		escreva("\nQual nome do operario: ")
		leia(nome)
		escreva("\nQuantas horas trabalhou: ")
		leia(N)

		se (N<=50)
		{
			N=N*10
			escreva("\nO salario de ",nome," sera R$",N," reais.")
			
		}
		senao se (N>50)
		{
			E=(N-50)*20
			escreva("\nO ",nome," realizou horas extras, tera que pagar R$",E," reais de banco.")
			
			
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 168; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */