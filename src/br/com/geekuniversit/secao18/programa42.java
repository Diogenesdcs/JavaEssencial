package br.com.geekuniversit.secao18;
//Criando e Escrevendo em arquivos

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class programa42 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            PrintStream escrever = new PrintStream("saida.txt");
            System.out.println("Escreva algo: ");
            String msg = teclado.nextLine();
            escrever.println(msg);
            escrever.close();
        }catch (FileNotFoundException e) {
            System.out.println("Não foi possível criar arquivo ");
        }
        teclado.close();
    }
}
