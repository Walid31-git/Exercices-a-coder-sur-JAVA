package Exo5;

public class Animal {
    private String nom;
    private String couleur;
    private String cri;
    private double poids;

    public Animal(String nom, String couleur, String cri, double poids) {
        this.nom = nom;
        this.couleur = couleur;
        this.cri = cri;
        this.poids = poids;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getCri() {
        return cri;
    }

    public void setCri(String cri) {
        this.cri = cri;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nom='" + nom + '\'' +
                ", couleur='" + couleur + '\'' +
                ", cri='" + cri + '\'' +
                ", poids=" + poids +
                '}';
    }
}
