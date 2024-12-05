package com.senai.aula02_colecoes_em_java.tarefa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userEscolha;
        String nomeTarefa = "";

        ArrayList<Tarefas> listaTarefas = new ArrayList<>();

        String menu = """
                   --- Gerenciador de Tarefas ---
                  1. Adicionar Tarefa
                  2. Listar Tarefas
                  3. Marcar Tarefa como Concluída
                  4. Remover Tarefa
                  5. Sair
                  --------------------------------
                """;
        do {
            System.out.println(menu);

            System.out.print("Escolha uma opção: ");
            userEscolha = scanner.nextInt();
            scanner.nextLine();

            switch (userEscolha) {
                case 1:
                    System.out.println("Digite o nome da tarefa: ");
                    nomeTarefa = scanner.nextLine();
                    listaTarefas.add(new Tarefas(nomeTarefa, false));
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case 2:
                    System.out.println("Lista de Tarefas: ");
                    for (Tarefas tarefa : listaTarefas){
                        System.out.println(listaTarefas.indexOf(tarefa));
                    }
                    break;

                case 3:
                    System.out.println("Digite o número da tarefa para marcar como concluída: ");
                    userEscolha = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Tarefa '" + nomeTarefa + "' marcada como concluída.");
                    break;

                case 4:
                    System.out.println("Digite o número da tarefa que deseja excluir: ");
                    userEscolha = scanner.nextInt();
            }
        } while (userEscolha < 0 || userEscolha > 5) ;
    }
}