package com.logica.programa;

import java.util.Scanner;

public class LoopRepeticao {
    Scanner leia = new Scanner(System.in);
    Scanner leia2 = new Scanner(System.in);

    void exercicio1() {
        int num;
        System.out.println("Informe o número de segundos deseja contar entre 1 e 59:");
        num = leia.nextInt();
        if (num >= 1 && num <= 59) {
            int contar = 0;
            while (contar <= num) {
                System.out.println(contar);
                contar++;
            }
        } else {
            System.out.println("Número digitado é inválido");
        }
    }

    void exercicio2() {
        int num;
        System.out.println("Informe o múmero a ser multiplicado:");
        num = leia.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " X " + num + " = " + i * num);
        }
    }

    void exercicio3() {
        int num1;
        int num2;

        System.out.println("Informe primeiro número:");
        num1 = leia.nextInt();
        System.out.println("Informe o segundo número:");
        num2 = leia.nextInt();
        System.out.println("Os números pares entre " + num1 + " e " + num2 + " são:");

        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " - ");

            }
        }

    }

    void exercicio4() {
        int convidados;
        int idade;
        int i = 1;

        System.out.println("Informe a quantidade de convidados que você trouxe:");
        convidados = leia.nextInt();

        while (i <= convidados) {
            System.out.println("Informe a idade do convidado " + i + " :");
            idade = leia2.nextInt();

            if (idade >= 16 && idade < 18) {
                System.out.println("Entrada permitida somente acompanhado de um responsável.");
            } else if (idade < 16) {
                System.out.println("Entrada não permitida.");
            } else {
                System.out.println("Entrada liberada");
            }
            i++;
        }

    }

    void exercicio5() {
        String login = "Danielle";
        int senha = 1234;
        String loginDigitado;
        int senhaDigitada;
        int i = 2;

        System.out.println("\n Exercício 5");
        System.out.println("Informe seu login:");
        loginDigitado = leia.nextLine();
        System.out.println("Digite sua senha: ");
        senhaDigitada = leia2.nextInt();

        if (loginDigitado.equals(login) && senhaDigitada == senha) {
            System.out.println("Olá, " + login + ", seja bem vinda.");
        } else {

            while (i <= 3) {
                if (!loginDigitado.equals(login) && senhaDigitada != senha) {
                    System.out.println("Tanto o login, quanto a senha estão incorretos");

                } else if (senhaDigitada != senha) {
                    System.out.println("Senha Incorreta\n");
                } else if (!loginDigitado.equals(login)) {
                    System.out.println(" Login Incorreto.\n");

                }

                i++;
            
                System.out.println("Tente novamente:\n");

                System.out.println("Informe seu login:");
                loginDigitado = leia.nextLine();
                System.out.println("Digite sua senha: ");
                senhaDigitada = leia2.nextInt();

                

                if (i == 3) {
                    System.out.println("\n ATENÇÃO!");
                    System.out.println("Está é sua última tentativa. \n");

                }

            }
        }
    }
}
