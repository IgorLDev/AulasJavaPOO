package com.senai.aula05_polimorfismo.exemplos.sobrecarga_metodos;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.somar(2,3));
        System.out.println(calculadora.somar(1,2,3));
        System.out.println(calculadora.somar(2.5,4.5));
        System.out.println(calculadora.somar(4.2f,6));
        System.out.println(calculadora.somar(6,4.2f));
    }
}
