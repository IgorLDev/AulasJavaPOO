package com.senai.aula04_heranca.exemplos.veiculos;

public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, int ano, int portas) {
        super(marca, ano);
        this.portas = portas;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Portas: " + portas);
    }
}
