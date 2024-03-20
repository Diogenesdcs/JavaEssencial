package br.com.geekuniversit.secao19;

import java.security.KeyStore;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Mapas /Map
/*
Os mapas são representados em Java pela interface Map e mapeia seus elementos
utilizando o coneito de chave/valor
-Mapas são conhecidos como se fossem 3 coleções.
    - coleção de chaves.
    - coleção de valores.
    - coleção de associações.
*/
    public class programa50 {
    public static void main(String[] args) {
        Map<Integer, String> pessoas = new HashMap<Integer, String>();

        //método para adicionar no obejto pessoas
        pessoas.put(21, "Successo");
        pessoas.put(31, "Aprendizado");
        pessoas.put(41, "Angel");

        //coleção de chaves
        System.out.println(pessoas.keySet());
        //coleção de valores.
        System.out.println(pessoas.values());
        //coleção de associações.
        System.out.println(pessoas.entrySet());

        //For each para imprimir objeto da chave
        for (Integer idade : pessoas.keySet()) {
            System.out.println(pessoas.get(idade));

            //Iteração na coleção de valores
            //Forma1
            Collection<String> valores = pessoas.values();
            //declara variavel nome e atribui a valores depois imprimie valores
            for (String nome : valores) {
                System.out.println(nome);
            }
            //forma2
            pessoas.values().forEach(nome -> {
                System.out.println(nome);
            });

            //Interação de coleção de associações

            //Forma1
            Set<Map.Entry<Integer, String>> associacoes = pessoas.entrySet();
            for(Map.Entry<Integer, String> associacao : associacoes) {
                System.out.println(associacao.getKey() + " - " + associacao.getValue());
            }
//            //Forma2
//            pessoas.entrySet().forEach(associacao ->) {
//                System.out.println( );
//            };


        }
    }
}
