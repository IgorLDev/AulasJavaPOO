package com.senai.aula06_abstracao.exercicios.exercicios_abstracao;

public class Bicicleta extends Veiculo {
    private double velocidadeMax = getVelocidadeAtual();

    public Bicicleta(double velocidadeAtual, double capacidadeMax, double distanciaDestino, double velocidadeMax) {
        super(velocidadeAtual, capacidadeMax, distanciaDestino);
        this.velocidadeMax = velocidadeMax;
    }

    @Override
    public void calcularTempoEntrega() {
        if (velocidadeMax > 45) {
            System.out.println("Velocidade Inválida.");
        } else {
            System.out.println("Tempo para entrega: " + getDistanciaDestino()/getVelocidadeAtual() + "h");
        }
    }
}
