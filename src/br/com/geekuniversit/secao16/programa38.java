package br.com.geekuniversit.secao16;

import java.util.Scanner;

public class programa38 {
    //programa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("informe n1: ");
        int n1 = teclado.nextInt();

        System.out.println("informe n2: ");
        int n2 = teclado.nextInt();

        //Mensagens de erros tratamento de exceção.
        try {
            System.out.println(divisao(n1, n2));
        } catch (ArithmeticException e) {
            System.out.println("Não consegui dividir os valores.. ");
        } catch (Exception e) {
            System.out.println("Não foi possivel executar a divisão.. ");
        }
        teclado.close();

    }

    //função que avisa que tem possibilidade de lançar uma exceção do tipo exception.
      public static int divisao( int n1, int n2) throws Exception{
         return n1 / n2;
        }

      }