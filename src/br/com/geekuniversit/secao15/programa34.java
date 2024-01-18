package br.com.geekuniversit.secao15;
//Atributos estáticos

/*
Propriedades estaticas das classes
São valores compartilhados entre os obejtos e instâncias das classes utilzadas.

 */
public class programa34 {
    public static void main(String[] args) {
        Conta c1 = new Conta("Angelina Jolie");
        System.out.println(c1.getNumero());
        System.out.println(c1.getCliente());

        Conta c2 = new Conta("Jolie Angelina");
        System.out.println(c2.getNumero());
        System.out.println(c2.getCliente());

        Conta c3 = new Conta("Jolie Angelina");
        System.out.println(c3.getNumero());
        System.out.println(c3.getCliente());
    }
}
