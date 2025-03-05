package com.senai.aula05_polimorfismo.exemplos.sobreescrita_metodos;

public class Gato extends Animal {
    @Override
    void fazerSom() {
        System.out.println("O gato mia: Miau Miau!");
    }
}
