package br.ufpb.dcx.nailton.gui;
import br.ufpb.dcx.nailton.academia.SistemaMarombaFitnessRioTinto;
import br.ufpb.dcx.nailton.academia.treino.ExercicioJaExisteExeption;
import br.ufpb.dcx.nailton.academia.treino.ParteDoCorpo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdicionaExercicios {
    public static void main(String[] args) {
        SistemaMarombaFitnessRioTinto sistema = new SistemaMarombaFitnessRioTinto();
        Scanner scanner = new Scanner(System.in);

        // Recupera os dados ao iniciar
        try {
            sistema.recuperarDados();
            System.out.println("Dados recuperados com sucesso!");
        } catch (IOException e) {
            System.out.println("Nenhum dado encontrado, iniciando um novo sistema.");
        }

        // Loop para cadastrar exercícios
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar exercício");
            System.out.println("2. Sair e salvar dados");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            if (opcao == 1) {
                System.out.print("Digite o nome do exercício: ");
                String nome = scanner.nextLine();

                System.out.print("Digite a descrição do exercício: ");
                String descricao = scanner.nextLine();

                System.out.print("Digite os músculos envolvidos (separados por vírgula, por exemplo: PEITO, OMBRO): ");
                String[] musculosInput = scanner.nextLine().split(",");
                List<ParteDoCorpo> musculos = new ArrayList<>();

                for (String musculo : musculosInput) {
                    try {
                        musculos.add(ParteDoCorpo.valueOf(musculo.trim().toUpperCase()));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Músculo inválido: " + musculo.trim() + ". Ignorando.");
                    }
                }

                try {
                    sistema.adicionaExercicio(nome, descricao, musculos);
                    System.out.println("Exercício cadastrado com sucesso!");
                } catch (ExercicioJaExisteExeption e) {
                    System.out.println(e.getMessage());
                }
            } else if (opcao == 2) {
                // Salvar dados antes de sair
                try {
                    sistema.salvarDados();
                    System.out.println("Dados salvos com sucesso!");
                } catch (IOException e) {
                    System.out.println("Erro ao salvar os dados: " + e.getMessage());
                }
                break;
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }

        scanner.close();
    }
}