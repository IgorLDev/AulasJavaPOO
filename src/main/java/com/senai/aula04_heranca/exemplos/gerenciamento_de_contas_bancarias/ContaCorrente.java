package com.senai.aula04_heranca.exemplos.gerenciamento_de_contas_bancarias;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= (super.getSaldo() + limite)) {
            super.setSaldo(getSaldo()-valor);
        } else {
            System.out.println("Saldo e limite insuficientes.");
        }
    }
}
