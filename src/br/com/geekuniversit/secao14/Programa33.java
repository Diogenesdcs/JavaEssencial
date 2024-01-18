package br.com.geekuniversit.secao14;
//Programa
//interfaces o que é e quando utilizar

/*
-Interfaces são conhecidas como "contratos".

Exemplo:
Uma empresa criou um contrato 'com regras' para definir a criação de um produto/serviço.

Quem implementar este contrato é OBRIGADO  a seguir as regras.

O João, decidiu implementar um p roduto/serviço baseado neste contrato.
A Maria, também decidiu implemtar um produto/serviço baseado no mesmo contrato.

Contratopara a confecção de um bolo.
    - O bolo precisa ser de chocolate;
    - O bolo deve ter cobertura;
    - O bolo deve ser recheado;
 */


public class Programa33 {
    public static void main(String[] args) {
        Ventilador vent = new Ventilador(); //instância do objeto classe ventilador

        System.out.println("Marca do ventilador é " + vent.MARCA);

        //MÉTODOS
        vent.desligar(); //não imprimi
        vent.ligar(); //imprimi
        vent.desligar(); //imprimi

    }
}
