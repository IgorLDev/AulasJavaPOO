package com.senai.aula01_classe_atributo_metodos.carro;

import java.util.Objects;

public class Carro {
    String marca;
    String modelo;
    String corCarro;
    double precoBase;
    double motor;
    byte portas;
    int anoFabricacao;

    public Carro(String marca, String modelo, String corCarro, double precoBase, double motor, byte portas, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.corCarro = corCarro;
        this.precoBase = precoBase;
        this.motor = motor;
        this.portas = portas;
        this.anoFabricacao = anoFabricacao;
    }

    public void verificarInformacoes() {
        System.out.println("Marca = "+ marca);
        System.out.println("Modelo = "+ modelo);
        System.out.println("Cor = "+ corCarro);
        System.out.println("Ano de Fabricação = "+ anoFabricacao);
        System.out.println("Motor = "+ motor);
        System.out.println("Portas = "+ portas);
    }

    public void ligarCarro(){
        System.out.println("Vruummm");
    }

    public void testarSom(){
        System.out.println("Som ligando");
    }

    public void buzinar(){
        System.out.println("Bi-biii");
    }

    public void consultarPreco(int anoAtual){
        int idadeCarro = anoAtual - anoFabricacao;
        double precoAtual = precoBase;

        for (int ano = 0; ano < idadeCarro; ano++) {
            precoAtual -= (precoBase * 0.05);
        }

        System.out.println("O valor atual do carro é de: " + precoAtual);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", corCarro='" + corCarro + '\'' +
                ", precoBase=" + precoBase +
                ", motor=" + motor +
                ", portas=" + portas +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Double.compare(precoBase, carro.precoBase) == 0 && Double.compare(motor, carro.motor) == 0 && portas == carro.portas && anoFabricacao == carro.anoFabricacao && Objects.equals(marca, carro.marca) && Objects.equals(modelo, carro.modelo) && Objects.equals(corCarro, carro.corCarro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, corCarro, precoBase, motor, portas, anoFabricacao);
    }
}


