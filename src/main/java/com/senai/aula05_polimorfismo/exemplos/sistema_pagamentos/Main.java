package com.senai.aula05_polimorfismo.exemplos.sistema_pagamentos;

import java.util.ArrayList;
import java.util.List;

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

        List<Pagamento> listaDePagamentos = new ArrayList<>();
        listaDePagamentos.add(new CLT("Eric", 0));
        listaDePagamentos.add(new PJ("Gabriel", 220, 50));
        listaDePagamentos.add(new Freelancer("Igor", 300000));

        listaDePagamentos.stream().forEach(p -> System.out.println(p.getNome()+":"+p.calcularPagamento()));
    }

}
