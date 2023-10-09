package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte("12345", 1000.0);
        CompteTaux compteTaux = new CompteTaux("67890", 2000.0, 1.5);

        Compte[] comptes = { compte, compteTaux };
        for (Compte c : comptes) {
            System.out.println(c);
            if (c instanceof CompteTaux) {
            	System.out.println("taux " + c.calculerMontant());
            	System.out.println();
            }
            
        }

    }
    
    public static void GenererPDF(Compte cpt){
    	cpt.calculerMontant();
    }
}
