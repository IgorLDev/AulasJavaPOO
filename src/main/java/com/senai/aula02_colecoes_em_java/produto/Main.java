package com.senai.aula02_colecoes_em_java.produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Produto> listaProduto = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int userEscolha;
        String nomeProduto;

        String menu = """
                
                   --- Controle de Estoque ---
                  1. Cadastrar Produto
                  2. Listar Produtos
                  3. Atualizar Quantidade
                  4. Remover Produto
                  5. Buscar Produto
                  6. Sair
                 -------------------------------
                """;

        do {
            System.out.println(menu);
            System.out.println("Escolha uma opção: ");
            userEscolha = scanner.nextInt();
            scanner.nextLine();

            switch (userEscolha) {
                case 1:
                    cadastrarProduto();
                    break;

                case 2:
                    exibirProdutos();
                    break;

                case 3:
                    exibirProdutos();
                    atualizarQuantidade();
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (userEscolha != 6);
    }

    public static void cadastrarProduto() {
        String nomeProduto;
        int userEscolha;

        System.out.println("Digite o nome do produto: ");
        nomeProduto = scanner.nextLine();
        System.out.println("Digite a quantidade: ");
        userEscolha = scanner.nextInt();
        listaProduto.add(new Produto(nomeProduto, userEscolha));
        System.out.println("Produto cadastrado com sucesso!");
    }

    public static void exibirProdutos() {
        for (Produto produto : listaProduto) {
            System.out.println((listaProduto.indexOf(produto) + 1) + " - " + produto);
        }
    }

    public static void atualizarQuantidade() {
        String nomeProduto;
        int userEscolha;

        System.out.println("Digite o nome do produto para atualizar: ");
        nomeProduto = scanner.nextLine();
        System.out.println("Digite a nova quantidade: ");
        userEscolha = scanner.nextInt();
        System.out.println("Quantidade atualizada com sucesso!");



    }

}
