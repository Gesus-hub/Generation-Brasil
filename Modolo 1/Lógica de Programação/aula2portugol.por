programa
{
	
	funcao inicio()
	{
		real nota1, nota2, nota3,media
		cadeia nome
		
		escreva("\nEntre com seu nome: ")
		leia(nome)
		escreva("\nEntre com a primeira nota: ")
		leia(nota1)
		escreva("\nEntre com a segunda nota: ")
		leia(nota2)
		escreva("\nEntre com a terceira nota: ")
		leia(nota3)

		media = (nota1+nota2+nota3)/3

		escreva("\nA media foi de: ",media)

		se(media>=7 e media<=10) 
		{
			escreva("\nParticipante: ",nome, ", foi aprovado...")
			
		}
		senao se(media>=5 e media<7)
		{
			escreva("\nParticipante: ",nome,",ficou de exame.")
		}
		senao
		{
			escreva("\nParticipante: ",nome,", foi reprovado.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 637; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */