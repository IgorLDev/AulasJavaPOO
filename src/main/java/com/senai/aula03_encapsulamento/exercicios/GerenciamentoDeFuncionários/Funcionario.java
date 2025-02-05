package com.senai.aula03_encapsulamento.exercicios.GerenciamentoDeFuncionários;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private String[] opcoesCargos = {"Gerente","Analista","Programador"};


    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo + opcoesCargos[-1];
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty()) {
            System.out.println("Usuário, o nome está vazio.");
        } else {
            this.nome = nome;
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 1320) {
            System.out.println("Salário atribuido: R$" + salario);
        } else {
            System.out.println("O salário não pode ser menor que R$1.320,00");
        }
        this.salario = salario;
    }

    public void visualizarSalario () {

    }
}
