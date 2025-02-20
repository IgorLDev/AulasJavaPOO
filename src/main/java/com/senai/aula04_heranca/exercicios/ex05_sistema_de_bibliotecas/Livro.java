package com.senai.aula04_heranca.exercicios.ex05_sistema_de_bibliotecas;

public class Livro {
    private String tituloLivro;
    private String autor;

    public Livro(String tituloLivro, String autor) {
        this.tituloLivro = tituloLivro;
        this.autor = autor;
    }

    public String getTitulo() {
        return tituloLivro;
    }

    public void setTitulo(String titulo) {
        this.tituloLivro = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirInfos() {
        System.out.println("Título do Livro: " + tituloLivro + "\nAutor: " + autor);
    }
}
