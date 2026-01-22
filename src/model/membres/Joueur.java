package model.membres;

public class Joueur extends Membre{
    private int jeton;

    public joueur(String pseudo) {
        super(pseudo);
        this.jeton = 3;
    }

    public int getJeton() {
        return jeton;
    }

    public void setJeton(int jeton) {
        this.jeton = jeton;
    }
}
