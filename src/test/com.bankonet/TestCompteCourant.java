package com.bankonet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCompteCourant {

    @Test
    public void testInstanceCompteCourant() {
        CompteCourant compteCourant1 = new CompteCourant("36655463", "Compte M.Dupont", 15000.56, 200.00);
        System.out.println("compteCourant numéro1 : " + compteCourant1.numero);
        System.out.println("Solde du compte courant1  : " + compteCourant1.solde);
        compteCourant1.crediter(200.0);
        compteCourant1.debiter(50.0);
        System.out.println(compteCourant1.toString());

        CompteCourant compteCourant2 = new CompteCourant("36655495", "Compte Mme Durant", 250.10, 100.00);
        System.out.println("compteCourant numéro2 : " + compteCourant2.numero);
        System.out.println("Solde du compte courant2  : " + compteCourant2.solde);
        compteCourant1.crediter(150.0);
        compteCourant1.debiter(100.0);
        System.out.println(compteCourant2.toString());

        CompteCourant compteCourant3 = new CompteCourant("36652005", "Compte Toto", 25000.35, 150.00);
        System.out.println("compteCourant numéro3 : " + compteCourant3.numero);
        System.out.println("Solde du compte courant3  : " + compteCourant3.solde);
        assertEquals(3, compteCourant3.nbComptesCourants, "Ce n'est pas le bon nombre de compte courant");
        compteCourant1.crediter(1000.0);
        compteCourant1.debiter(500.0);
        System.out.println(compteCourant3.toString());
    }


}
