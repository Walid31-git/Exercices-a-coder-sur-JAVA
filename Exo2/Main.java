package Exo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        List<Animal> animaux = new ArrayList<>();
        animaux.add(new Animal("Mouton", 99, "brun", "bêlement"));
        animaux.add(new Animal("Chat", 4, "roux", "miaulement"));
        animaux.add(new Animal("Vache", 620, "beige", "beuglement"));
        animaux.add(new Animal("Chien", 30, "blanc", "aboiement"));
        animaux.forEach(System.out::println);
        System.out.println("------- Avec Lambda -------");
        animaux.forEach(Animal::afficherDetails);

        Animal plusLourd = Collections.max(animaux, Comparator.comparingInt(Animal::getPoid));
        Animal plusLeger = Collections.min(animaux, Comparator.comparingInt(Animal::getPoid));

        System.out.println("L'animal le plus lourd est : " + plusLourd.afficherDetails2());

        System.out.println("L'animal le plus Leger est : "+plusLeger.afficherDetails2());


    }
}
