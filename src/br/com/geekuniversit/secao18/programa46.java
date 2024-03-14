package br.com.geekuniversit.secao18;

import java.util.ArrayList;
import java.util.Collections;

public class programa46 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(42);
        numeros.add(25);
        numeros.add(26);
        numeros.add(54);
        numeros.add(46);
        numeros.add(89);

        //System.out.println(numeros.get(1));

        Collections.sort(numeros);

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));;
        }
    }
}
