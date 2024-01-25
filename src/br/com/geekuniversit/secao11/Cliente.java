package br.com.geekuniversit.secao11;

public class Cliente {
    private String nome;
    private String endereco;

    //Construtor
    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco=  endereco;

        //só pode ser executado dentro da  classe por conta do metodo estar private.
      //  this.dizer_oi();
    }

    //metodos dizer oi private
    private void dizer_oi() {
        System.out.println(this.nome + " está dizendo oi...");
    }

    //metodo get para tornar a variavel public
    public String getNome(){
        return this.nome;
    }

    public String getEndereco() {
        return endereco;
    }
}

//protected modificador de acesso.