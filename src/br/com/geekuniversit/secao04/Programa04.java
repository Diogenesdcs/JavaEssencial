//Estruturas de decisão "if,else, else if"
package br.com.geekuniversit.secao04;

public class Programa04 {

    public static void main(String[] args) {
        int numero = 5;
		
		/*se for maior que 5 então imprima
		  senão se imprima é igual a 5 
		  senão imprima não é maior que 5.*/

        if(numero > 5 ){
            System.out.println("Sim o número " + numero + " é maior que 5");
        }else if(numero == 5 ){
            System.out.println("O número " + numero + " é igual a 5");
        }else {
            System.out.println("O número " + numero + " não é maior que 5");
        }
    }
}