package br.com.geekuniversit.secao20;
/*
Para executar métodos executado por threads em paralelo, nossa classe
deve implementar a interface Runnable, e o método que precisar ser executado
dever ser executado dentro do método run.

 */
//Implementação da interface Runnable
public class GeraRelatorio implements Runnable{
    //Classe para gerar relatório for de  1 ate 10 milhões

//    public void executa() {
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("Gerando relatório...aguarde");
//        }


    //Threads
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Gerando relatório...aguarde");
        }
    }
}
