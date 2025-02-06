package com.senai.aula03_encapsulamento.exercicios.gerenciamento_de_funcionarios;

import java.util.Arrays;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private String[] Cargos = {"Gerente", "Analista", "Programador"};

    public Funcionario(String nome, int idCargo, double salario) {
        this.nome = nome;
        this.cargo = Cargos[idCargo];

        if (salario < 1320) {
            this.salario = 1320;
            System.out.println("O salário não pode ser menor que R$1.320,00." +
                    "\nO valor foi ajustado para R$1.320,00");
        } else {
            this.salario = salario;
        }
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            System.out.println("Usuário, informe um nome válido.");
            return true;
        } else {
            this.nome = nome;
            return false;
        }
    }

    public String getCargo() {
        return cargo;
    }

    public boolean setCargo(int idCargo) {
        if (idCargo >= 0 && idCargo < 3) {
            this.cargo = Cargos[idCargo-1];
            return false;
        } else {
            System.out.println("Usuário, informe um cargo válido.");
            return true;
        }
    }

    public double getSalario() {
        return salario;
    }

    public boolean setSalario(double salario) {
        if (salario > 1320) {
            System.out.println("Salário atribuido: R$" + salario);
            this.salario = salario;
            return false;
        } else {
            System.out.println("O salário não pode ser menor que R$1.320,00");
            return true;
        }
    }

    public void visualizarSalario() {

    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
