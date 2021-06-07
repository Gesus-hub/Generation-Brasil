programa
{
	
	funcao inicio()
	{
		inteiro num,somapar=0,contimpar=0

		escreva("\nEntre com um numero: ")
		leia(num)

		enquanto(num!=0)
		{
			se(num%2==0)
			{
				somapar = somapar + num
			}
			senao
			{
				contimpar++
			}
			escreva("\nEntre com um numero: ")
			leia(num)
		}

		escreva("\nSomatorio dos numeros pares: ",somapar)
		escreva("\nQuantidade de numeros impares: ", contimpar
		
		)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 60; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */