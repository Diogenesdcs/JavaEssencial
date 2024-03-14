package br.com.geekuniversit.secao18;
//Conjuntos

import java.util.HashSet;
import java.util.Set;

/*
Os conjuntos são implementados com a interface Set, e uma das classes que implementam esta interface é a HashSet
A maioria das coleções possuem os mesmos métodos já conhecidos e utilizados com as listas, mas o comportamento
desses objetos é um pouco diferente.

A Performance também é melhor em conjuntos do que em listas.

Caracterisiticas dos conjuntos:
-Não aceitam valores repetidos
-Não aceita ordenação;
-Não possui indice;
 */
public class programa48 {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<String>();

        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Renato");
        nomes.add("Rafael");
        nomes.add("Rafael"); //não imprime valore duplicados

        //imprime o tamanho da lista
        System.out.println(nomes.size());

     //for para percorrer todo array de lista e imprimir o valor da variável
        for (String a : nomes){
            System.out.println(a);
        }

    }
}
