package com.senai.aula04_heranca.exercicios.ex05_sistema_de_bibliotecas;

public class LivroFisico extends Livro {
    private int numPaginas;

    public LivroFisico(String tituloLivro, String autor, int numPaginas) {
        super(tituloLivro, autor);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void exibirInfos() {
        super.exibirInfos();
        System.out.println("Número de Páginas: " + numPaginas);
    }
}
