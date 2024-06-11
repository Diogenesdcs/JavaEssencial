package br.com.geekuniversit.secao21;

public class  Aluno {
    private String nome;

    public Aluno(String nome){
        this.nome = nome;
    }

    //para buscar os nome de dentro da classe.
    public String getNome(){
        return this.nome;
    }

    // outro é igual a aluno
    @Override
    public boolean equals(Object obj) {
        Aluno outro = (Aluno) obj;
        return outro.getNome().equals(this.nome);
    }

        //retorna o nome do aluno
    @Override
    public String toString() {
        return this.nome ;
    }
}
