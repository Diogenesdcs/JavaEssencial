package br.com.geekuniversit.secao19;
//Listas
/*
Arrays (vetores e matrizes)
- Um array tem tamanho fixo. Ou seja se criarmos um array com 5 elementos ele
terá sempre no maximo 5 elementos.

- Um array tem tipo de dado fixo. Ou seja se criarmos um array de tipo interios ele so poderá ter inteiros.
- É dificil encontrar um detenrminado elemento em um array.
Precisamos para isso varrer todo o array através do seu índice, caso não façamos busca pelo índice.
 */

/*Colections
Java possui diversas classes e interfaces que facilitam muito o trabalho quando
se trata de coleções de dados.Essas classes /interfaces são chamadas de collections
 */
/*
Listas
Podemos adicionar valores de qualquer tipo, desde que não especificamos um tipo na declaração;
 */


import java.util.ArrayList;
import java.util.Collections;

public class Programa45 {
    public static void main(String[] args) {
        //Sem tipos de dados podemos colocar qualquer tipo.
        //ArrayList<String> nomes = new ArrayList<String>();
        ArrayList<String> nomes = new ArrayList<String>();

        nomes.add("Maria");
        nomes.add("joão");
        nomes.add("fernanda");
        nomes.add("Day");

        //imprime na posição
       // System.out.println(nomes.get(0));//System.out.println(nomes.get(3));

        //imprime todo o array
        //for (int i = 0; i < nomes.size(); i ++){
        //System.out.println(nomes.get(i));

        //Para listar ordenadamente os valores do array
        Collections.sort(nomes);

        for (Object nome : nomes) {
            System.out.println(nome);
        }

        }
    }

