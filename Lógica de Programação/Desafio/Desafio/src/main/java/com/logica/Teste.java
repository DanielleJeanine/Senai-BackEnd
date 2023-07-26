package com.logica;

import java.util.Scanner;

public class Teste {
    Scanner sc = new Scanner(System.in);
    String alunos[] = new String[50];
    Double[][] notas;
    int quantidadeDeAlunos = 0;

    void menu(){
        int opcao = 0;
        while(opcao != 5){
            System.out.println("\n Menu Principal");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Excluir aluno");
            System.out.println("3 - Inserir nota do aluno");
            System.out.println("4 - Imprimir lista de alunos");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    System.out.println("Excluir Aluno");
                    break;
                case 3:
                    System.out.println("Inserir nota do aluno");
                    break;
                case 4:
                    System.out.println("Imprimir Lista de Alunos");
                    break;
                case 5:
                    System.out.println("Saindo do Sistema");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
    }

    void cadastrarAluno(){
        String nome;
        System.out.println("Digite o nome do aluno");
        nome = sc.nextLine();

        alunos[quantidadeDeAlunos] = nome;
        quantidadeDeAlunos++;

        System.out.println("Aluno Cadastrado");

    }

}
