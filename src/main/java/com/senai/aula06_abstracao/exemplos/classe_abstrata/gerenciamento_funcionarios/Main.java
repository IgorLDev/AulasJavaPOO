package com.senai.aula06_abstracao.exemplos.classe_abstrata.gerenciamento_funcionarios;

public class Main {
    public static void main(String[] args) {
        testeFuncionarios(new FuncionarioEfetivo("Igor", 15000, 5000));
        testeFuncionarios(new FuncionarioTemporario("Gabriel", 20, 24, 5));

    }

    public static void testeFuncionarios(Funcionario funcionario) {
        funcionario.exibirDados();
        funcionario.aumentarSalario(20);
        funcionario.exibirDados();
        funcionario.calcularBonus();
        funcionario.exibirDados();
    }
}
