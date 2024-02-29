package br.com.geekuniversit.secao18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class programa44 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try{
            PrintStream escrever = new PrintStream(new FileOutputStream("saída.txt", true));
            System.out.println("Escreva algo: ");
            String msg = teclado.nextLine();
            escrever.println(msg);
            escrever.close();
        }catch(
                FileNotFoundException e)

        {
            System.out.println("Não foi possível criar arquivo ");
        }
        teclado.close();

    }

}
