package br.com.geekuniversit.secao13;
//Programa
/*tempate metodo define o esqueleto de um algoritmo dentro de um método.
//transferindo seus passos para as subclasses. O template metodo permite que as sublcasses redefinam certos passos de um
//algoritmo sem alterar a estrutura do próprio algoritmo.

//Algoritmos são receitas de passo a passo para resolver o problema.
Exemplo:
metodo_principal(){
    Passo1();
    Passo2();
    Passo3();
 }
    */

//instância da classe
public class Programa32 {
    public static void main(String[] args){
    TreinamentoIncioDaTemporada tit = new TreinamentoIncioDaTemporada();
    tit.TreinoDiario();

    TreinamentoFimDaTemporada tft = new TreinamentoFimDaTemporada();
    tft.TreinoDiario();
    }
}
