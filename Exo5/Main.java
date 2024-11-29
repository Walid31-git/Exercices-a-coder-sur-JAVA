package Exo5;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Predicate;



public class Main {
    public static void main(String[] args) {
        List<Animal> animaux = new ArrayList<>();
        animaux.add(new Animal("sheep", "brown", "bleating", 100.0));
        animaux.add(new Animal("cow", "mahogany", "moo", 720.0));
        animaux.add(new Animal("dog", "black", "barking", 40.0));
        animaux.add(new Animal("cat", "white", "miaowing", 4.5));
        animaux.add(new Animal("mouse", "grey", "tickle", 0.04));

        System.out.println("Liste des animaux :");
        animaux.forEach(System.out::println);
        System.out.println("Liste des animaux qui commencent par 'C' :");
        animaux.stream()
                .filter(e -> e.getNom().startsWith("c"))
                .sorted(Comparator.comparing(Animal::getNom))
                .forEach(e -> System.out.println(e.getNom()));
        System.out.println("Nom des animaux < 30 kg");
        String[] nomsAnimaux = animaux.stream()
                .filter(a -> a.getPoids() < 30)
                .map(a -> a.getNom())
                .toArray(String[] :: new);
        System.out.println(Arrays.toString(nomsAnimaux));
        System.out.println("Nom des animaux dont la couleur commence par 'B' : ");
        String separer =  animaux.stream()
                .filter(b -> b.getCouleur().startsWith("b"))
                .map(a -> a.getNom())
                .collect(Collectors.joining("|"));
        System.out.println(separer);

    }
}
