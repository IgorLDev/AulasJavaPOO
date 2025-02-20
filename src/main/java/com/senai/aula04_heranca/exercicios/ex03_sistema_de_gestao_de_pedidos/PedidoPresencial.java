package com.senai.aula04_heranca.exercicios.ex03_sistema_de_gestao_de_pedidos;

public class PedidoPresencial extends Pedido {
    private float desconto;

    public PedidoPresencial(int numPedido, double valorTotal, float desconto) {
        super(numPedido, valorTotal);
        this.desconto = desconto;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("\nDireito á: " + desconto + "%");
    }
}
