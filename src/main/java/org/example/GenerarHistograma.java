package org.example;

import java.util.Random;

public class GenerarHistograma {
    Random r1 = new Random();
    Random r2 = new Random();
    public int generar_dau1(){

        int d1 = r1.nextInt(6) + 1;

        return d1;

    }

    public int generar_dau2(){

        int d2 = r2.nextInt(6) + 1;

        return d2;

    }
    public String tirar_daus(int vegades){

        String llista = null, asteriscos = null;
        for (int i = 0; i<= vegades; i++) {
            int resultat = generar_dau1() + generar_dau2();
            llista = resultat + ": ";
            for (int x = 0; x <= resultat; x++){
                asteriscos += "*";
            }
            llista += asteriscos;
        }

        return llista;
    }

}
