package br.com.geekuniversit.secao18;
//Trabalhando com Strings
//Em java strings são imutaveis.
public class programa41 {
    public static void main(String[] args) {
        String curso = "Programação em Java: Essencial";

        curso = curso.replace("Java", "Phyton"); //replace altera na string, se encontrar a primeira palavra pela segunda
        System.out.println(curso);

        curso = curso.toLowerCase();//converte as letras para minúsculas.
        System.out.println(curso);

        curso = curso.toUpperCase(); //converte as letras para maiúsculas.
        System.out.println(curso);
    }
}
