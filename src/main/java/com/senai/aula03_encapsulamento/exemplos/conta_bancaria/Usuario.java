package com.senai.aula03_encapsulamento.exemplos.conta_bancaria;

public class Usuario {
    private String nome;
    private String dataDeNascimento;
    private int CPF;

    public Usuario(String nome, String dataDeNascimento, int CPF) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", CPF=" + CPF +
                '}';
    }
}
