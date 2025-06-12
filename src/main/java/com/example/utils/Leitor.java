package com.example.utils;

import java.util.Scanner;

public class Leitor {
    private static final Scanner scanner = new Scanner(System.in);
    public static int lerInt(String msg){
        System.out.println(msg);
        return scanner.nextInt();
    }

    public static double lerDouble(String msg){
        System.out.println(msg);
        return scanner.nextDouble();
    }
}
