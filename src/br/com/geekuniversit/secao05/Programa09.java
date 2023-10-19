//for
package br.com.geekuniversit.secao05;

import java.util.Scanner;

public class Programa09 {
    public static void main(String[] args) {

        int idade = 1;
        String nome;
        Scanner teclado = new Scanner(System.in);

        //variavel de controle; condição de parada; forma de incremento
        // i++ -> i = i + 1
        for (int i = 0; i < 5; i++ )	{
            System.out.println("Informe seu nome");
            //nome recebe o valor do teclado.
            nome = teclado.nextLine();

            //idade recebe o valor do teclado.
            System.out.println("Informe sua idade");
            //conversão de string para número
            idade = Integer.parseInt(teclado.nextLine());

            System.out.println(nome + " tem " + idade + " anos ");

            teclado.close();
        }

    }

}