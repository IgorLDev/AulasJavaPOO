package com.senai.aula06_abstracao.exemplos.classe_abstrata.conta_bancaria;

public class Main {
    public static void main(String[] args) {
        testeContas(new ContaCorrente("Gabriel",520));
        testeContas(new ContaPoupanca("Igor", 99990));
    }
    private static void testeContas(Conta conta){
        System.out.println("----------teste conta-----------");
        System.out.println("antes");
        conta.exibirSaldo();
        conta.aplicarTaxaMensal();
        System.out.println("depois");
        conta.exibirSaldo();
    }
}
