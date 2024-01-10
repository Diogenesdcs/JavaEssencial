package br.com.geekuniversit.secao12;
//Herança
//Beneeficios da herança evita repetição de código e facilita a manutenção do programa.
//Quando uma classe herda de outra classe ela ganha todos os atributos e métodos da classe herdada.

//Sub classe de Pessoa, classe filha.
public class Aluno extends Pessoa{
    private String ra;

    public Aluno(String nome, int ano_nascimento, String ra, String email) {
        super(nome,ano_nascimento,email);
        this.ra = ra;
    }



    public String getRa() {
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }


    //método abstract herdado da classe pessoa obrigatoriamente.
    @Override
    public void outra_mensagem(String texto) {

    }
}
