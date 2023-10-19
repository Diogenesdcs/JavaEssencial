//Operador ternario 
package br.com.geekuniversit.secao04;

public class Programa05 {
    public static void main(String[] args) {

        int valor = 5, numero;

        if(valor > 0) {
            numero = valor;
        }else {
            numero = 3;

            //Operador ternario
            //numero = (valor > 0) ? valor : 7;

            System.out.println(numero);
        }
    }
}