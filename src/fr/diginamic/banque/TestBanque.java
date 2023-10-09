package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        // Créez une instance de la classe Compte avec un numéro et un solde de votre choix
        Compte compte = new Compte("123456", 1000.0);

        // Affichez l'instance créée avec System.out.println(...)
        System.out.println("Numéro de compte : " + compte.getNumeroCompte());
        System.out.println("Solde du compte : " + compte.getSolde());

        // les informations du compte (numéro et solde) sont affichées.
    }
}
