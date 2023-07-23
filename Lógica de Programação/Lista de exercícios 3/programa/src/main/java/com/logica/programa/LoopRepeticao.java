package com.logica.programa;

import java.util.Scanner;

public class LoopRepeticao {
    Scanner leia = new Scanner(System.in);

    
    void exercicio1(){
        int num;
        System.out.println("Informe o número de segundos deseja contar entre 1 e 59:");
        num = leia.nextInt();
        if (num >= 1 && num <=59) {
            int contar = 0;
           while (contar <= num){
            System.out.println(contar);
            contar ++;
           }
        } else {
            System.out.println("Número digitado é inválido");
        }
    }

    void exercicio2(){
        int num;
        System.out.println("Informe o múmero a ser multiplicado:");
        num = leia.nextInt();
      
    }

    void exercicio3(){

    }

    void exercicio4(){

    }

    void exercicio5(){

    }
    
}
