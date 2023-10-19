//foreach // inpressão para cada caractere
package br.com.geekuniversit.secao05;

public class Programa10 {

    public static void main(String[] args) {
        String nome = "Geek University";
        //para cada string do nome imprima um caractere.
        // declara a variavel letra que recebe variavel nome convertido em um array e imprime letra.
        for (char letra : nome.toCharArray() ) {
            System.out.println(letra);


        }
    }

}