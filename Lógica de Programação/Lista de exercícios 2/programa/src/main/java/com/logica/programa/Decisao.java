package com.logica.programa;

import java.util.Scanner;

public class Decisao {

    Scanner leia = new Scanner(System.in);

    void exercicio1() {
        int num;
        System.out.println("\n Exercício 1");
        System.out.println("Informe um número:");
        num = leia.nextInt();

        if (num % 2 == 0) {
            System.out.println("Este número é par.");

        } else {
            System.out.println("Este número é ímpar.");
        }

    }

    void exercicio2() {
        int num1;
        int num2;

        System.out.println("\n Exercício 2");
        System.out.println("Informe o primeiro número:");
        num1 = leia.nextInt();
        System.out.println("Informe o segundo número:");
        num2 = leia.nextInt();

        if (num1 > num2) {
            System.out.println("O número " + num1 + " é maior que " + num2);

        } else if (num1 == num2) {
            System.out.println("Os números digitados são iguais.");
        } else {
            System.out.println("O número " + num2 + " é maior que " + num1);
        }

    }

    void exercicio3() {
        int idade;
        String gestante;
        String deficiente;

        System.out.println("\n Exercício 3");
        System.out.println("Informe sua idade:");
        idade = leia.nextInt();
        if (idade >= 65) {
            System.out.println("Por favor dirija-se a fila preferencial.");
        } else {
            System.out.println("É gestante? (Digite s ou n?)");
            gestante = leia.nextLine();
            if (gestante.equals("s")) {
                System.out.println("Por favor dirija-se a fila preferencial.");

            } else {
                System.out.println("Possui alguma deficiência? (Digite s ou n)");
                deficiente = leia.nextLine();
                if (deficiente.equals("s")) {
                    System.out.println("Por favor dirija-se a fila preferencial.");
                } else {
                    System.out.println("Por favor dirija-se a fila comum.");
                }

            }

        }

    }

    void exercicio4() {
        int idade;

        System.out.println("\n Exercício 4");
        System.out.println("Informe sua idade:");
        idade = leia.nextInt();

        if (idade >= 16 && idade < 18) {
            System.out.println("Entrada permitida somente acompanhado de um responsável.");
        } else if (idade < 16) {
            System.out.println("Entrada não permitida.");
        } else {
            System.out.println("Entrada liberada");
        }

    }

    void exercicio5() {

        String login = "Danielle";
        int senha = 1234;
        String loginDigitado;
        int senhaDigitada;


        System.out.println("\n Exercício 5");
        System.out.println("Informe seu login:");
        loginDigitado = leia.nextLine();
        System.out.println("Digite sua senha: ");
        senhaDigitada = leia.nextInt();

        
        if (loginDigitado.equals(login) && senhaDigitada == senha) {
            System.out.println("Olá, " + login + ", seja bem vinda.");

        } else if (!loginDigitado.equals(login) && senhaDigitada != senha) {
            System.out.println("Acesso Negado");
            System.out.println("Tanto o login, quanto a senha estão incorretos");

        } else {
            System.out.println("Acesso Negado");
            if (senhaDigitada != senha) {
                System.out.println("Senha Incorreta");
            } else {
                System.out.println(" Login Incorreto.");

            }
        }
    }

}
