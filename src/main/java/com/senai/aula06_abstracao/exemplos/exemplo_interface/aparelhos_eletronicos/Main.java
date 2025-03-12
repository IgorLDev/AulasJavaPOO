package com.senai.aula06_abstracao.exemplos.exemplo_interface.aparelhos_eletronicos;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------Testando TV-------------------------");
        ligarEDesligarAparelhos(new Televisao());
        System.out.println("------------------------------------------------------------------");

        System.out.println("\n-----------------------------Testando PC-------------------------");
        ligarEDesligarAparelhos(new Computador());
        System.out.println("------------------------------------------------------------------");
    }

    public static void ligarEDesligarAparelhos(AparelhoEletronico aparelhoEletronico){
        aparelhoEletronico.ligar();
        aparelhoEletronico.desligar();
    }

}
