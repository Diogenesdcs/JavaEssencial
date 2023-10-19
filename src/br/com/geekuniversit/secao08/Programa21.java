package br.com.geekuniversit.secao08;

public class Programa21 {

    public static void main(String[] args) {
        int valor1 = 6, valor2 = 4, res;

        res = soma(valor1, valor2);
        System.out.println("valor total " + res);
        System.out.println(mensagem());

    }

    //função de soma.
    static int soma(int v1, int v2) {
        return v1 + v2;
    }

    //função de mensagem string
    static String mensagem(){
        return "olá";
    }
}