package br.com.geekuniversit.secao12;

 //sobrecarga de métodos.
 //overloading
 //só acontece quando o mesmo metodo utilizado tem parâmetros diferentes.
public class Programa29 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa() {
            @Override
            public void outra_mensagem(String texto) {

            }
        };

        p1.mensagem();
        p1.mensagem(" Minha mensagem é diferente");
    }
}
