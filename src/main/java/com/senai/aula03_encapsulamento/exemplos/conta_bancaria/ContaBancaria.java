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
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
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

    public double sacar(){
        return 0.0;
    }

    public void depositar(double valor){

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
