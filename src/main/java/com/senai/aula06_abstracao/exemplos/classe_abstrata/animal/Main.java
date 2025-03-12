package com.senai.aula06_abstracao.exemplos.classe_abstrata.animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

     Cachorro cachorro = new Cachorro("Gabriel");
     Gato gato = new Gato("Tom");

    emitirSom(cachorro);
    emitirSom(gato);

        List<Animal> listaAnimal = new ArrayList<>();

        listaAnimal.add(cachorro);
        listaAnimal.add(gato);

//      listaAnimal.forEach(animal -> animal.dormir() );
        listaAnimal.forEach(Animal::dormir);
        listaAnimal.forEach(System.out::println);

    }

    public static void emitirSom(Animal animal){
        animal.fazerSom();
    }
}
