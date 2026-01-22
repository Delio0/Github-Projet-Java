package model.jeux;

import java.util.ArrayList;

public class Test {
    private String pseudoTesteur;
    private String date;
    private String texte;
    private String version;

    // Notes par catégorie
    private double noteInterface;
    private double noteGameplay;
    private double noteOptimisation;
    private double noteSpecifiqueGenre;

    // Éléments optionnels
    private ArrayList<String> pointsForts;
    private ArrayList<String> pointsFaibles;
    private String conditions;
    private ArrayList<Jeu> jeuxSimilaires;

    //Constructeur
    public Test(String pseudoTesteur, String date, String texte, String version,
                double noteInterface, double noteGameplay, double noteOptimisation,
                double noteSpecifiqueGenre) {
        this.pseudoTesteur = pseudoTesteur;
        this.date = date;
        this.texte = texte;
        this.version = version;
        this.noteInterface = noteInterface;
        this.noteGameplay = noteGameplay;
        this.noteOptimisation = noteOptimisation;
        this.noteSpecifiqueGenre = noteSpecifiqueGenre;

        // Initialisation des listes optionnelles
        this.pointsForts = new ArrayList<>();
        this.pointsFaibles = new ArrayList<>();
        this.jeuxSimilaires = new ArrayList<>();
        this.conditions = "";

    }
    //Getters


    public String getPseudoTesteur() {
        return pseudoTesteur;
    }

    public String getDate() {
        return date;
    }

    public String getTexte() {
        return texte;
    }

    public String getVersion() {
        return version;
    }

    public double getNoteInterface() {
        return noteInterface;
    }

    public double getNoteGameplay() {
        return noteGameplay;
    }

    public double getNoteOptimisation() {
        return noteOptimisation;
    }

    public double getNoteSpecifiqueGenre() {
        return noteSpecifiqueGenre;
    }

    public ArrayList<String> getPointsForts() {
        return pointsForts;
    }

    public ArrayList<String> getPointsFaibles() {
        return pointsFaibles;
    }

    public ArrayList<Jeu> getJeuxSimilaires() {
        return jeuxSimilaires;
    }
}
