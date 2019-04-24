package com.bankonet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCompteCourant {

    @Test
    public void testInstanceCompteCourant() {
        CompteCourant compteCourant1 = new CompteCourant("36655463", "Compte M.Dupont", 15000.56, 200.00);
        System.out.println("compteCourant numéro : " + compteCourant1.numero);
        System.out.println("Solde du compte courant  : " + compteCourant1.solde);

        CompteCourant compteCourant2 = new CompteCourant("36655495", "Compte Mme Durant", 250.10, 100.00);
        System.out.println("compteCourant numéro : " + compteCourant2.numero);
        System.out.println("Solde du compte courant  : " + compteCourant2.solde);

        CompteCourant compteCourant3 = new CompteCourant("36652005", "Compte Toto", 25000.35, 150.00);
        System.out.println("compteCourant numéro : " + compteCourant3.numero);
        System.out.println("Solde du compte courant  : " + compteCourant3.solde);
        assertEquals(3, compteCourant3.nbComptesCourants, "Ce n'est pas le bon nombre de compte courant");
    }

}
