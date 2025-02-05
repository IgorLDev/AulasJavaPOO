package com.senai.aula03_encapsulamento.exercicios.ContaBancáriaComOperaçõesSimples;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        System.out.println("Saldo: o cliente " + this.titular + " tem saldo de R$" + saldo + "\n");
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double qtdDepositar) {
        if (qtdDepositar > 0) {
            saldo+= qtdDepositar;
            System.out.println("Saldo a ser depositado: R$" + qtdDepositar + "\nSaldo atual: R$" + saldo);
        } else {
            System.out.println("Usuário, digite um valor válido.");
        }
        return qtdDepositar;
    }

    public double sacar(double qtdSacar) {
        if (qtdSacar >= 0 && qtdSacar <= saldo) {
            saldo-=qtdSacar;
            System.out.println("Saque de R$" + qtdSacar + " foi sacado da conta do Usuário.\nUsuário: " + this.titular + "\nSaldo atual: R$" + saldo + "\n");
        } else {
            System.out.println("Usuário, digite um valor válido.");
        }
        return qtdSacar;
    }


}
