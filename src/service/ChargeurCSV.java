package service;

import model.jeux.Jeu;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ChargeurCSV {

    public ArrayList<Jeu> chargerJeux(String cheminFichier) {
        ArrayList<Jeu> listeJeux = new ArrayList<>();

        // Le "try-with-resources" ferme automatiquement le fichier à la fin, même s'il y a une erreur
        try (BufferedReader br = new BufferedReader(new FileReader(cheminFichier))) {

            String ligne;
            br.readLine(); // On lit la 1ère ligne (en-tête) pour l'ignorer

            while ((ligne = br.readLine()) != null) {
                // On découpe la ligne par les virgules
                String[] colonnes = ligne.split(",");

                // On extrait les données en vérifiant les indices du CSV
                String nom = colonnes[1];
                String plateforme = colonnes[2];

                // Exemple de conversion sécurisée pour l'année
                int annee = convertirInt(colonnes[3]);
                String genre = colonnes[4];
                String editeur = colonnes[5];
                double ventesGlobales = convertirDouble(colonnes[10]);
                int criticScore = convertirInt(colonnes[11]);
                int criticCount = convertirInt(colonnes[12]);
                double userScore = convertirDouble(colonnes[13]);
                int userCount = convertirInt(colonnes[14]);
                String developpeur = colonnes[15];
                String rating = (colonnes.length > 16) ? colonnes[16] : "N/A";

                // On crée l'objet Jeu et on l'ajoute à la liste
                Jeu nouveauJeu = new Jeu(nom, plateforme, annee, genre, editeur,
                        ventesGlobales, criticScore, criticCount,
                        userScore, userCount, developpeur, rating);
                listeJeux.add(nouveauJeu);
            }
        } catch (Exception e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
        return listeJeux;
    }

    // Petites méthodes pour éviter que le programme plante si une case est vide ou "N/A"
    private int convertirInt(String s) {
        try {
            return (s == null || s.isEmpty() || s.equals("N/A")) ? 0 : (int)Double.parseDouble(s);
        } catch (NumberFormatException e) { return 0; }
    }

    private double convertirDouble(String s) {
        try {
            return (s == null || s.isEmpty() || s.equals("N/A") || s.equals("tbd")) ? 0.0 : Double.parseDouble(s);
        } catch (NumberFormatException e) { return 0.0; }
    }
}
