package br.com.geekuniversit.secao18;
//Object: A mãe de todas as classes

/*
A classe Object. faz parte do pacote java.lang
 */


import br.com.geekuniversit.secao11.Cliente;
import br.com.geekuniversit.secao11.Conta;

public class programa39 {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("Angelina joliw","Rua da Paz, 1");
        Cliente cli2 = new Cliente("Felicity joli","Rua da Paz, 2");

        Conta c1 = new Conta(1,200,300,cli1);
        Conta c2 = new Conta(2,200,300,cli2);

        System.out.println(c1);
        System.out.println(c2);

        if (c1.equals(c2))
        {
            System.out.println("São a mesma conta");
        }else{
                System.out.println("São contas diferentes");
        }
    }
}
