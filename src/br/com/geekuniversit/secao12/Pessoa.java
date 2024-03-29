package br.com.geekuniversit.secao12;

//Classe Base serve para outras classes
//Classe mãe, Super classe, Classe genérica.



/*
Agora como classe abstrata.
    desta forma impossibilta a criação de objetos desta classe.

Uma classe abstrata pode ter :
- atributos,
- métodos,
- métodos abstratos;

Métodos abstratos:
 São métodos, que não possuem implementação, possuem apenas declaração, e, obrigatoriamente,
 as classes que herdarem desta classe com método abstrato, precisa implementar estes métodos

 */

    public  abstract class Pessoa {
        //Propriedades da classe.
        private String nome;
        private int ano_nascimento;
        private String email;
        ///////////////////////////
        //construtores da classe Pessoa

        public Pessoa(String nome, int ano_nascimento, String email) {
            this.nome = nome;
            this.ano_nascimento = ano_nascimento;
            this.email = email;
        }
        //overloading
        public Pessoa(){
       }

        //métodos publicos da classe porque as propriedades estão como private e para usar essas variaveis precisamos dos
        // métodos Get e Set.
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getNome() {
            return nome;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getEmail() { return this.email; }

        public int getAno_nascimento() {
            return this.ano_nascimento;
        }
        public void setAno_nascimento(int ano_nascimento) {
            this.ano_nascimento = ano_nascimento;
        }


        //overloading
        public void mensagem() {
            System.out.println("Esta é a minha mensagem");
        }

        public void mensagem(String msg) {

        }

        //Método abstract sem implementação.
        public abstract void outra_mensagem(String texto);

    }
