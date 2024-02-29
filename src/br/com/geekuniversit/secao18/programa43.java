package br.com.geekuniversit.secao18;
//Lendo em arquivos

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class programa43 {
    public static void main(String[] args) {
    try {
         Scanner ler = new Scanner(new FileInputStream("saida.txt")); //leitura de arquivo de entrada
        //para ler as linhas do arquivo utilizando a função hasnextiline
         while (ler.hasNextLine()) {
             String linha = ler.nextLine();
             System.out.println(linha);
         }
         ler.close();
    }catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
            }
    }

}
