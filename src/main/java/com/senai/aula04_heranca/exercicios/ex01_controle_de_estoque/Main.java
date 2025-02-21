package com.senai.aula04_heranca.exercicios.ex01_controle_de_estoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int userEscolha;

    public static void main(String[] args) {

        List<Produto> listaDeProdutos = new ArrayList<>();

        Alimentos alimentos1 = new Alimentos("Arroz", 34.00, 11, "01/08/2026");
        Eletronico eletronico1 = new Eletronico("Computador", 3500, 8, 220);

        alimentos1.exibirInfos();
        System.out.println();
        eletronico1.exibirInfos();


        String menu = """
                -------------- menu --------------
                    1. Cadastrar
                    2. Atualizar
                    3. Deletar
                    4. Exibir
                    5. Sair
                ----------------------------------
                """;

        userEscolha = scanner.nextInt();
        switch (userEscolha) {
            case 1:
                System.out.println("1. Cadastrar");
                break;
            case 2:
                System.out.println("2. Atualizar");
                break;
            case 3:
                System.out.println("3. Deletar");
                break;
            case 4:
                System.out.println("4. Exibir");
                break;
            case 5:
                System.out.println("5. Sair");
                break;
            default:
                System.out.println("Opção inválida, digite um número válido.");
        }
    }

    public static void cadastrarProduto() {
        Scanner scanner = new Scanner(System.in);
        int userEscolha = scanner.nextInt();

        System.out.println("Digite a quantidade de produtos que deseja cadastrar: ");

    }

}
