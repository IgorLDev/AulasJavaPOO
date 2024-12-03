package com.senai.aula01_classe_atributo_metodos.exercicios.exercicio2;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(
                "Igor",
                21,
                10);

        Aluno aluno2 = new Aluno(
                "Gabriel",
                16,
                5);

        Aluno aluno3 = new Aluno(
                "Eric",
                16,
                0);

        System.out.println("2. Atualize a nota de um dos alunos.");
        aluno3.atualizaNota();
        System.out.println();

        System.out.println("3. Exiba as informações de todos os alunos.");
        aluno1.exibirInformacoes();
        aluno2.exibirInformacoes();
        aluno3.exibirInformacoes();
        System.out.println();

        System.out.println("4. Verifique se cada aluno está aprovado ou reprovado e mostre uma mensagem indicando o resultado.");
        aluno1.verificarAprovacao();
        aluno2.verificarAprovacao();
        aluno3.verificarAprovacao();
    }
}
