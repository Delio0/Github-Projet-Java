package model.membres;

public abstract class Membre {
    protected String pseudo;

    public Membre(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPseudo() {
        return pseudo;
    }
}



