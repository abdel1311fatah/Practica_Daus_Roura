package org.example;

import java.util.Random;

public class Dau {

    public Dau(String nom, int valor) {
        this.nom = nom;
        this.valor = valor;
    }

    public String nom;
    public int valor;


    public int generar() {

        Random r1 = new Random();
        int d1 = r1.nextInt(6) + 1;

        return d1;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
