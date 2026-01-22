package model.jeux; // Corrigé : pas de point à la fin

import java.util.ArrayList;

public class Jeu {
    //Attributs constants issus du CSV
    private String nom;
    private String plateforme;
    private int anneeSortie;
    private String genre;
    private String editeur;
    private double ventesGlobales;
    private int criticScore;
    private int criticCount;
    private double userScoreCSV;
    private int userCountCSV;
    private String developpeur;
    private String rating;

    //Données dynamiques de la plateforme
    private int jetonsVotés;
    private ArrayList<Evaluation> listeEvaluations;
    private Test testOfficiel;

    //constructeur
    public Jeu(String nom, String plateforme, int anneeSortie, String genre, String editeur,
               double ventesGlobales, int criticScore, int criticCount, double userScoreCSV, int userCountCSV,
               String developpeur, String rating){

        // Initialisation des données du fichier
        this.nom = nom;
        this.plateforme = plateforme;
        this.anneeSortie = anneeSortie;
        this.genre = genre;
        this.editeur = editeur;
        this.ventesGlobales = ventesGlobales;
        this.criticScore = criticScore;
        this.criticCount = criticCount;
        this.userScoreCSV = userScoreCSV;
        this.userCountCSV = userCountCSV;
        this.developpeur = developpeur;
        this.rating = rating;

        // Initialisation par défaut pour la plateforme
        this.jetonsVotés = 0;
        this.listeEvaluations = new ArrayList<>(); // Liste vide au départ
        this.testOfficiel = null;                  // Pas de test au début [cite: 84]
    }
    //Getters pour données constantes

    public String getNom() {
        return nom;
    }
    public String getPlateforme() {
        return plateforme;
    }
    public int getAnneeSortie() {
        return anneeSortie;
    }
    public String getGenre() {
        return genre;
    }
    public String getEditeur() {
        return editeur;
    }
    public double getVentesGlobales() {
        return ventesGlobales;
    }
    public int getCriticScore() {
        return criticScore;
    }
    public int getCriticCount() {
        return criticCount;
    }
    public double getUserScoreCSV() {
        return userScoreCSV;
    }
    public int getUserCountCSV() {
        return userCountCSV;
    }
    public String getDeveloppeur() {
        return developpeur;
    }
    public String getRating() {
        return rating;
    }

    //Getters et Setters pour données dynamique

    public int getJetonsVotés() {
        return jetonsVotés;
    }
    public void setJetonsVotés(int jetonsVotés) {
        this.jetonsVotés = jetonsVotés;
    }

    public ArrayList<Evaluation> getListeEvaluations() {
        return listeEvaluations;
    }
    public void setListeEvaluations(ArrayList<Evaluation> listeEvaluations) {
        this.listeEvaluations = listeEvaluations;
    }

    public Test getTestOfficiel() {
        return testOfficiel;
    }
    public void setTestOfficiel(Test testOfficiel) {
        this.testOfficiel = testOfficiel;
    }
}
