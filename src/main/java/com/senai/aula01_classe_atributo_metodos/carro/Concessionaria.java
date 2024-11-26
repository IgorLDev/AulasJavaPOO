package com.senai.aula01_classe_atributo_metodos.carro;

public class Concessionaria {
    public static void main(String[] args) {
        Carro carro1 = new Carro(
                "Ferrari",
                "City",
                "Preto",
                120000,
                2.0,
                (byte) 4,
                2014);

        System.out.println("Carro 1");
        carro1.verificarInformacoes();
        System.out.println();

        carro1.ligarCarro();
        carro1.buzinar();
        carro1.testarSom();
        carro1.consultarPreco(2024);

        System.out.println();

        Carro carro2 = new Carro(
                "Mustang",
                "Sports",
                "Vermelho",
                230000,
                2.4,
                (byte) 4,
                2020);

        System.out.println("Carro 2");
        carro2.verificarInformacoes();
        System.out.println();

        carro2.ligarCarro();
        carro2.buzinar();
        carro2.testarSom();
        carro2.consultarPreco(2024);

        System.out.println();

        Carro carro3 = new Carro(
                "Mustang",
                "Sports",
                "Vermelho",
                230000,
                2.4,
                (byte) 4,
                2020);

        System.out.println("Carro 3");
        carro3.verificarInformacoes();
        System.out.println();

        carro3.ligarCarro();
        carro3.buzinar();
        carro3.testarSom();
        carro3.consultarPreco(2024);

        System.out.println();

        System.out.println("carro1 | " + carro1);
        System.out.println("carro2 | " + carro2);

        System.out.println();

        carro1 = carro2;
        System.out.println("carro1 | " + carro1);

        // carro1.modelo = "corona";
        System.out.println(carro3.modelo);

        System.out.println();

        String texto = "teste";
        System.out.println(texto);

        System.out.println(carro2.equals(carro3));

    }
}
