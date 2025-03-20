package com.senai.aula06_abstracao.exemplos.exemplo_interface.controlador_equipamento_inteligente;

public class Main {
    public static void main(String[] args) {

        AparelhoInteligente.mensagemBemVindo();

        testeAparelhos(new LampadaInteligente());
        testeAparelhos(new TvSmart());

    }

    private static void testeAparelhos(AparelhoInteligente aparelhoInteligente){
        System.out.println("------- Teste Aparelhos -------");

        aparelhoInteligente.ligar();
        if (aparelhoInteligente instanceof TvSmart tvSmart){
            tvSmart.aumentarVolume();
            tvSmart.aumentarVolume();
            tvSmart.baixarVolume();
            tvSmart.baixarVolume();
            tvSmart.aumentarVolume();
        } else if (aparelhoInteligente instanceof LampadaInteligente lampada) {
            lampada.aumentarBrilho();
            lampada.aumentarBrilho();
            lampada.baixarBrilho();
            lampada.aumentarBrilho();
            lampada.aumentarBrilho();
        }
        aparelhoInteligente.desligar();
    }
}
