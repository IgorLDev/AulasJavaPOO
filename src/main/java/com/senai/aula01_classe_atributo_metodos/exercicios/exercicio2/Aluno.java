package com.senai.aula01_classe_atributo_metodos.exercicios.exercicio2;

import java.util.Scanner;

public class Aluno {
    String nome;
    int idade;
    float nota;

    public Aluno(String nome, int idade, float nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "O Aluno " + nome +
                " tem " + idade +
                " anos e tirou nota " + nota +
                " no total.";
    }

    void exibirInformacoes () {
        System.out.println(toString());
    }

    void atualizaNota () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nova nota do aluno: " + nome + " | Nota atual: " + nota);
        int userEscolha = scanner.nextInt();
        nota = userEscolha;
        System.out.println("Nova nota: " + nota);
    }

    void verificarAprovacao () {
        boolean statusDoAluno;

        System.out.println(toString());
        if (nota >= 6) {
            statusDoAluno = true;
        } else {
            statusDoAluno = false;
        }
        System.out.println(statusDoAluno);

    }
}
