package com.example.atividade_guiada;

import java.util.Scanner;

public class Resolucao {
    public static void main(String[] args) {

        classificar(ler());

    }

    private static int ler(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a idade: ");
        return scanner.nextInt();
    }
    private static void classificar(int idade){
        if(idade < 18){
            System.out.println("Menor de idade!");
        } else if(idade >= 18 && idade < 60){
            System.out.println("Adulto!");
        } else if (idade >= 60 && idade < 120) {
            System.out.println("Idoso!");
        } else {
            System.out.println("Desconheço essa criatura!!!");
        }
    }
}
