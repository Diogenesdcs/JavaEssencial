package br.com.geekuniversit.secao09;
//Construtor

/*O construtor de uma classe SEMPRE tem o mesmo nome da classe.
 * Por padrão a JVM cria em tempo de execução um construtor vazio
 * Podemos ter mas de um construtor na classe. */

import br.com.geekuniversit.secao09.Pessoa;

public class Programa24 {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(); //Método. Construtor

        //atribuindo valor
        pessoa1.nome = "Diógenes";
        pessoa1.email = "d@d";
        pessoa1.ano_nascimento = 1989;

        pessoa1.Imprime_informações();
        ////////////////////////////////

        Pessoa pessoa2 = new Pessoa("Diego", "Diego@email", 1995);
        //chamando o metodo da classe pessoa.
        pessoa2.Imprime_informações();

    }

}