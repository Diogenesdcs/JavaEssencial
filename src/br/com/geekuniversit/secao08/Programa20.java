

package br.com.geekuniversit.secao08;

import java.util.Scanner;
//Funções. 
//Faça um programa, que receba diversos nomes de frutas do usuário e no final os imprima de forma contrária
//O programa deve solicitar ao usuário quantas frutas ele quer informar.

public class Programa20 {
    //variaveis globais
    static String frutas[]; //declaração do vetor array
    static Scanner teclado = new Scanner(System.in); //variavel que recebe o valor do teclado

    public static void main(String[] args) {
        //variavel local
        int qtd;
        System.out.println("Informe a quantidade de frutas para cadastrar: ");
        qtd = Integer.parseInt(teclado.nextLine()); //conversão de string para inteiro do valor da variavel.

        cadastrar_dados(qtd);
        mostra_dados(qtd);

        teclado.close();

    }

//********************************************************************************************
//			frutas = new String[qtd]; //definindo o tamanho do vetor pelo tmanho da variavel.	

    //ler a variavel declara a partida i = 0; em seguida a função i menor igual a quantidade i ++ = i + 1.
//			for(int i = 0; i < qtd; i++) //i ++ = i + 1;
//				{											//Imprima o valor de fruta
//				System.out.println("Informe a " + (i + 1) + " frutas");
//				frutas[i] = teclado.nextLine();			//frutas recebe o que usuário digitou a posição de i e vai incrementando de acordo com o for.
//				}
//			
//			for (int i = 2; i >= 0; i--){
//				System.out.println(frutas[i]);		
//				}
//				teclado.close();
//				}
//********************************************************************************************	

    //funções
    static void cadastrar_dados(int quantidade) {
        //definição do tamanho do array de acordo com a variavel quantidade
        frutas = new String[quantidade];

        for(int i = 0; i < quantidade; i++) {
            System.out.println("Informe a " + (i + 1) + " frutas");
            frutas[i] = teclado.nextLine();
        }
    }

    static void mostra_dados(int quantidade) {
        for (int i = (quantidade -1); i >= 0; i--){
            System.out.println(frutas[i]);
        }
    }
}