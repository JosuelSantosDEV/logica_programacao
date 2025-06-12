package com.example.atividade_03;

import com.example.utils.Leitor;

import java.util.Locale;

public class At_03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        classificarTemperaturaCorporal(Leitor.lerDouble("Informe a temperatura do paciente: "));
    }

    public static void classificarTemperaturaCorporal(double temp){
        if(temp == 40.0){
            System.out.println("Febre alta");
        } else if(temp >= 38.6 && temp <= 39.9) {
            System.out.println("Febre moderada");
        } else if(temp >= 37.5 && temp <= 38.5) {
            System.out.println("Febre leve");
        } else if(temp >= 36.0 && temp <= 37.4) {
            System.out.println("Temperatura Normal");
        } else if(temp < 36.0) {
            System.out.println("Hipotermia");
        } else {
            System.out.println("Temperatura inválida");
        }
    }

}
