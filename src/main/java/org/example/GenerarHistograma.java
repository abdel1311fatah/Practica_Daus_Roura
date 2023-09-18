package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class GenerarHistograma {

    private Dau dau1; // null
    private Dau dau2;

    public HashMap<Integer, String> getResultats() {
        return resultats;
    }

    private HashMap<Integer, String> resultats;

    GenerarHistograma(){
        dau1 = new Dau("Dau 1", 0); //constructor per assignar nom i valor 0 per que si no pete
        dau2 = new Dau("Dau 2",0);
        resultats = new HashMap<Integer, String>();
    }

    public void tirar_daus(int vegades){ // es va fent el numero un per 1

        String llista = "";

        int resultatOriginal = 0, c1 = 0;
        for (int i = 0; i< vegades; i++) {
            dau1.setValor(dau1.generar());
            dau2.setValor(dau2.generar());
            int resultat = dau1.getValor() + dau2.getValor();

            if(resultats.containsKey(resultat)){
                String asteriscosRes =  resultats.get(resultat) + "*";

                resultats.put(resultat, asteriscosRes);
            }else{
                resultats.put(resultat, "*");
            }
        }

    }

}
