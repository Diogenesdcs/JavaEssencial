package br.com.geekuniversit.secao11;

public class Conta {
    int numero;
    float saldo;
    float limite;
    Cliente cliente; //como é uma classe criada então podemos  utilizar como parametro de outra classe.

    //construtor
    public Conta(int numero, float saldo, float limite, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;

    }

//void nome_da_função (declaração_de_parâmetros);
    void sacar(float valor) {
        this.saldo = this.saldo - valor;  //saldo é igual  a saldo menos o valor.
    }

    void depositar(float valor) {
        this.saldo = this.saldo + valor;
    }
}
