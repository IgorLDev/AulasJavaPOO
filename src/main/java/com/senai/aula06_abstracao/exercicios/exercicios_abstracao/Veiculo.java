package com.senai.aula06_abstracao.exercicios.exercicios_abstracao;

public abstract class Veiculo {
    private double velocidadeAtual;
    private double capacidadeMax;
    private double distanciaDestino;

    public Veiculo(double velocidadeAtual, double capacidadeMax, double distanciaDestino) {
        this.velocidadeAtual = velocidadeAtual;
        this.capacidadeMax = capacidadeMax;
        this.distanciaDestino = distanciaDestino;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public double getCapacidadeMax() {
        return capacidadeMax;
    }

    public double getDistanciaDestino() {
        return distanciaDestino;
    }

    public void exibirVelocidade() {
        System.out.println("Velocidade atual: " + velocidadeAtual + "Km/h.");
    }

    public void exibirCargaMax() {
        System.out.println("Capacidade Máxima: " + capacidadeMax + ".");
    }

    public void exibirDistancia() {
        System.out.println("Distância até o destino: " + distanciaDestino + "km.");
    }

    public void calcularTempoEntrega() {}
}
