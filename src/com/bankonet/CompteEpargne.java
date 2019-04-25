package com.bankonet;

public class CompteEpargne extends Compte {
    private double tauxInteret;

    public CompteEpargne(String numero, String intitule, double solde, double tauxInteret) {
        super(numero, intitule, solde);
        this.tauxInteret = tauxInteret;
    }

    @Override
    void debiter(double amount) {
        if (super.solde - amount <=0) {
            System.out.println("Débit du Compte Epargne impossible");
        } else {
            super.solde -= amount;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }
}
