package com.senai.aula06_abstracao.exercicios.exercicios_interface.sistema_checkin;

public class CheckInGol implements CheckIn {
    private int peso;

    public CheckInGol(int peso) {
        this.peso = peso;
    }

    @Override
    public void realizarCheckIn(double peso) {
        CheckIn.super.realizarCheckIn(peso);
        System.out.println("Viaje com Gol.");
    }

    @Override
    public void validarDocumentos() {
        CheckIn.super.validarDocumentos();
        System.out.println("Viaje com Gol.");
    }

    public int getPeso() {
        return peso;
    }
}
