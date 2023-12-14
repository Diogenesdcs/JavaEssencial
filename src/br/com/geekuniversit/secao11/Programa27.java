package br.com.geekuniversit.secao11;
//Private

//Privado à própria classe.class
//Ou seja, só temos  acesso ao atributo ou método privado
//dentro da própria  classe onde ele  foi declarado.

public class Programa27 {
    //instanciando classe cliente e  imprimindo via get
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("felicity Jones", "Rua Qualquer 123");

        System.out.println("Nome:" + cli1.getNome());
        System.out.println("Endereço:" + cli1.getEndereco());
    }
}
