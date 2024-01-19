package br.com.geekuniversit.secao15;

import java.util.Scanner;

public class programa37 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro número da divisão");
        int num1 = teclado.nextInt();

        System.out.println("Informe o segundo número da divisão");
        int num2 = teclado.nextInt();

        try {
            System.out.println("A divisão de " + num1 + " por " + num2 + " é " + num1 / num2);
        }catch(ArithmeticException e) {
            System.out.println("Não é possivel divir " + num1 + " por " + num2);
        }

        teclado.close();

    }
}
