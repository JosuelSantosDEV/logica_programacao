package com.example.atividade_01;

import com.example.utils.Leitor;

import java.util.Scanner;

public class At_01 {

    public static void main(String[] args) {
        classificarNota(Leitor.lerInt("Informe a nota: "));
    }

    public static void classificarNota(int nota){
        if(nota <= 100 && nota >= 90){
            System.out.println("Conceito: A");
        } else if(nota >= 80 && nota <= 89){
            System.out.println("Conceito: B");
        } else if(nota >= 70 && nota <= 79){
            System.out.println("Conceito: C");
        } else if(nota >= 60 && nota <= 69){
            System.out.println("Conceito: D");
        } else if(nota < 60){
            System.out.println("Conceito: F");
        }else {
            System.out.println("Nota inválida");
        }
    }

}
