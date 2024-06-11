package br.com.geekuniversit.secao21;

import java.util.Arrays;

public class Vetor {
    private Aluno alunos[] = new Aluno[100]; //vetor alunos com array de alunos tamanho 100
    private int total = 0; //variavel inicia em 0

    //método de pegar
    public void adiciona(Aluno aluno) {
        //retorna vetor alunos com o total = o que rececbe o valor de 100  aluno
        this.alunos[total] = aluno;
        total = total + 1;

    }
    public void adiciona(int posicao, Aluno aluno) {
        for(int i = total -1; i>= posicao; i-=1) {
            alunos[i+1] = alunos[i];
        }
        alunos[posicao] = aluno;
        total++; //total = total +1
    }


    //recebe uma posição e devolve o aluno
    public Aluno pega(int posicao) {
        return this.alunos[posicao];
    }
    //metodo de remover
    public void remove(int posicao) {
        this.alunos[posicao] = null;
    }

    public boolean contem(Aluno aluno) {
        //descobre se o aluno está ou não na lista
        //se aluno for igual a alunos retorna true se não false.
        for(int i = 0; i < total; i++) {
            if(aluno.equals(alunos[i])) {
            return true;
        }
    }
    return false;
}

    public int tamanho() {
        //devolve a quantidade de alunos no vetor iniciado
        return this.total;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.alunos); //facilita na visualização do array
    }
}
