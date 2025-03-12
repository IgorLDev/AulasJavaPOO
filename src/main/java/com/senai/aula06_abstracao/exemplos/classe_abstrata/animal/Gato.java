package com.senai.aula06_abstracao.exemplos.classe_abstrata.animal;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println(nome + " está miando: MEAAAAAAAOWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");

    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
