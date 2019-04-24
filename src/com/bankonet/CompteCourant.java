package com.bankonet;

public class CompteCourant {
    String numero;
    String intitule;
    double solde;
    double montantDecouvertAutorise;
    static int nbComptesCourants = 0;

    public CompteCourant(String numero, String intitule, double solde, double montantDecouvertAutorise) {
        this.numero = numero;
        this.intitule = intitule;
        this.solde = solde;
        this.montantDecouvertAutorise = montantDecouvertAutorise;
        nbComptesCourants += 2;
    }






}
