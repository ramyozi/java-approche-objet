package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte("12345", 1000.0);
        CompteTaux compteTaux = new CompteTaux("67890", 2000.0, 0.03);

       

    }
}
