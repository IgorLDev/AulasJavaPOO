package com.senai.aula06_abstracao.exemplos.classe_abstrata.conta_bancaria;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    void aplicarTaxaMensal() {
        saldo += saldo*0.5;

    }
}
