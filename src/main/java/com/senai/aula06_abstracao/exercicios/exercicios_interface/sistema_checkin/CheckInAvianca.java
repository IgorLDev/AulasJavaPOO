package com.senai.aula06_abstracao.exercicios.exercicios_interface.sistema_checkin;

public class CheckInAvianca implements CheckIn{
    private double peso;

    public CheckInAvianca(double peso) {
        this.peso = peso;
    }

    @Override
    public void realizarCheckIn(double peso) {
        CheckIn.super.realizarCheckIn(peso);
        System.out.println("Viaje com Avianca");
    }

    @Override
    public void validarDocumentos() {
        CheckIn.super.validarDocumentos();
        System.out.println("Viaje com Avianca");
    }

    public double getPeso() {
        return peso;
    }
}
