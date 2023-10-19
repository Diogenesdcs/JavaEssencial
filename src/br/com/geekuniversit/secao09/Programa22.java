/*Objetos
 São produtos instâncias de uma classe.
 para criar um objeto precisamos ter um classe e suas caracteristicas e atributos.
 
 */

package br.com.geekuniversit.secao09;

public class Programa22 {

    public static void main(String[] args) {

        //Declaração de objeto Instânciação de objeto e inicialização de objeto
        //p1 Instância do objeto.
        //Produto é a classe. Classe se torna um objeto instanciado.
        Produto p1 = new Produto(); //new é o construtor
        p1.nome = "Notebook";
        p1.preco = 1500f;
        p1.desconto = 10.01f;

        System.out.println("------------Produto------------");
        System.out.println("Nome: " + p1.nome);
        System.out.println("Preço R$: " + p1.preco);
        System.out.println("Desconto %: " + p1.desconto);

        System.out.println();

        Pessoa p0 = new Pessoa();
        p0.nome = "Renata";
        p0.email = "Renata@hotmail";
        p0.idade = 25;
        p0.ano_nascimento = 1990;

        System.out.println("------------Pessoas------------");
        System.out.println("Nome: " + p0.nome);
        System.out.println("Email: " + p0.email);
        System.out.println("Idade: " + p0.idade);
        System.out.println("Nascimento: " + p0.ano_nascimento);

    }
}