package org.example;

import java.util.Random;

public class Dau {

    private String nom; // en privat per a que nomes es pugui tocar el nom al fer el constructor

    public Dau(String nom) {
        this.nom = nom;
    }

    public int generar() { //generador del valor random del dau

        Random r1 = new Random();
        int d1 = r1.nextInt(6) + 1;

        return d1;
    }
}
