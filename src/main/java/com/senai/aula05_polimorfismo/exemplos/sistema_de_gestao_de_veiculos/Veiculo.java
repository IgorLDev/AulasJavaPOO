package com.senai.aula05_polimorfismo.exemplos.sistema_de_gestao_de_veiculos;

public class Veiculo {
    private String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public void realizarManutencao(){
        System.out.println("Manutenção genérica");
    } // Metodo polimórfico

    public String getModelo() {
        return modelo;
    }
}
