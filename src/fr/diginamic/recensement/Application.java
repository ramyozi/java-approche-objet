package fr.diginamic.recensement;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Recensement recensement = new Recensement();
        
        recensement.chargerDonnees("C:\\Users\\ramzi\\Downloads\\recensement2016.csv");

        Scanner scanner = new Scanner(System.in);

        int choix;

        do {
            // le menu
            System.out.println("Menu:");
            System.out.println("1. Population d'une ville donnée");
            System.out.println("2. Population d'un département donné");
            System.out.println("3. Population d'une région donnée");
            System.out.println("4. Afficher les 10 régions les plus peuplées");
            System.out.println("5. Afficher les 10 départements les plus peuplés");
            System.out.println("6. Afficher les 10 villes les plus peuplées d'un département");
            System.out.println("7. Afficher les 10 villes les plus peuplées d'une région");
            System.out.println("8. Afficher les 10 villes les plus peuplées de France");
            System.out.println("9. Sortir");

            System.out.print("Choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    RecherchePopulationVille recherche1 = new RecherchePopulationVille();
                    recherche1.traiter(recensement, scanner);
                    break;
                case 2:
                    RecherchePopulationDepartement recherche2 = new RecherchePopulationDepartement();
                    recherche2.traiter(recensement, scanner);
                    break;
                case 3:
                    RecherchePopulationRegion recherche3 = new RecherchePopulationRegion();
                    recherche3.traiter(recensement, scanner);
                    break;
                case 4:
                    AfficherTop10Regions top10Regions = new AfficherTop10Regions();
                    top10Regions.traiter(recensement, scanner);
                    break;
                case 5:
                    AfficherTop10Departements top10Departements = new AfficherTop10Departements();
                    top10Departements.traiter(recensement, scanner);
                    break;
                case 6:
                    AfficherTop10VillesDepartement top10VillesDepartement = new AfficherTop10VillesDepartement();
                    top10VillesDepartement.traiter(recensement, scanner);
                    break;
                case 7:
                    AfficherTop10VillesRegion top10VillesRegion = new AfficherTop10VillesRegion();
                    top10VillesRegion.traiter(recensement, scanner);
                    break;
                case 8:
                    AfficherTop10VillesFrance top10VillesFrance = new AfficherTop10VillesFrance();
                    top10VillesFrance.traiter(recensement, scanner);
                    break;
                case 9:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix non valide. Veuillez entrer un choix valide.");
            }
        } while (choix != 9);

        scanner.close();
    }
}
