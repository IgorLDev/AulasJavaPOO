package com.senai.aula05_polimorfismo.exemplos.sobreescrita_metodos;

public class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}
