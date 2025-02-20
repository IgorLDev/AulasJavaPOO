package com.senai.aula04_heranca.exercicios.ex03_sistema_de_gestao_de_pedidos;

public class PedidoOnline extends Pedido {
    private float taxaEntrega;

    public PedidoOnline(int numPedido, double valorTotal, float taxaEntrega) {
        super(numPedido, valorTotal);
        this.taxaEntrega = taxaEntrega;
    }

    public float getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(float taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    public void exibirInfo(){
        super.exibirInfo();
        System.out.printf("\nTaxa de entrega: R$" + taxaEntrega);
    }
}
