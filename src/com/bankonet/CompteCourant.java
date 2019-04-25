package com.bankonet;

public class CompteCourant {
    private String numero;
    private String intitule;
    private double solde;
    private double montantDecouvertAutorise;
    private static int nbComptesCourants = 0;

    String getNumero() {
        return numero;
    }

    void setNumero(String numero) {
        this.numero = numero;
    }

    String getIntitule() {
        return intitule;
    }

    void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    double getSolde() {
        return solde;
    }

    double getMontantDecouvertAutorise() {
        return montantDecouvertAutorise;
    }

    void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }

    static int getNbComptesCourants() {
        return nbComptesCourants;
    }

    public CompteCourant() {
        this.solde = 0.0;
        this.montantDecouvertAutorise = -150.0;
        nbComptesCourants += 1;
    }

    public CompteCourant(String numero, String intitule, double solde, double montantDecouvertAutorise) {
        this.numero = numero;
        this.intitule = intitule;
        if(solde < 0) {
            this.solde = 0;
        } else {
            this.solde = solde;
        }
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
        return "Le compte numéro : " + this.numero + " de " + this.intitule + " s'élève à un montant de : " + this.solde + "€ et ne doit pas dépasser un découvert de : " + this.montantDecouvertAutorise + "€";
    }


}
