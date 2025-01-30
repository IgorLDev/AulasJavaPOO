package com.senai.aula03_encapsulamento.exemplos.conta_bancaria;

public class ContaBancaria {
    private int numeroDaConta;
    private double saldo;
    private Usuario usuario;
    private String banco;
    private String tipo;

    public ContaBancaria(int numeroDaConta, double saldo, Usuario usuario, String banco, String tipo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.usuario = usuario;
        this.banco = banco;
        this.tipo = tipo;
    }

    public double getSaldo() {
        System.out.println("Saldo: o cliente " + this.usuario.getNome() + " tem saldo de R$" + saldo + "\n");
        return saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void sacar(double qtdASacar){
        if (qtdASacar >= 0 && qtdASacar <= saldo) {
            saldo -= qtdASacar;
            System.out.println("Saque de R$" + qtdASacar + " foi sacado da conta do Usuário.\nUsuário: " + this.usuario.getNome() + "\nSaldo atual: R$" + saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double qtdADepositar){
        if (qtdADepositar > 0) {
        saldo += qtdADepositar;
            System.out.println("Depósito de R$" + qtdADepositar + " foi depósitado na conta do Usuário.\nUsuário: " + this.usuario.getNome() + "\nSaldo atual: R$" + saldo + "\n");
        } else {
            System.out.println("Depósito insuficiente.");
        }
    }

    public void transferir(double qtdATransferir, ContaBancaria contaDestino){
        System.out.println("---------------------------------------------------");
        System.out.println("Transferência:\n");
        contaDestino.depositar(qtdATransferir);
        System.out.println("---------------------------------------------------");
        this.sacar(qtdATransferir);


    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroDaConta=" + numeroDaConta +
                ", saldo=" + saldo +
                ", usuario=" + usuario +
                ", banco='" + banco + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
