package service;

import model.jeux.Jeu;
import java.util.ArrayList;

public class Catalogue {
    private ArrayList<Jeu> tousLesJeux;

    public Catalogue(ArrayList<Jeu> jeuxImportes) {
        this.tousLesJeux = jeuxImportes;
    }
    //Cherche les jeux dont le nom contient le texte recherché.
    //Ignore la casse (majuscules/minuscules)

    public ArrayList<Jeu> chercherParNom(String recherche) {
        ArrayList<Jeu> resultats = new ArrayList<>();

        for (Jeu j : tousLesJeux) {
            // .toLowerCase() permet de trouver "Mario" même si on tape "mario"
            if (j.getNom().toLowerCase().contains(recherche.toLowerCase())) {
                resultats.add(j);
            }
        }
        return resultats;
    }

    //Cherche les jeux par catégorie (Genre).

    public ArrayList<Jeu> chercherParGenre(String genreRecherche) {
        ArrayList<Jeu> resultats = new ArrayList<>();
        for (Jeu j : tousLesJeux) {
            if (j.getGenre().equalsIgnoreCase(genreRecherche)) {
                resultats.add(j);
            }
        }
        return resultats;
    }
}