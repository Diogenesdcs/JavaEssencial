package br.com.geekuniversit.secao15;
//métodos estáticos

/*
Um método estático não depende de uma isntância da classe para ser utilizado.
vc retorna o valor da informação sem precisar instânciar uma classe.

Pode ser utilizado conforme:
NomeDaClasse.metodo();

 */

public class programa35 {
    public static void main(String[] args) {
        Conta c4 = new Conta("fernandinopolis");
        System.out.println(c4.getNumero());

        //imprimindo método sem instância de classe.
        System.out.println(Conta.proximaConta());

    }
}
