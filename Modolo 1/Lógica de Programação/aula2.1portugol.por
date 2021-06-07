programa
{
	
	funcao inicio()
	{
		real num1,num2, res=0.0
		inteiro op

		escreva("\nDigite o primeiro numero: ")
		leia(num1)
		escreva("\nDigite o segundo numero: ")
		leia(num2)

		escreva("\n\t\tMenu de opcoes da calculadora")
		escreva("\n1-soma\n2-diferenca\n3-Multiplicao\n4-Divisao")
		escreva("\nDigite sua opcao: ")
		leia(op)

		escolha(op)
		{
			caso 1:
			res = num1+num2
			pare
			caso 2:
			res = num1-num2
			pare
			caso 3:
			res = num1*num2
			pare
			caso 4:
			res = num1/num2
			pare
			caso contrario:
			escreva("\nOpcao invalida!")
		}
		escreva("\nResultados: ", res)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 63; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */