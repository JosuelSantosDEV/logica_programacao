package com.example.atividade_05;

import com.example.utils.Leitor;

public class At_05 {

    public static void main(String[] args) {
        int idade = Leitor.lerInt("Informe a idade do paciente: ");
        int plano = Leitor.lerInt("Informe o tipo de plano( 1 - Convenio 2 - Particular): ");
        System.out.println("Informe a especialidade desejada: ");
        System.out.println("1 - Clinico geral");
        System.out.println("2 - Pediatria");
        System.out.println("3 - Cardiologia");
        System.out.println("4 - Ortopedia");
        int especialidade = Leitor.lerInt("Opção: ");
        classificarIdade(idade);
        System.out.print("Especialidade: ");
        selecionarEspecialidade(especialidade);
        selecionarTaxa(plano, idade);
    }

    private static void classificarIdade(int idade){
        if(idade >= 65 ){
            System.out.println("Atendimento prioritário (Idoso)");
        } else if (idade < 12) {
            System.out.println("Atendimento prioritário (Criança)");
        } else {
            System.out.println("Atendimento comum");
        }
    }

    private static void selecionarTaxa(int plano, int idade){
        if(idade > 65 && plano == 1 ){
            System.out.println("Isento de taxa de consulta");
        } else if (idade <= 60 && plano == 1) {
            System.out.println("ATaxa reduzida: R$40,00");
        } else if (plano == 2) {
            System.out.println("Taxa integral: R$100,00");
        }
    }
    private static void selecionarEspecialidade(int esp){
        switch (esp){
            case 1 :
                System.out.println("Clinico geral");
                break;
            case 2 :
                System.out.println("Pediatria");
                break;
            case 3 :
                System.out.println("Cardiologia");
                break;
            case 4 :
                System.out.println("Ortopedia");
                break;
            default:
                System.out.println("Especialidade inválida");
                break;
        }
    }

}
