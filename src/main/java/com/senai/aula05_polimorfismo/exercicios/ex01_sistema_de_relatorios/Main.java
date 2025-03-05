package com.senai.aula05_polimorfismo.exercicios.ex01_sistema_de_relatorios;

public class Main {
    public static void main(String[] args) {
        Relatorio[] relatorios = {
                new JSON(),
                new PDF(),
                new CSV()
        };

        for (Relatorio relatorio : relatorios) {
            relatorio.gerar();
        }

    }
}
