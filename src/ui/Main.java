package ui;

import model.jeux.Jeu;
import service.ChargeurCSV;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //création des outils
        ChargeurCSV chargeur = new ChargeurCSV();
        Scanner scanner = new Scanner(System.in);

        //On charge les données
        System.out.println("Chargement des jeux en cours...");
        ArrayList<Jeu> catalogueJeux = chargeur.chargerJeux("src/data/CSV_file.csv" +);
        System.out.println(catalogueJeux.size() + " jeux chargés avec succès !");

        //Boucle d'interaction
        boolean continuer = true;
        while (continuer) {
            System.out.println("\n--- PLATEFORME JEUX VIDÉO ---");
            System.out.println("1. Lister les 10 premiers jeux");
            System.out.println("2. Quitter");
            System.out.print("Votre choix : ");

            String choix = scanner.nextLine();

            if (choix.equals("1")) {
                for (int i = 0; i < 10; i++) {
                    System.out.println("- " + catalogueJeux.get(i).getNom());
                }
            } else if (choix.equals("2")) {
                continuer = false;
                System.out.println("Au revoir !");
            }
        }
    }
}
