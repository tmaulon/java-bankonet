package com.bankonet;

public class CompteCourant  extends Compte implements ICompteStat {
    private double montantDecouvertAutorise;
    private static int nbComptesCourants = 0;

    public CompteCourant() {
        super();
        this.montantDecouvertAutorise = -150.0;
        nbComptesCourants += 1;
    }

    public CompteCourant(String numero, String intitule, double solde, double montantDecouvertAutorise) {
        super(numero, intitule, solde);
        this.montantDecouvertAutorise = montantDecouvertAutorise;
        nbComptesCourants += 1;
    }

    @Override
    void debiter(double amount) {
        if (super.solde - amount <= this.montantDecouvertAutorise) {
            System.out.println("Débit du Compte Courant impossible, le montant de découvert autorisé est atteint.");
        } else {
            super.solde -= amount;
        }

    }

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

    double getMontantDecouvertAutorise() {
        return montantDecouvertAutorise;
    }

    void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }

    static int getNbComptesCourants() {
        return nbComptesCourants;
    }

}
