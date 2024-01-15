package br.com.geekuniversit.secao13;

import java.nio.channels.Pipe;
//classe principal
//Template method
public abstract class Treinamento {

    //Tempalte Method
    // Final é um modificador de acesso que faz com que o elemento que esteha utilizando. não possa ser extendido ou reescrito.
    public final void TreinoDiario() {
        preparoFisico();
        jogoTreino();
        jogoTatico();
    }

    public abstract void preparoFisico();
    public abstract void jogoTreino();
    public final void jogoTatico(){
    System.out.println("Treino tático...");

    }
}