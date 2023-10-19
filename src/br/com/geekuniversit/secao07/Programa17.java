//Declaração dos tamanhos dos vetores e arrays
package br.com.geekuniversit.secao07;

public class Programa17 {
    public static void main(String[] args) {
        //Declaração de tamanho de vetores

        int numeros[] = new int[10];
        System.out.println("Tamanho do vetor:" + numeros.length);

        //enquanto i for menor tamanho do vetor então i ++.
        for (int i = 0; i < numeros.length; i++) {
            //numeros[0] = i + 3;
            numeros[i] = i + 3 ;
            //numeros[9] = i + 3;
        }

        System.out.println("Primeiro elemento " + numeros[0]);
        System.out.println("Último elemento " + numeros[9]);

        //Os vetores possuem tamanhos fixos e não podem ser alterados ou diminuidos.

    }


}