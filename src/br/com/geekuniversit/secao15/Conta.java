package br.com.geekuniversit.secao15;

public class Conta {
    private int numero;
    private String cliente;

    //atributos staticos inteiro
    private static int contador = 1;

    public Conta(String cliente) {
        this.numero = contador;
        this.cliente = cliente;
        this.contador = contador + 1;

    }

    public int getNumero() {
        return numero;
    }
    public String getCliente() {
        return this.cliente;
    }

    //metodo estático.
    public static int proximaConta() {
        return Conta.contador;
    }
}