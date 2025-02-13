package com.senai.aula04_heranca.exemplos.veiculos;

public class Moto extends Veiculo {
    private boolean temPartidaEletrica;

    public Moto(String marca, int ano, boolean temPartidaEletrica) {
        super(marca, ano);
        this.temPartidaEletrica = temPartidaEletrica;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Partida elétrica: " + (temPartidaEletrica ? "Sim" : "Não"));
    }
}
