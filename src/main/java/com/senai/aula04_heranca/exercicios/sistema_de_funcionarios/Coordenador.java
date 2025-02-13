package com.senai.aula04_heranca.exercicios.sistema_de_funcionarios;

public class Coordenador extends Funcionario {
//    private String[] equipeDeProfessores;

    public Coordenador(String nome, double salario, String[] equipeDeProfessores) {
        super(nome, salario);
//        this.equipeDeProfessores = equipeDeProfessores;
    }

    public String[] getEquipeDeProfessores() {
//        return equipeDeProfessores;
    }

    public void setEquipeDeProfessores(String[] equipeDeProfessores) {
//        this.equipeDeProfessores = equipeDeProfessores;
    }

    @Override
    public void exibirInfos() {
        super.exibirInfos();
    }
}
