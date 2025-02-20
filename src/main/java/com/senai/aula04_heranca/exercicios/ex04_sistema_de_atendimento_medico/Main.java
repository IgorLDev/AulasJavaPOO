package com.senai.aula04_heranca.exercicios.ex04_sistema_de_atendimento_medico;

public class Main {
    public static void main(String[] args) {

        Paciente paciente1 = new PacienteParticular("Igor",21, 28.00);
        Paciente paciente2 = new PacienteConvenio("Eric", 17, 25);

        paciente1.exibirInfos();

        paciente2.exibirInfos();
    }
}
