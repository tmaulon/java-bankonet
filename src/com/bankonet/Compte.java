package com.bankonet;

public abstract class Compte {
    protected String numero;
    protected String intitule;
    protected double solde;

    public Compte(String numero, String intitule, double solde) {
        this.numero = numero;
        this.intitule = intitule;
        if(solde < 0) {
            this.solde = 0;
        } else {
            this.solde = solde;
        }
    }


    public Compte() {
        this.solde = 0.0;
    }


    public double getSolde() {
        return solde;
    }

    public String toString() {
        return "Le compte numéro : " + this.numero + " de " + this.intitule + " s'élève à un montant de : " + this.solde ;
    }

    void crediter(double amount) {
        this.solde += amount;
    }

    abstract void debiter(double amount);

}
