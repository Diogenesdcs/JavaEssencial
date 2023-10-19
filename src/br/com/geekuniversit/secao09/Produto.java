
/*/Classes são modelos de dados.
--O nome da Classe inicia com letra maiuscula.
--O nome não deve conter: acentuação,caractere especiais, espaço. 
--Nas classes javas não existe a implementação da função Main(). 
--Toda classe java possui a seguinte forma: O nome da classe java DEVE conter o mesmo nome do arquivo.java. 
--Tudo que estiver dentro das chaves faz parte da classe.


/*attributos são caracteristicas das classes molde modelo.
  Atributos são nomeados em letras minusculas sem espaços e caracteres especiais, sem acentuação.
*/

/*Métodos
--Podemos entender os métodos como a ação realizada pelo objeto da classe.
--Podemos enteder que os métodos são comportamento do objeto da classe.

	mesmo requisito que funções.
	a)Tipo de retorno (Tipo de dado que a função vai retorna)
	b)Nome - Corresponde a ação que a função realiza.
	c)Parâmetros/argumentos de entrada (opcional)
	d)Retorno (Opcional - depende do tipo de retorno.
*/

package br.com.geekuniversit.secao09;
//classe
public class Produto {
    //atributos caracteristicas da classe. são utilizados pelos objetos.
    String nome;
    float preco;
    float desconto;

    //Método para aumentar o preço do projeto em 10
    void aumentar_preco(float valor) {
        this.preco = this.preco + valor;
    }
};