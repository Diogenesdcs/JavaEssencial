package br.com.geekuniversit.secao11;

public class Programa25 {
    public static void main(String[] args){
        Cliente joao = new Cliente("joao da Silva", "Rua da Paz,  45"); //instância da classe Cliente.
        Cliente maria = new Cliente("Maria da Silva", "Rua da Paz,  45");

        Conta conta_joao = new Conta(1, 100.0f, 200.0f, joao);//instância da classe Conta
        Conta conta_maria = new Conta(1, 300.0f, 500.0f, maria);

        System.out.println("Saldo do João: " + conta_joao.saldo);
        System.out.println("Saldo do Maria: " + conta_maria.saldo);
    }


}
