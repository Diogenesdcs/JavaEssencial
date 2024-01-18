package br.com.geekuniversit.secao14;
//Interface
/*
Uma interface pode conter:
    - constantes;
    - somentes métodos abstratos;

Interface para servir de contrato para produtos eletrônicos.
Todo produto eletrônico que implementar esta interface
OBRIGRATORIAMENTE deverão implementar os métodos abstratos
 */
public interface IEletronico {
    public String MARCA = "Geek";
    public void ligar();
    public void desligar();


}
