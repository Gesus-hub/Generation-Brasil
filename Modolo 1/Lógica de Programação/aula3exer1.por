programa
{
	/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.*/
	inclua biblioteca Matematica-->mat
	funcao inicio()
	{
		real salario,somasala=0.0,filho,somafilho=0.0,mediasala=0.0,mediafilho=0.0,maiorsala=0.0,sala100,porcentosala=0.0
		inteiro x,cont=0,popu
		cadeia nome

		escreva("\nEntre com o numero total de pesquisas: ")
		leia(popu)
		limpa()

		para (x=1;x<=popu;x++)
		{
			escreva(x)
			escreva("\nEntre com o nome do pesquisado: ")
			leia(nome)
			escreva("\nEntre com seu salario: ")
			leia(salario)
			escreva("\nEntre com numero de filhos: ")
			leia(filho)
			limpa()

			somasala = salario+somasala
			somafilho = filho+somafilho

			se (salario<=100)
			{
				cont++
			}
			se (maiorsala<salario)
			{
				maiorsala=salario
				
			}
		}

		mediasala = somasala/popu
		porcentosala = (cont*100.0)/popu
		mediafilho = somafilho/popu
		
		escreva("\nA media salarial é: R$",mat.arredondar(mediasala, 2)," reais.")
		escreva("\nO maior salario foi: R$",mat.arredondar(maiorsala,2)," reais.")
		escreva("\nA porcentagem de pessoas que ganham até R$100,00 reais é: ", mat.arredondar(porcentosala, 2),"%")
		escreva("\nA media de filhos é: ", mat.arredondar(mediafilho,0))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1101; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */