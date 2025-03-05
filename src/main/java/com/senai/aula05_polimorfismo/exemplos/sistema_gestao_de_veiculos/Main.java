package com.senai.aula05_polimorfismo.exemplos.sistema_gestao_de_veiculos;

public class Main {
    public static void main(String[] args) {
        Veiculo[] frota = {
                new Veiculo("Teste"),
                new Carro("Toyota Corolla"),
                new Moto("Honda CB500"),
                new Caminhao("Volvo FH")
        };

        for (Veiculo v : frota) {
            v.realizarManutencao();
        }
    }
}
