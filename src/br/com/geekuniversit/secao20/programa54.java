package br.com.geekuniversit.secao20;

import br.com.geekuniversit.secao11.Cliente;
import br.com.geekuniversit.secao11.Conta;
//Thread sincronizada
public class programa54 {
    public static void main(String[] args) throws InterruptedException {
        Cliente cli1 = new Cliente(18,"Angelo", "Rua 10");
        Conta c1 = new Conta(1, 200, 500,cli1);

        FazDeposito acao = new FazDeposito(c1);
        Thread t1 = new Thread(acao); //Objeto acao
        Thread t2 = new Thread(acao);

        t1.join(); //junta a thread a um sincronizador da classe
        t2.join();

        System.out.println(c1);
    }
}