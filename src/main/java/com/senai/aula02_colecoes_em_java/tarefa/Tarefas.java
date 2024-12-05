package com.senai.aula02_colecoes_em_java.tarefa;

public class Tarefas {
    String nomeTarefa;
    boolean status;

    public Tarefas(String nomeTarefa, boolean status) {
        this.nomeTarefa = nomeTarefa;
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("%s - [%s]", nomeTarefa, status ? "Concluída":"Pendente");
    }
}
