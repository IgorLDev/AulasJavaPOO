package com.senai.aula06_abstracao.exemplos.exemplo_interface.veiculos;

public class Carro implements Veiculo{
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando");
    }
}
