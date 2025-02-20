package com.senai.aula04_heranca.exercicios.ex04_sistema_de_atendimento_medico;

public class PacienteParticular extends Paciente{
    private double consulta;

    public PacienteParticular(String nome, int idade, double consulta) {
        super(nome, idade);
        this.consulta = consulta;
    }

    public double getConsulta() {
        return consulta;
    }

    public void setConsulta(double consulta) {
        this.consulta = consulta;
    }

    public void exibirInfos() {
        super.exibirInfos();
        System.out.println("Custo da consulta: " + consulta);
    }
}
