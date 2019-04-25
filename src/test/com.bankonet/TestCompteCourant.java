package com.bankonet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCompteCourant {

    @Test
    public void testInstanceCompteCourant() {
        CompteCourant compteCourant1 = new CompteCourant("36655463", "Compte courant de M.Dupont", 1000.56, 200.0);
        System.out.println("compteCourant numéro1 : " + compteCourant1.getNumero());
        System.out.println("Solde du compte courant1  : " + compteCourant1.getSolde() + "€");
        compteCourant1.crediter(200.0);
        assertEquals(1200.56, compteCourant1.getSolde(), "Le solde après avoir crédité le " + compteCourant1.getIntitule() + " n'est pas le bon.");
        compteCourant1.debiter(50.0);
        assertEquals(1150.56, compteCourant1.getSolde(), "Le solde après avoir débité le" + compteCourant1.getIntitule() + " n'est pas le bon.");
        System.out.println(compteCourant1.toString());

        CompteCourant compteCourant2 = new CompteCourant("36655495", "Compte courant de Mme Durant", 250.1, 100.0);
        System.out.println("compteCourant numéro2 : " + compteCourant2.getNumero());
        System.out.println("Solde du compte courant2  : " + compteCourant2.getSolde() + "€");
        compteCourant2.crediter(150.0);
        assertEquals(400.1, compteCourant2.getSolde(), "Le solde après avoir crédité le " + compteCourant2.getIntitule() + " n'est pas le bon.");
        compteCourant2.debiter(100.0);
        assertEquals(300.1, compteCourant2.getSolde(), "Le solde après avoir débité le" + compteCourant2.getIntitule() + " n'est pas le bon.");
        System.out.println(compteCourant2.toString());

        CompteCourant compteCourant3 = new CompteCourant("36652005", "Compte courant de Toto", 25000.35, 150.0);
        System.out.println("compteCourant numéro3 : " + compteCourant3.getNumero());
        System.out.println("Solde du compte courant3  : " + compteCourant3.getSolde() + "€");
        assertEquals(3, compteCourant3.getNbComptesCourants(), "Ce n'est pas le bon nombre de compte courant");
        compteCourant3.crediter(1000.0);
        assertEquals(26000.35, compteCourant3.getSolde(), "Le solde après avoir crédité le " + compteCourant3.getIntitule() + " n'est pas le bon.");
        compteCourant3.debiter(500.0);
        assertEquals(25500.35, compteCourant3.getSolde(), "Le solde après avoir débité le" + compteCourant3.getIntitule() + " n'est pas le bon.");
        System.out.println(compteCourant3.toString());


        CompteCourant compteCourant4 = new CompteCourant("86623247", "Compte courant de Michael Jordan-Is-Poor", -10.50, 150.0);
        assertEquals(0, compteCourant4.getSolde(), "Nous avons un problême avec " + compteCourant4.getIntitule() + " car nous ne pouvons pas créer de compte avec un solde négatif ..");
        System.out.println("compteCourant numéro4 : " + compteCourant4.getNumero());
        System.out.println("Solde du compte courant4  : " + compteCourant4.getSolde() + "€");
        assertEquals(4, compteCourant4.getNbComptesCourants(), "Ce n'est pas le bon nombre de compte courant");
        compteCourant4.crediter(1000.0);
        assertEquals(1000.0, compteCourant4.getSolde(), "Le solde après avoir crédité le " + compteCourant4.getIntitule() + " n'est pas le bon.");
        compteCourant4.debiter(500.0);
        assertEquals(500, compteCourant4.getSolde(), "Le solde après avoir débité le" + compteCourant4.getIntitule() + " n'est pas le bon.");
        System.out.println(compteCourant4.toString());
    }


}
