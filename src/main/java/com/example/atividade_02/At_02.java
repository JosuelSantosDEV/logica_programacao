package com.example.atividade_02;

import com.example.utils.Leitor;

import java.util.Locale;

public class At_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        classificarFuncionario(Leitor.lerDouble("Informe a nota do funcionário: "));
    }

    public static void classificarFuncionario(double nota){
        if(nota <= 10.0 && nota >= 9.0){
            System.out.println("Funcionário Excelente");
        } else if(nota >= 7.0 && nota <= 8.9){
            System.out.println("Funcionário Bom");
        } else if(nota >= 5.0 && nota <= 6.9){
            System.out.println("Funcionário Regular");
        } else if(nota < 5.0){
            System.out.println("Funcionário Insatisfatório");
        } else {
            System.out.println("Nota inválida");
        }
    }
}
