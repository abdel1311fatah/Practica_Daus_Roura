package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int vegades = obtindreInt("Quantes vegades vols tirar els daus? ");//Metode per a validar a la vegada que es printe
        GenerarHistograma generarHistograma = new GenerarHistograma();

        generarHistograma.tirar_daus(vegades);

        for (Integer numero: generarHistograma.getResultats().keySet()) { //amb el keyset pilles totes les claus del hashMap, llavors recorres el hasmap atraves de les keys
            String key = numero.toString(); // agafe una key del hashmap
            String value = generarHistograma.getResultats().get(numero).toString(); // aqui no esta agafant el numero, esta agafant el string linkejat al numero
            System.out.println(key + " " + value); //printe els valors del hasmap, al ser una key integer i un valor string el numero s ha de pasar amb el tostring
        }

    }

    //Metodes per a validar dades de teclat
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