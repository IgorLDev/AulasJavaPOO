package com.senai.aula04_heranca.exercicios.ex03_sistema_de_gestao_de_pedidos;

public class Pedido {
    private int numPedido;
    private double valorTotal;

    public Pedido(int numPedido, double valorTotal) {
        this.numPedido = numPedido;
        this.valorTotal = valorTotal;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

   public void exibirInfo(){
       System.out.printf("Número do Pedido: " + numPedido + "\nValor Total: R$" + valorTotal);

    }
}
