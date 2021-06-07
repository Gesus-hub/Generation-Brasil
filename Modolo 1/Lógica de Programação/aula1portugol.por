programa
{
	inclua biblioteca Matematica-->mat
	funcao inicio()
	{
		inteiro idade = 26
		real altura = 1.79,nota1,nota2,nota3,media
		cadeia nome = "Jesus"

		escreva("\nMeu nome e: ",nome,".")
		escreva("\nMinha idade e de: ",idade," anos.")
		escreva("\nMinha altura e: ", altura,".")

		escreva("\nEntre com a primeira nota: ")
		leia(nota1)
		escreva("\nEntre com a segunda nota: ")
		leia(nota2)
		escreva("\nEntre com a terceira nota: ")
		leia(nota3)

		media = (nota1+nota2+nota3)/3

		escreva("\nMedia das notas: ", mat.arredondar(media,2), ".")

		real minharaiz, minhapotencia

		minharaiz = mat.raiz(nota3, 2.0)
		minhapotencia = mat.potencia(nota2, 3.0)

		escreva("\nRaiz quadrada da nota 3: ", mat.arredondar(minharaiz, 2))
		escreva("\nPotencia de nota 2: ", mat.arredondar(minhapotencia, 2))
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 625; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */