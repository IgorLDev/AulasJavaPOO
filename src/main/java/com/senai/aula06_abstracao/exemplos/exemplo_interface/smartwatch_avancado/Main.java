package com.senai.aula06_abstracao.exemplos.exemplo_interface.smartwatch_avancado;

public class Main {
    public static void main(String[] args) {
        SmartWatchAvancado smartWatchAvancado = new SmartWatchAvancado();

        smartWatchAvancado.contarPassos();
        smartWatchAvancado.medirFrequenciaCardiaca();
        smartWatchAvancado.medirQualidadeSono();
        smartWatchAvancado.exibirDispositivos();

    }
}
