package com.softway.medical;

import java.util.ArrayList;

public class App {

    /*
     * Methode permettant de diriger un patient  vers l'unité médicale adaptée au sein de l'hôpital
     */
    public static String getPathologiePatient(Integer index) {

        var pathologies = new ArrayList<String>();

        // si le resultat égal à 0, c'est que l'index de santé est un miltuple de 3
        if (index % 3 == 0) {
            pathologies.add("Cardiologie");
        }
        // si le resultat égal à 0, c'est que l'index de santé est un miltuple de 5
        if (index % 5 == 0) {
            pathologies.add("Traumatologie");
        }
        // si pas Traumatologie ni Cardiologie
        if( pathologies.size() == 0) {
            return "Le nombre saisi n'est ni un multiple de 3 ni de 5 !";
        }

        return "D'àpres votre index de santé, Vous devez aller à : " + String.join(", ", pathologies) + ".";
    }
}
