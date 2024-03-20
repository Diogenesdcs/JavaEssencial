package br.com.geekuniversit.secao17;
/*
Gerando executáveis Jar

JAR - Java Archive arquivo compactado Java.

 */

import br.com.geekuniversit.secao11.Cliente;
import br.com.geekuniversit.secao11.Conta;
import java.util.Scanner;

public class Principal {
        static Cliente cliente = new Cliente(10, "Angelina Jolie", "João bettega");
        static Conta conta = new Conta(1,200,300, cliente);
        static Scanner teclado = new Scanner(System.in);

        //função
    static void depositar(){
        System.out.println("=========Depósito========");
        System.out.println("Informe o valor do depósito");
        float valor = teclado.nextFloat();
        if (valor > 0 ){
            conta.depositar(valor);
            System.out.println("Depósito efetuado com sucesso");
        }else {
            System.out.println("O valor precisa ser positivo. ");
        }
    }

    static void sacar(){
        System.out.println("========Sacar=======");
        System.out.println("Informe o valor para o saque");
        float valor = teclado.nextFloat();
        if (valor > 0){
            conta.sacar(valor);
        }else {
            System.out.println("O valor precisa ser positivo");
        }
    }

    static void consultar(){
        System.out.println("Seu saldo é " + conta.getsaldo());
    }

    //programa com menus da conta
    public static void main(String[] args) {
        int opcao = 0;
        System.out.println("Olá " + cliente.getNome());
        System.out.println("Seja Bem vindo(a) ao Banco Geek");
        do {

            System.out.println("Selecione uma opção abaixo");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar");
            System.out.println("0 - Sair");
            opcao = teclado.nextInt();

            switch (opcao){
                case 1:
                    depositar();
                    break;
                case 2:
                    sacar();
                    break;
                case 3:
                    consultar();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while (opcao > 0);
        teclado.close();

    }
}

