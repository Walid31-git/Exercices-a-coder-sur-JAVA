package Exo2;

public class Animal {
    private String nom;
    private Integer poid;

    public String getCri() {
        return cri;
    }

    public void setCri(String cri) {
        this.cri = cri;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    private String couleur;
    private String cri;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getPoid() {
        return poid;
    }

    public void setPoid(Integer poid) {
        this.poid = poid;
    }


    public Animal(String nom, Integer poid,String couleur,String cri) {
        this.nom = nom;
        this.poid = poid;
        this.couleur = couleur;
        this.cri = cri;
    }

    public void afficherDetails() {
        System.out.println("Nom de l'animal : " + nom + ", Poids : " + poid);
    }
    public String afficherDetails2() {
        return "Nom de l'animal : " + nom + ", Poids : " + poid ;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nom='" + nom + '\'' +
                ", poid=" + poid +
                ", couleur='" + couleur + '\'' +
                ", cri='" + cri + '\'' +
                '}';
    }
}
