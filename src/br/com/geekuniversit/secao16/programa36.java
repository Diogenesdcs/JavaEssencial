package br.com.geekuniversit.secao16;
//Tratando excessões com try/catch

/*
utilizamos o try para tentar realizar algo, geralmente realizar aquilo que pode acarretar em um problema.

utilizamos o catch para capturar o erro e com isso oferecer ao usuário do sistema e oferececr uma mensagem
adequada se que o sistema o quebre.
 */

public class programa36 {
    public static void main(String[] args) {
       //array
       int numeros[] = new int[5]; //0..4..-> 0,1,2,3,4 -> n-1

        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 3 * 2;
        }

        //imprimir o valor de i
        for(int i = 0; i < numeros.length; i++) {
                System.out.println(numeros[i]);
            }
        //capturando mensagem de excessão error no sistema
        for(int i = 0; i <= numeros.length; i++){
            try { //tente fazer isso
                System.out.println(numeros[i]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Você esta tentando acessar uma posição do array que não existe");
            }finally {
                System.out.println("Continua o processo...");
            }
        }
    }
}
