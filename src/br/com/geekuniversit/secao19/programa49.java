package br.com.geekuniversit.secao19;

//HashMap

import br.com.geekuniversit.secao11.Cliente;
import br.com.geekuniversit.secao11.Conta;

import java.util.HashMap;
import java.util.Map;

/*
A classe HashMap implementa a interface Map e trabalha com chave e valor
-Não aceita chaves duplicadas, mas valores sim.
 */
public class programa49 {
    public static void main(String[] args) {
        //Interface Map de chave e valor aonde o objeto contas recebe a Classe Conta.
        Map<String, Conta> contas = new HashMap<String, Conta>();

        //chamando a classe Cliente e adicionado as informações conforme declaração da classe.
        //Adicionando cadastro de cliente no programa
        Cliente cli1 = new Cliente(10,"Angelina","Rua1");
        Cliente cli2 = new Cliente(15,"Loana","rua2");

        //Adicionando valor de conta no programa
        Conta c1 = new Conta(1,200,700,cli1);
        Conta c2 = new Conta(2,300,600,cli2);

        //adicionando chave e valor no objeto contas conforme regra do hashMap de chave e valor
        contas.put("Pessoa Fisica", c1);
        contas.put("Pessoa Juridica",c2);

       // System.out.println(contas.size());

        System.out.println(contas.get("Pessoa Fisica"));





    }
}
