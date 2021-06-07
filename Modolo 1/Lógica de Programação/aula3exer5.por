programa
{
    funcao inicio()
    {
        /* 1- Faça um programa que mostre uma contagem na tela de 233 a 456,
           só que contando de 3 em 3 quando estiver entre 300 e 400 e de 5
           em 5 quando não estiver.*/

         real Num = 0.00

         escreva("\nDigite um número real entre 233 e 456: ")
         leia(Num)
    
        faca
        {
        	se(Num >= 300.00 e Num <= 400.00) 
        	{
        		Num = Num + 3
        	}
        	senao
        	{
        		Num = Num + 5
        	}
        	escreva(Num)
        	escreva("\n")
        }
        	enquanto(Num >= 233.00 e Num <= 456.00)
         
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 567; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */