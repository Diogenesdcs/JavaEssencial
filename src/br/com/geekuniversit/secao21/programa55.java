package br.com.geekuniversit.secao21;
/*/
Armazenamento sequencial
int numero[] = new int[5]; vetor numero tem 5 posições

numero[0] = 1;
numero[1] = 2;
numero[2] = 4;
numero[3] = 3;
numero[4] = 8;

 */

public class programa55 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Angelita");
        Aluno a2 = new Aluno("Felicity");
        Aluno a3 = new Aluno("Maria");

        Vetor lista = new Vetor();

        //objeto lista chama o método adiciona.
        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(0,a3);


        System.out.println(lista);

        System.out.println(lista.contem(a1));
        System.out.println(lista.pega(0));
    }
}
