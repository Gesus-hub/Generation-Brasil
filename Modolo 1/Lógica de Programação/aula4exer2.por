programa
{
	/*Um dado é lançado 10 vezes e o valor correspondente é anotado. 
          Faça um programa que gere um vetor com os lançamentos, escreva 
          esse vetor. A seguir determine e imprima a média aritmética dos 
          lançamentos, contabilize e apresente também quantas foram as 
          ocorrências da maior pontuação.*/
    funcao inicio()
    {
    		inteiro x,numero[10],somanume=0,media,maior=0,cont=0

    		para(x=0;x<10;x++)
    		{    			
    			escreva("\nEntre com o valor que o dado caiu: ")
    			leia(numero[x])

    			somanume=somanume+numero[x]

    			se(numero[x]>=maior)
    			{
    				maior=numero[x]

    				se(maior==numero[x])
    				{
    					cont++
    				}
    			}

    		}
    		media=somanume/10
    		escreva("\nA media das jogadas foi: ",media)
    		escreva("\nO dado caiu no maior valor ",cont," vezes.")
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 548; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */