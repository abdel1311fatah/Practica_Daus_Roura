package org.example;

import java.util.Random;

public class GenerarHistograma {
    Random r1 = new Random();
    Random r2 = new Random();
    public int [] [] generar_daus(){

        int d1 = r1.nextInt(6) + 1;
        int d2 = r2.nextInt(6) + 1;
        int [][] daus = new int[d1][d2];

        return daus;

    }
    public int tirar_daus(int[][] daus, int vegades){

        int resultat = daus [0][0] + daus [0][1];

        System.out.println("Resultat: " + resultat);

        return resultat;
    }

}
