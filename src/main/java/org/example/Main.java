package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        GenerarHistograma generarHistograma = new GenerarHistograma();

        System.out.println(generarHistograma.generar_daus());

        generarHistograma.tirar_daus(generarHistograma.generar_daus(), 2);

    }
}