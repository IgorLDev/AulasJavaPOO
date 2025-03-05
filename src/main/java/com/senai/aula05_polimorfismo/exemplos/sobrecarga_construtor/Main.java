package com.senai.aula05_polimorfismo.exemplos.sobrecarga_construtor;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Feijão");
        Produto produto2 = new Produto("Arroz", 10);
        Produto produto3 = new Produto("Macarrão", 5, 2);
        Produto produto4 = new Produto();
    }
}
