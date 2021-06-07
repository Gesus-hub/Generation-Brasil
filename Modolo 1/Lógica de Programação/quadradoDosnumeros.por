programa
{
	/*Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.*/
	
	funcao inicio()
	{
		real num1,num2,num3,num4,res1,res2,res3,res4

		escreva("\nEntre com o numero 1: ")
		leia(num1)
		escreva("\nEntre com o numero 2: ")
		leia(num2)
		escreva("\nEntre com o numero 3: ")
		leia(num3)
		escreva("\nEntre com o numero 4: ")
		leia(num4)

		res1=num1*num1
		res2=num2*num2
		res3=num3*num3
		res4=num4*num4
		
		se (res3>1000)
		{
			escreva("\nO ",res3," e maior que 1000.")
		}
		senao se (res3<1000)
		{
			escreva("\nO numero 1 iformado foi: ",num1," seu quadrado e: ",res1,".")
			escreva("\nO numero 2 iformado foi: ",num2," seu quadrado e: ",res2,".")
			escreva("\nO numero 3 iformado foi: ",num3," seu quadrado e: ",res3,".")
			escreva("\nO numero 4 iformado foi: ",num4," seu quadrado e: ",res4,".")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 701; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */