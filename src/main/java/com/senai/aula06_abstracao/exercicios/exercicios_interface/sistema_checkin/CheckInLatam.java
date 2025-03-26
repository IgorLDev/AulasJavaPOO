package com.senai.aula06_abstracao.exercicios.exercicios_interface.sistema_checkin;

public class CheckInLatam implements CheckIn{
    private int peso;

    public CheckInLatam(int peso) {
        this.peso = peso;
    }

    @Override
    public void realizarCheckIn(double peso) {
        CheckIn.super.realizarCheckIn(peso);
        System.out.println("Viaje com Latam");
    }

    @Override
    public void validarDocumentos() {
        CheckIn.super.validarDocumentos();
        System.out.println("Viaje com Latam");
    }

    public int getPeso() {
        return peso;
    }
}
