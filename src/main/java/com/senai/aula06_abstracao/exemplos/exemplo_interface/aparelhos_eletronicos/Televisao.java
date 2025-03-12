package com.senai.aula06_abstracao.exemplos.exemplo_interface.aparelhos_eletronicos;

public class Televisao implements AparelhoEletronico {
    @Override
    public void ligar() {
        System.out.println("TV Ligada");
    }

    @Override
    public void desligar() {
        System.out.println("TV Desligada");
    }
}
