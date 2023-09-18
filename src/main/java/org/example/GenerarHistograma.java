package org.example;

import java.util.HashMap;

public class GenerarHistograma {

    private Dau dau1; // tots null
    private Dau dau2;
    private HashMap<Integer, String> resultats; // el hashmap es un objecte quepermet guardar una key identificadora d' un objecte, un string, etc, que fa que cada item tingui un identificador

    public HashMap<Integer, String> getResultats() { //getter del HashMap
        return resultats;
    }

    GenerarHistograma(){//constructor per assignar nom i valor 0 per que si no pete, nomes se li pot ficar una vegada els noms per que no hi ha getters ni setters
        dau1 = new Dau("Dau 1"); //Crear els daus amb el seus noms
        dau2 = new Dau("Dau 2");
        resultats = new HashMap<Integer, String>(); // inicialitzar el HashMap
    }

    public void tirar_daus(int vegades){

        for (int i = 0; i< vegades; i++) { // tire els daus les vegades que se li han entrat per el teclat
            int resultat = dau1.generar() + dau2.generar(); // suma dels 2 daus

            if(resultats.containsKey(resultat)){ // busque la key equivalent al resultat de la suma dels daus

                String asteriscosRes =  resultats.get(resultat).concat("*"); // si la trobe al string linkejat al valor trobat se li sume un asterisc

                resultats.put(resultat, asteriscosRes); // el put actualitze el valor del hashMap, a l esquerra va la variable resultat i a la dreta la cadena d asteriscos
            }else{
                resultats.put(resultat, "*");// el valor encara no ha sortit, per lo que li fica un asterisc
            }
        }

    }

}
