package Exo6;

public class Escale {
    private String name;
    private int nbKm;

    public Escale(String name, int nbKm) {
        this.name = name;
        this.nbKm = nbKm;
    }

    public String getName() {
        return name;
    }

    public int getNbKm() {
        return nbKm;
    }

    @Override
    public String toString() {
        return "Stopover [name=" + name + ", nbKm=" + nbKm + "]";
    }
}
