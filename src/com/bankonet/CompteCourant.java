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
        nbComptesCourants += 1;
    }


    public void crediter(double amount) {
        this.solde += amount;
    }

    public void debiter(double amount) {
        this.solde -= amount;
    }

    public String toString() {
        return "Le compte numéro : " + this.numero + " de " + this.intitule + " s'élève à un montant de : " + this.solde + " et ne doit pas dépasser un découvert de : " + this.montantDecouvertAutorise;
    }
}
