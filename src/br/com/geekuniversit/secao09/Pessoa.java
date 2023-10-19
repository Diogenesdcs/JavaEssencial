//classes
//atributos são caracteristicas das classes
//métodos, ficamo dentro das classe e são chamados pelos programas.

package br.com.geekuniversit.secao09;

public class Pessoa {
    String nome,email;
    int ano_nascimento, idade;

    //método construtor vazio.
    public Pessoa() {}


    //método Construtor com parâmetros
    public Pessoa(String nome, String email, int ano_nascimento) {
        // this == este objeto.
        this.nome = nome;
        this.email = email;
        this.ano_nascimento = ano_nascimento;

    }

    //metodo de informações da classe.
    void Imprime_informações() {
        System.out.println(this.nome);
        System.out.println(this.email);
        System.out.println(this.ano_nascimento);
    }
}
	