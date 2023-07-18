package com.logica.programa;

import java.util.Scanner;

public class Decisao {

    Scanner leia = new Scanner(System.in);

    void exercicio1(){
        int num;
        System.out.println("Informe um número:");
        num = leia.nextInt();

        if (num%2 == 0) {
            System.out.println("Este número é par.");
            
        } else {
            System.out.println("Este número é ímpar.");
        }

    }
    
}
