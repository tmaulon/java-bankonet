package com.bankonet;

public class Client {
    private String identifiant;
    private String nom;
    private String prenom;
    private CompteCourant compteCourant;
    private CompteEpargne compteEpargne;

    public Client(String identifiant, String nom, String prenom, CompteCourant compteCourant, CompteEpargne compteEpargne) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.compteCourant = compteCourant;
        this.compteEpargne = compteEpargne;
    }

    public double calculerAvoirGlobal() {
        return compteCourant.getSolde() + compteEpargne.getSolde();
//        double soldeCompteCourant= compteCourant.getSolde();
//        double soldeCompteEpargne= compteEpargne.getSolde();
//        double soldeTotalComptes;
//        if (soldeCompteEpargne != 0 && soldeCompteCourant != 0) {
//            soldeTotalComptes = soldeCompteCourant + soldeCompteEpargne;
//            System.out.println("Compte courant : " + soldeCompteCourant + " Compte Epargne : " + soldeCompteEpargne + " soldeTotalComptes : " + soldeTotalComptes  );
//        } else if(soldeCompteEpargne == 0 && soldeCompteCourant != 0){
//            soldeTotalComptes =  soldeCompteCourant;
//            System.out.println("Compte courant : " + soldeCompteCourant + " soldeTotalComptes : " + soldeTotalComptes  );
//        } else if(soldeCompteCourant == 0 && soldeCompteEpargne != 0){
//            soldeTotalComptes =  soldeCompteEpargne;
//            System.out.println("Compte Epargne : " + soldeCompteEpargne + " soldeTotalComptes : " + soldeTotalComptes  );
//        } else {
//            System.out.println("Compte inexistant ou vide ");
//        }
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public CompteCourant getCompteCourant() {
        return compteCourant;
    }

    public void setCompteCourant(CompteCourant compteCourant) {
        this.compteCourant = compteCourant;
    }

    public CompteEpargne getCompteEpargne() {
        return compteEpargne;
    }

    public void setCompteEpargne(CompteEpargne compteEpargne) {
        this.compteEpargne = compteEpargne;
    }

}
