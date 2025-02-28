package com.senai.aula05_polimorfismo.exemplos.sistema_de_pagamentos;

public class Main {
    public static void main(String[] args) {
        Pagamento[] pagamentos = {
                new CLT("Marcos", 5000),
                new PJ("Julia", 160, 50),
                new Freelancer("Roberto", 4000)
        };

        for (Pagamento p : pagamentos) {
            System.out.println(p.getNome() + " recebe R$ " + p.calcularPagamento());
        }
    }
}
