package com.senai.aula05_polimorfismo.exercicios.ex02_sistema_de_reservas_de_hotel;

public class Reserva {
    private String nomeUsuario;
    private int qtdNoite;
    private int custoNoite;

    public Reserva(String nomeUsuario, int qtdNoite, int custoNoite) {
        this.nomeUsuario = nomeUsuario;
        this.qtdNoite = qtdNoite;
        this.custoNoite = custoNoite;
    }

    void calcularReserva () {
    }
}
