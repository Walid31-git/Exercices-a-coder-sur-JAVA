package Exo4;

public class Employe {
    private String nom;
    private String prenom;
    private char genre;
    private double taille; 

    // Constructeur
    public Employe(String nom, String prenom, char genre, double taille) {
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.taille = taille;
    }

    // Méthodes getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public char getGenre() {
        return genre;
    }

    public double getTaille() {
        return taille;
    }

    // Méthode toString pour afficher les informations de l'employé
    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", genre=" + genre +
                ", taille=" + taille + "m" +
                '}';
    }

}
