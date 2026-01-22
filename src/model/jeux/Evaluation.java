package model.jeux;

public class Evaluation {
    private String pseudoAuteur;
    private String date;
    private String texte;
    private String version;
    private double noteGlobale;

    private int nbUtile;   // Compteur de votes positifs
    private int nbInutile; // Compteur de votes négatifs

    //Constructeur
    public Evaluation(String pseudoAuteur, String date, String texte, String version, double noteGlobale) {
        this.pseudoAuteur = pseudoAuteur;
        this.date = date;
        this.texte = texte;
        this.version = version;
        this.noteGlobale = noteGlobale;

        // Initialisation des compteurs à zéro
        this.nbUtile = 0;
        this.nbInutile = 0;
    }
    //Getters et Setters

    public String getPseudoAuteur() {
        return pseudoAuteur;
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
    public double getNoteGlobale() {
        return noteGlobale;
    }

    public int getNbInutile() {
        return nbInutile;
    }
    public void setNbInutile(int nbInutile) {
        this.nbInutile = nbInutile;
    }

    public int getNbUtile() {
        return nbUtile;
    }
    public void setNbUtile(int nbUtile) {
        this.nbUtile = nbUtile;
    }
}
