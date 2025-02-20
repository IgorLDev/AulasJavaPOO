package com.senai.aula04_heranca.exercicios.ex04_sistema_de_atendimento_medico;

public class PacienteConvenio extends Paciente{
    private float desconto;

    public PacienteConvenio(String nome, int idade, float desconto) {
        super(nome, idade);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

   public void exibirInfos() {
        super.exibirInfos();
       System.out.println("Desconto: " + desconto + "%");
   }
}
