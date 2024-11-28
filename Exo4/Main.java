package Exo4;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        List<Employe> employees = new ArrayList<>();

        employees.add(new Employe("Gharbi", "Safia", 'F', 1.72));
        employees.add(new Employe("LeBron", "James", 'H', 2.06));
        employees.add(new Employe("Elqotbi", "Mehdi", 'H', 1.92));
        employees.add(new Employe("Gharbi", "Bilel", 'H', 1.85));
        employees.add(new Employe("Gharbi", "Aïcha", 'F', 1.73));

        System.out.println("Liste des employés");
        employees.forEach(System.out::println);

        System.out.println("------- Calcul --------");

        // Calcul pour homme
            OptionalDouble moyHommes = employees.stream()
                    .filter(e -> e.getGenre() == 'H')
                    .mapToDouble(Employe::getTaille)
                    .average();
        System.out.println("La Moyenne de taille pour hommes est de :"+moyHommes);

        // Calcul pour femmes
            OptionalDouble moyFemmes = employees.stream()
                    .filter(e -> e.getGenre() == 'F')
                    .mapToDouble(Employe::getTaille)
                    .average();
        System.out.println("La Moyenne de taille pour femmes est de :"+moyFemmes);


    }
}
