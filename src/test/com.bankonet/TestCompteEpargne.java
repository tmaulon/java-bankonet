package com.bankonet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCompteEpargne {

    @Test
    public void testInstanceCompteEpargne() {
        CompteEpargne compteEpargne1 = new CompteEpargne("36655463", "Compte épargne de M.Dupont", 15000.56, 0.05);
        System.out.println("Compte Epargne numéro1 : " + compteEpargne1.getNumero());
        System.out.println("Solde du compte épargne1  : " + compteEpargne1.getSolde() + "€");
        compteEpargne1.crediter(200.0);
        assertEquals(15200.56, compteEpargne1.getSolde(), "Le solde après avoir crédité le " + compteEpargne1.getIntitule() + " n'est pas le bon.");
        compteEpargne1.debiter(50.0);
        assertEquals(15150.56, compteEpargne1.getSolde(), "Le solde après avoir débité le " + compteEpargne1.getIntitule() + " n'est pas le bon.");
        System.out.println(compteEpargne1.toString());

//        CompteCourant compteCourant2 = new CompteEpargne("36655495", "Mme Durant", 250.1, 100.0);
//        System.out.println("compteCourant numéro2 : " + compteCourant2.getNumero());
//        System.out.println("Solde du compte courant2  : " + compteCourant2.getSolde() + "€");
//        compteCourant2.crediter(150.0);
//        assertEquals(400.1, compteCourant2.getSolde(), "Le solde après avoir crédité " + compteCourant2.getIntitule() + " n'est pas le bon.");
//        compteCourant2.debiter(100.0);
//        assertEquals(300.1, compteCourant2.getSolde(), "Le solde après avoir débité " + compteCourant2.getIntitule() + " n'est pas le bon.");
//        System.out.println(compteCourant2.toString());
//
//        CompteCourant compteCourant3 = new CompteEpargne("36652005", "Toto", 25000.35, 150.0);
//        System.out.println("compteCourant numéro3 : " + compteCourant3.getNumero());
//        System.out.println("Solde du compte courant3  : " + compteCourant3.getSolde() + "€");
//        assertEquals(3, compteCourant3.getNbComptesCourants(), "Ce n'est pas le bon nombre de compte courant");
//        compteCourant3.crediter(1000.0);
//        assertEquals(26000.35, compteCourant3.getSolde(), "Le solde après avoir crédité " + compteCourant3.getIntitule() + " n'est pas le bon.");
//        compteCourant3.debiter(500.0);
//        assertEquals(25500.35, compteCourant3.getSolde(), "Le solde après avoir débité " + compteCourant3.getIntitule() + " n'est pas le bon.");
//        System.out.println(compteCourant3.toString());
//
//
//        CompteCourant compteCourant4 = new CompteEpargne("86623247", "Michael Jordan-Is-Poor", -10.50, 150.0);
//        assertEquals(0, compteCourant4.getSolde(), "Nous avons un problêlme avec " + compteCourant4.getIntitule() + " car nous ne pouvons pas créer de compte avec un solde négatif ..");
//        System.out.println("compteCourant numéro4 : " + compteCourant4.getNumero());
//        System.out.println("Solde du compte courant4  : " + compteCourant4.getSolde() + "€");
//        assertEquals(4, compteCourant4.getNbComptesCourants(), "Ce n'est pas le bon nombre de compte courant");
//        compteCourant4.crediter(1000.0);
//        assertEquals(1000.0, compteCourant4.getSolde(), "Le solde après avoir crédité " + compteCourant4.getIntitule() + " n'est pas le bon.");
//        compteCourant4.debiter(500.0);
//        assertEquals(500, compteCourant4.getSolde(), "Le solde après avoir débité " + compteCourant4.getIntitule() + " n'est pas le bon.");
//        System.out.println(compteCourant4.toString());
    }
}
