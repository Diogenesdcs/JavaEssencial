package br.com.geekuniversit.secao20;
//Utilizando Classes Threads

public class programa52 {
    public static void main(String[] args) {
    BarraDeProgresso barra = new BarraDeProgresso();
    Thread t1 = new Thread(barra);
    t1.start();

    GeraRelatorio relatorio = new GeraRelatorio();
    Thread t2 = new Thread(relatorio);
    t2.start();
    }
}
