package br.com.geekuniversit.secao18;

import br.com.geekuniversit.secao11.Cliente;

import java.util.ArrayList;
import java.util.Collections;

public class programa47 {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        Cliente cli1 = new Cliente(10,"Maria", "Rua1");
        Cliente cli2 = new Cliente(28,"Felicity","rua 2");
        Cliente cli3 = new Cliente(20,"Angelina", "Rua3");

        clientes.add(cli3);
        clientes.add(cli2);
        clientes.add(cli1);

        Collections.sort(clientes);

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
