package com.senai.aula04_heranca.exercicios.ex04_sistema_de_atendimento_medico;

public class Paciente {
    private String nome;
    private int idade;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirInfos () {
        System.out.println("Nome: " + nome + "\nIdade: " + idade);
    }
}
