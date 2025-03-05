package com.senai.aula05_polimorfismo.exemplos.sobreescrita_metodos;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Cachorro();
        animal.fazerSom();

        animal = new Gato();
        animal.fazerSom();

        animal = new Animal();
        animal.fazerSom();

        emitirSom(new Gato());
        emitirSom(new Cachorro());
        emitirSom(new Animal());
    }

    public static void emitirSom(Animal animal) {
        System.out.println("-----------------------------");
        animal.fazerSom();

    }
}
