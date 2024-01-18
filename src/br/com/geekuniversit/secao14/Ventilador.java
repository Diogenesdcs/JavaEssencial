package br.com.geekuniversit.secao14;

public class Ventilador implements IEletronico{
    //declara variavel booleano para a implementação dos if e else.

    private boolean ligado = false;

    @Override
    public void ligar() {
        if(!this.ligado){
            this.ligado = true;
            System.out.println("Ventilador esta ligado");
        }
    }

    @Override
    public void desligar() {
        if(this.ligado){
            this.ligado = false;
            System.out.println("ventilador esta desligado");
        }
    }
}
