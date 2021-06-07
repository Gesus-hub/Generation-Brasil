programa
{
	funcao inicio()
	{
		real notas[5],somanota=0.0,media
		inteiro x

		para(x=0;x<5;x++)
		{
			escreva("\nEscreva com uma nota: ")
			leia(notas[x])

			somanota = somanota+notas[x]
		}
		limpa()
		para(x=5;x<5;x++)
		{
			escreva("\nNota [",(x+1),"] = ",notas[x])
		}

		media=somanota/5
		escreva("\nMedia das notas: ",media)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 337; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */