package com.bankonet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCompteCourant {

    @Test
    public void testInstanceCompteCourant() {
        CompteCourant compteCourant1 = new CompteCourant("36655463", "M.Dupont", 15000.56, 200.0);
        System.out.println("compteCourant numéro1 : " + compteCourant1.numero);
        System.out.println("Solde du compte courant1  : " + compteCourant1.solde + "€");
        compteCourant1.crediter(200.0);
        assertEquals(15200.56, compteCourant1.solde, "Le solde après avoir crédité " + compteCourant1.intitule + " n'est pas le bon.");
        compteCourant1.debiter(50.0);
        assertEquals(15150.56, compteCourant1.solde, "Le solde après avoir débité " + compteCourant1.intitule + " n'est pas le bon.");
        System.out.println(compteCourant1.toString());

        CompteCourant compteCourant2 = new CompteCourant("36655495", "Mme Durant", 250.1, 100.0);
        System.out.println("compteCourant numéro2 : " + compteCourant2.numero);
        System.out.println("Solde du compte courant2  : " + compteCourant2.solde + "€");
        compteCourant2.crediter(150.0);
        assertEquals(400.1, compteCourant2.solde, "Le solde après avoir crédité " + compteCourant2.intitule + " n'est pas le bon.");
        compteCourant2.debiter(100.0);
        assertEquals(300.1, compteCourant2.solde, "Le solde après avoir débité " + compteCourant2.intitule + " n'est pas le bon.");
        System.out.println(compteCourant2.toString());

        CompteCourant compteCourant3 = new CompteCourant("36652005", "Toto", 25000.35, 150.0);
        System.out.println("compteCourant numéro3 : " + compteCourant3.numero);
        System.out.println("Solde du compte courant3  : " + compteCourant3.solde + "€");
        assertEquals(3, compteCourant3.nbComptesCourants, "Ce n'est pas le bon nombre de compte courant");
        compteCourant3.crediter(1000.0);
        assertEquals(26000.35, compteCourant3.solde, "Le solde après avoir crédité " + compteCourant3.intitule + " n'est pas le bon.");
        compteCourant3.debiter(500.0);
        assertEquals(25500.35, compteCourant3.solde, "Le solde après avoir débité " + compteCourant3.intitule + " n'est pas le bon.");
        System.out.println(compteCourant3.toString());
    }


}
