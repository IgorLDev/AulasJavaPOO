package com.senai.aula06_abstracao.exercicios.exercicios_interface.sistema_checkin;

public class CheckInAvianca implements CheckIn{
    private int peso;

    @Override
    public String realizarCheckIn(int peso) {
        return "Viaje com a Avianca";
    }
}
