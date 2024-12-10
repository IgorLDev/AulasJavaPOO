package com.senai.aula02_colecoes_em_java.produto;

import java.util.Objects;

public class Produto {
    String nomeProduto;
    int estoque;

    public Produto(String produto, int estoque) {
        this.nomeProduto = produto;
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Produto: " + nomeProduto +
                " | Quantidade: " + estoque;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(nomeProduto, produto.nomeProduto);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nomeProduto);
    }
}
