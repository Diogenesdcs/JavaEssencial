package br.com.geekuniversit.secao20;

import br.com.geekuniversit.secao11.Cliente;
import br.com.geekuniversit.secao11.Conta;
/*
Por padrão as Threads não são sincronizadas. Pode ocorrer problemas
de uma thread acessa o valor de um objeto que não foi atualizado
ou ainda as Threads executarem depois do valor já estar impresso.
//Thread não sincronizada
 */
public class programa53 {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente(18,"Angelo", "Rua 10");
        Conta c1 = new Conta(1, 200, 500,cli1);

        FazDeposito acao = new FazDeposito(c1);
        Thread t1 = new Thread(acao); //Objeto acao
        Thread t2 = new Thread(acao);

        t1.start();
        t2.start();

        System.out.println(c1);
    }
}
