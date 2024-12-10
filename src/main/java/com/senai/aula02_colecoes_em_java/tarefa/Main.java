package com.senai.aula02_colecoes_em_java.tarefa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Tarefa> listaTarefas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int userEscolha;
        String nomeTarefa;

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
                    listaTarefas.add(new Tarefa(nomeTarefa, false));
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case 2:
                    exibirTarefas();
                    break;

                case 3:
                    exibirTarefas();
                    System.out.println("Digite o número da tarefa para marcar como concluída: ");
                    listaTarefas.get(scanner.nextInt()-1).status = true;
                    System.out.println("Tarefa marcada como concluída.");
                    break;

                case 4:
                    exibirTarefas();
                    System.out.println("Digite o número da tarefa que deseja excluir: ");
                    listaTarefas.remove(scanner.nextInt()-1);
                    System.out.println("Tarefa excluída com sucesso.");
                    break;
                case 5:
                    System.out.println("Fim do Programa.");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (userEscolha != 5);
    }
    public static void exibirTarefas(){
        for (Tarefa tarefa : listaTarefas){
            System.out.println((listaTarefas.indexOf(tarefa)+1) + " - " + tarefa);
        }
    }
}