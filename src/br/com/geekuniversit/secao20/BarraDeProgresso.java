package br.com.geekuniversit.secao20;
/*
Para executar métodos em paralelo, nossa classe
deve implementar a interface Runnable, e o método que precisar ser executado
dever ser executado dentro do método run.

 */
public class BarraDeProgresso implements Runnable{
    //for 1 até 10 milhões.

//    public void executa() {
//        for(int i = 0; i < 1000; i ++) {
//            System.out.println("Barra de progresso...aguarde");
//        }

    //com Threads
    @Override
    public void run() {
        for(int i = 0; i < 1000; i ++) {
            System.out.println("Barra de progresso...aguarde");
        }
    }
}