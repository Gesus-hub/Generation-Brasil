programa
{
	/*Faça um programa que crie um vetor por leitura com 5 valores de
	  pontuação de uma atividade e o escreva em seguida. Encontre após 
	  a maior pontuação e a apresente.*/
	
	funcao inicio()
	{
		real nota[5],maiorNota=0.0
		inteiro x

		para(x=0;x<5;x++)
		{
			escreva("\nDigite a pontuacao da atividade: ")
			leia(nota[x])

			se(nota[x]>=maiorNota)
			{
				maiorNota=nota[x]
			}
		}	
		
			
		escreva("\nA maior pontuacao e: ",maiorNota)	
	
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 207; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */