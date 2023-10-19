//Operadores matematicos
package br.com.geekuniversit.secao06;

public class Programa15 {

    public static void main(String[] args) {

        int num1 = 3, num2 = 4, res;
        float res2;

        //Soma
        res = num2 + num1;
        System.out.println("A soma de " + num1 + " e " + num2 + " = " + res);

        //subtração
        res = num2 - num1;
        System.out.println("A subtração de " + num2 + " e " + num1 + " = " + res);

        //multiplicação
        res = num2 * num1;
        System.out.println("A multiplicação de " + num2 + " e " + num1 + " = " + res);

        //divisão
        res = num2 / num1; //inteiro
        System.out.println("A divisão de " + num2 + " e " + num1 + " = " + res);

        res2 = (float)num2 / (float)num1; //float divisão real
        System.out.println("A divisão de " + num2 + " e " + num1 + " = " + res2);

    }

}