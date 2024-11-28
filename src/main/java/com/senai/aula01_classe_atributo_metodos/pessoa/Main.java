package com.senai.aula01_classe_atributo_metodos.pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco(
                "Catanduva",
                "Baeta Neves",
                "SBC",
                44,
                12345123);

        Pessoa pessoa1 = new Pessoa(
                "Igor",
                21,
                new Endereco(
                        "Izildinha",
                        "Batatanduva",
                        "SP",
                        71,
                        12345678
                )
        );

        Pessoa pessoa2 = new Pessoa(
                "Gabiel",
                17,
                new Endereco(
                        "Izildinha",
                        "Batatanduva",
                        "SP",
                        71,
                        12345678
                )
        );

        Pessoa pessoa3 = new Pessoa(
                "Eric",
                89,
                new Endereco(
                        "izildinhA",
                        "batatanduvA",
                        "sp",
                        64,
                        1472582
                )
        );

        Pessoa[] pessoas = new Pessoa[3];

        pessoas[0] = pessoa1;
        pessoas[1] = pessoa2;
        pessoas[2] = pessoa3;

        for (Pessoa pessoa: pessoas){
            //System.out.println(pessoa);
        }

        ArrayList pessoasList = new ArrayList<>();

        pessoasList.add(pessoa1 + "\n");
        pessoasList.add(pessoa2 + "\n");
        pessoasList.add(pessoa3 + "\n");
        pessoasList.add("teste");
        pessoasList.add(new Pessoa("Joao",24,endereco1) + "\n");


        System.out.println(pessoasList.get(2));
        pessoasList.remove(2);
        System.out.println(pessoasList.get(2));

        System.out.println(pessoasList.indexOf("teste"));

       // System.out.println(pessoa1.endereco.rua);

        pessoa1.falar();
    }
}
