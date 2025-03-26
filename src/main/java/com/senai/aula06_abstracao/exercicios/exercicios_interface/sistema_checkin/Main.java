package com.senai.aula06_abstracao.exercicios.exercicios_interface.sistema_checkin;

public class Main {
    public static void main(String[] args) {
        CheckIn.mensagemPadrao();
        System.out.println("----- Teste CheckIn -----");
        testesCheckIn(new CheckInAvianca(8));
        testesCheckIn(new CheckInGol(20));
        testesCheckIn(new CheckInLatam(36));
    }

    public static void testesCheckIn(CheckIn checkIn){
        if (checkIn instanceof CheckInAvianca checkInAvianca) {
            checkInAvianca.realizarCheckIn(checkInAvianca.getPeso());
            checkInAvianca.validarDocumentos();

        } else if (checkIn instanceof CheckInGol checkInGol) {
            checkIn.realizarCheckIn(checkInGol.getPeso());
            checkInGol.validarDocumentos();

        } else if (checkIn instanceof CheckInLatam checkInLatam) {
            checkIn.realizarCheckIn(checkInLatam.getPeso());
            checkIn.validarDocumentos();
        }

    }
}
