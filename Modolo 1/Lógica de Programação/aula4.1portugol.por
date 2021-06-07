programa
{
	
	funcao inicio()
	{
		inteiro numeros[2][5],somapar=0,quantpar=0,linha,coluna
		real mediapar

		para(linha=0;linha<2;linha++)
		{
			para(coluna=0;coluna<5;coluna++)
			{
				escreva("\nEntre com um numero: ")
				leia(numeros[linha][coluna])

				se(numeros[linha][coluna]&2==0)
				{
					somapar=somapar+numeros[linha][coluna]
					quantpar++
					
				}
			}
		}

		para(linha=0;linha<2;linha++)
		{
			para(coluna=0;coluna<5;coluna++)
			{
				escreva("\nValor linha ",linha,": coluna ",coluna,":",numeros[linha][coluna])
			}
		}

		mediapar=somapar/quantpar

		escreva("\nMedia dos nmumeros pares: ",mediapar)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 584; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */