package com.senai.aula04_heranca.exercicios.ex05_sistema_de_bibliotecas;

public class LivroDigital extends Livro {
    private int tamanhoArquivo;

    public LivroDigital(String tituloLivro, String autor, int tamanhoArquivo) {
        super(tituloLivro, autor);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public int getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(int tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public void exibirInfos(){
        super.exibirInfos();
        System.out.println("Tamanho do arquivo: " + tamanhoArquivo + "MB");
    }
}
