programa
{
	inclua biblioteca Matematica--> mat
	funcao inicio()
	{
		inteiro idade
		inteiro meses
		inteiro dias
		inteiro totalDedias

		escreva("\nQuantos dias voce ja viveu? ")
		leia(totalDedias)
		
		idade = totalDedias/365
		escreva("\nEntao voce ja viveu: ",idade, " anos.")

		meses = idade%12
		escreva("\nEntao voce ja viveu: ",meses, " meses.")

		dias = totalDedias%365-12
		escreva("\nEntao voce ja viveu: ",dias, " dias.")
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 459; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */