package com.logica.programa;

import java.text.DecimalFormat;
import java.util.Scanner;
//import java.text.DecimalFormat;

public class Programa {
    Scanner leia = new Scanner(System.in);

    void exercicio1(){

        int num1;
        int num2;
        int resultado;

        System.out.println(" \n Exercício 1");
        System.out.println("Informe o primeiro número:");
        num1 = leia.nextInt();

        System.out.println("Informe o segundo número:");
        num2 = leia.nextInt();
        resultado = num1 + num2;

        System.out.println("O resultado da soma é: " + resultado);
    }

    void exercicio2(){
        String nome;
        String sobrenome;

        System.out.println(" \n Exercício 2");
        System.out.println("Informe seu nome:");
        nome = leia.nextLine();
        System.out.println("Informe seu sobrenome:");
        sobrenome = leia.nextLine();

        System.out.println("Olá, " + nome + " " + sobrenome);
    }

    void exercicio3(){
        double valorReal;
        double cotacao = 4.95;
        double valorDolar;

        System.out.println(" \n Exercício 3");
        System.out.print("Informe o valor a ser convertido: R$ ");
        valorReal = leia.nextDouble();
        valorDolar = valorReal/cotacao;
        System.out.println("O valor convertido em dólar é de: $ " + new DecimalFormat("#,##0.00").format(valorDolar) );
        
    }

    void exercicio4(){
        int num;
        int antecessor;
        int sucessor;
        
        System.out.println(" \n Exercício 4");
        System.out.print("Informe um número: ");
        num = leia.nextInt();
        antecessor = num - 1;
        sucessor = num + 1;

        System.out.println("O antecessor é " + antecessor + " e o sucessor é " + sucessor);

    }

    void exercicio5(){
        double area;
        double valorMetro;
        double valorTerreno;

        System.out.println(" \n Exercício 5");
        System.out.println("Informe a área do terreno:");
        area = leia.nextDouble();
        System.out.print("Informe o valor por metro quadrado: R$ ");
        valorMetro = leia.nextDouble();
        valorTerreno = valorMetro * area;
        System.out.println("O valor total do terreno é de: R$ " + new DecimalFormat("#,##0.00").format(valorTerreno) );
        
    }

    void exercicio6(){
        double km;
        double litros;
        double resultado;

        System.out.println(" \n Exercício 6");
        System.out.println("Informe quantos quilômetros foram percorridos:");
        km = leia.nextDouble();
        System.out.println("Informe quantos litros de combustível foram consumidos:");
        litros = leia.nextDouble();
        resultado = km/litros;
        System.out.println("Seu veículo percorre " + new DecimalFormat("#,##0.00").format(resultado) + "km/l" );

    }

    void exercicioExtra(){
        double num1;
        double num2;
        String operacao;
        double resultado = 0;

        System.out.println("Informe o primeiro número:");
        num1 = leia.nextDouble();
        System.out.println("Informe o segundo número:");
        num2 = leia.nextDouble();
        System.out.println("Informe a operaçaõ (+ - * /):");
        operacao = leia.next();

        switch (operacao) {
            case "+":
                resultado = num1+num2;
                break;
            case "-":
                resultado = num1-num2;
                break;
            case "*":
                resultado = num1*num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1/num2;
                } else {
                    System.out.println("Divisão por zero é inválida");
                }
                
                break;
            
        
            default:
            System.out.println("Operação Inválida");
                break;
        }

        System.out.println("O resultado é: " + resultado);
    }

}
