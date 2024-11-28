package com.senai.aula01_classe_atributo_metodos.pessoa;

public class Endereco {
    String rua;
    String bairro;
    String cidade;
    int numero;
    int cep;

    public Endereco(String rua, String bairro, String cidade, int numero, int cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = numero;
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", numero=" + numero +
                ", cep=" + cep +
                '}';
    }
}



