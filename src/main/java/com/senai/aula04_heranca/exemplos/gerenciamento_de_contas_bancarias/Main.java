package com.senai.aula04_heranca.exemplos.gerenciamento_de_contas_bancarias;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Igor", 2000, 500);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Gabriel", 1000, 0.2);

        System.out.println(contaCorrente.getSaldo());
        contaCorrente.sacar(100);
        System.out.println(contaCorrente.getSaldo());

        System.out.println(contaPoupanca.getSaldo());
        contaPoupanca.aplicarRendimento();
        System.out.println(contaPoupanca.getSaldo());
    }
}
