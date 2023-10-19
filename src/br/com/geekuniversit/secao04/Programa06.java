//Instrução switch case.
package br.com.geekuniversit.secao04;

public class Programa06 {

    public static void main(String[] args) {
        int numero = 2;

        switch (numero) {
            case 1:
                System.out.println("O número 1");
                break;
            case 2:
                System.out.println("O número é 2");
                break;
            case 3:
                System.out.println("O número é 3");
                break;
            default:
                System.out.println("O número é default");
                break;
        }
    }
}