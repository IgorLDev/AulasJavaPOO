package com.senai.aula04_heranca.exemplos.veiculos;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", 2010, 4);
        Moto moto = new Moto("Honda", 2011, true);

        System.out.println("Detalhes do Carro: ");
        carro.exibirDetalhes();

        System.out.println("\nDetalhes da Moto: ");
        moto.exibirDetalhes();
    }
}
