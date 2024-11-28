package Exo1;

public class Voiture {

    private String marque;
    private String couleur;

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
    public Voiture(String marque, String couleur) {
        this.marque = marque;
        this.couleur = couleur;
    }
    @Override
    public String toString() {
        return "Voiture{" + "marque='" + marque + '\'' + ", couleur='" + couleur + '\'' + '}';
    }

}

