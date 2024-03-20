package br.com.geekuniversit.secao11;

public class Cliente implements Comparable {
    int idade;
    private String nome;
    private String endereco;

    //Construtor
    public Cliente(int idade, String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;

        //só pode ser executado dentro da  classe por conta do metodo estar private.
        //  this.dizer_oi();
    }

    //metodos dizer oi private
    private void dizer_oi() {
        System.out.println(this.nome + " está dizendo oi...");
    }

    //metodo get para tornar a variavel public
    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return endereco;
    }

    //impelementação tostring para retornar o nome no programa47

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public int compareTo(Object outro) {
        Cliente aux = (Cliente) outro;
        if (this.idade < aux.idade) {
            return -1;
        } else if (this.idade > aux.idade) {
            return 1;
        } else {
            return 0;
        }
    }
}

//protected modificador de acesso.