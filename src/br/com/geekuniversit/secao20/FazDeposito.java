package br.com.geekuniversit.secao20;

import br.com.geekuniversit.secao11.Conta;

//Classe
public class FazDeposito implements Runnable{
    private Conta conta;

    //Construtor
    public FazDeposito(Conta conta) {
        this.conta = conta;
    }

    @Override
    public void run() {
        this.conta.depositar(100.0f);
    }
}
