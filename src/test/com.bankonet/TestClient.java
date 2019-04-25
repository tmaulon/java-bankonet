package com.bankonet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestClient {
    @Test
    public void testClient() {
        CompteCourant compteCourant1 = new CompteCourant("36655463", "Compte courant de M.Dupont", 1000.56, 200.0);
        CompteEpargne compteEpargne1 = new CompteEpargne("36655463", "Compte épargne de M.Dupont", 15000.56, 0.05);
        Client client1 = new Client("1","Dupont", "Arthur", compteCourant1, compteEpargne1);
        try{
            System.out.println("Solde du " + client1.getCompteCourant().getIntitule() + " : " + client1.getCompteCourant().getSolde() + "€");
            System.out.println("Solde du " + client1.getCompteEpargne().getIntitule() + " : " + client1.getCompteEpargne().getSolde() + "€");
            System.out.println("Solde total des comptes de " + client1.getNom() + " : " +client1.calculerAvoirGlobal() + "€");
        } catch (NullPointerException e) {
            System.out.println("Renvoie Null");
        }
        Client client5 = new Client("1","Dupont", "Arthur", null, null);

    }
}
