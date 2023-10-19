package br.com.geekuniversit.secao05;

import java.util.Scanner;

public class Programa08 {
    public static void main(String[] args) {

        int idade = 1;
        String nome;

        //Para receber dados do usuario na variavel teclado utilizando a biblioteca scanner
        Scanner teclado = new Scanner(System.in);

        //Quando a idade for maior que 0 então execute a instrução a seguir.
        do{
            System.out.println("Informe seu nome");
            //nome recebe o valor do teclado.
            nome = teclado.nextLine();

            //idade recebe o valor do teclado.
            System.out.println("Informe sua idade");
            //conversão de string para número
            idade = Integer.parseInt(teclado.nextLine());

            System.out.println(nome + " tem " + idade + " anos ");

        } while(idade > 0);
        teclado.close();
    }

}