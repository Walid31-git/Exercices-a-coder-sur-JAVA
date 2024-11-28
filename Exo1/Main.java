package Exo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Voiture> Voitures = new ArrayList<>();
        Voitures.add(new Voiture("Toyota","Gris"));
        Voitures.add(new Voiture("Audi","noir"));
        Voitures.add(new Voiture("Maseratti","Rouge"));
        System.out.println("Liste des voitures : " + Voitures);

        Comparator<Voiture> comparator = Comparator.comparing(Voiture::getMarque);

        // Trouver le min et le max
        Voiture minVoiture = Collections.min(Voitures, comparator);
        Voiture maxVoiture = Collections.max(Voitures, comparator);

        System.out.println("Min (Comparator) : " + minVoiture);
        System.out.println("Max (Comparator) : " + maxVoiture);
    }
}