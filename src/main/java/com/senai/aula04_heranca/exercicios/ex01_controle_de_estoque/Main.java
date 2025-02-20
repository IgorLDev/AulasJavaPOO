package com.senai.aula04_heranca.exercicios.ex01_controle_de_estoque;

public class Main {
    public static void main(String[] args) {

        Alimentos alimentos1 = new Alimentos("Arroz", 34.00, 11, "01/08/2026");
        Eletronico eletronico1 = new Eletronico("Computador", 3500, 8, 220);

        alimentos1.exibirInfos();
        System.out.println();
        eletronico1.exibirInfos();

    }
}
