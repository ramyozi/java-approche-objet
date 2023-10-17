package dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDates {
    public static void main(String[] args) {
        // Créer une instance de LocalDateTime à la date du jour
        LocalDateTime dateDuJour = LocalDateTime.now();
        
        // Afficher la date du jour au format "jour/mois/année"
        DateTimeFormatter sdf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Date du jour : " + dateDuJour.format(sdf1));

        // Créer une instance de LocalDateTime à la date du 19/05/2023 à 23:59:30
        LocalDateTime date19052023 = LocalDateTime.of(2023, 5, 19, 23, 59, 30);
        
        // Afficher la date au format "année/mois/jour heure:minute:seconde"
        DateTimeFormatter sdf2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Date du 19/05/2023 à 23:59:30 : " + date19052023.format(sdf2));

        // Créer une instance de LocalDateTime contenant la date/heure système
        LocalDateTime dateSysteme = LocalDateTime.now();

        // Afficher la date/heure système au même format
        System.out.println("Date/heure système : " + dateSysteme.format(sdf2));
    }
}
