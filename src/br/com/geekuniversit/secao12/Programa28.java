package br.com.geekuniversit.secao12;

//Herança
public class Programa28 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro da silva",2023,"Pedro@.com");
        System.out.println(p1.getNome());

        Aluno a1 = new Aluno("Patricia da silva", 2023, "10", "Patricia@.com");
        System.out.println(a1.getNome());
        System.out.println(a1.getAno_nascimento());
        System.out.println(a1.getRa());

        Professor prof1 = new Professor("Fernando professor",1900,"500","Fernando@.com.br");
        System.out.println(prof1.getNome());
        System.out.println(prof1.getAno_nascimento());
        System.out.println(prof1.getMatricula());

    }

}
