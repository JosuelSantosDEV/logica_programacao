package com.example.atividade_04;

import com.example.utils.Leitor;

import java.util.Locale;

public class At_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        selecionarDepartamentoPeloDia(Leitor.lerInt("Informe o dia(1 à 7): "));
    }

    public static void selecionarDepartamentoPeloDia(int dia){
        switch (dia){
            case 1:
                System.out.println("Atendimento geral");
                break;
            case 2:
                System.out.println("Suporte tecnico");
                break;
            case 3:
                System.out.println("Financeiro");
                break;
            case 4:
                System.out.println("Recursos humanos");
                break;
            case 5:
                System.out.println("Vendas");
                break;
            case 6:
                System.out.println("Marketing");
                break;
            case 7:
                System.out.println("Fechado (Fim de semana)");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
