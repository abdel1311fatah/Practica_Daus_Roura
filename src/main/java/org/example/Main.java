package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int vegades = obtindreInt("Quantes vegades vols tirar els daus? ");
        GenerarHistograma generarHistograma = new GenerarHistograma();

        generarHistograma.tirar_daus(vegades);

        for (Integer numero: generarHistograma.getResultats().keySet()) {
            String key = numero.toString();
            String value = generarHistograma.getResultats().get(numero).toString();
            System.out.println(key + " " + value);
        }

    }

    public String obtindreString(String text) {
        Scanner sc = new Scanner(System.in);

        System.out.print(text);
        String text_usuari = sc.nextLine();

        return text_usuari;
    }

    public double obtindreDouble(String text) {
        boolean TipusCorrecte;
        Scanner sc = new Scanner(System.in);
        double num_usuari = 0.0;

        do {
            System.out.print(text);
            TipusCorrecte = sc.hasNextDouble();
            if (!TipusCorrecte) {
                sc.nextLine();
                System.out.println("Error Valor no valid");
            } else {
                num_usuari = sc.nextDouble();
            }
        } while (!TipusCorrecte);
        return num_usuari;
    }

    public static int obtindreInt(String text) {

        boolean TipusCorrecte;
        Scanner sc = new Scanner(System.in);
        int num_usuari = 0;

        do {
            System.out.print(text);
            TipusCorrecte = sc.hasNextInt();
            if (!TipusCorrecte) {
                sc.nextLine();
                System.out.println("Error: Valor no válido");
            } else {
                num_usuari = sc.nextInt();
            }
        } while (!TipusCorrecte);

        return num_usuari;
    }


}