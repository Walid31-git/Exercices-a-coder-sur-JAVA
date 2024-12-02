package Exo6;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<Escale> algeriastopover = Arrays.asList(
                new Escale("Marseille",300),
                new Escale("Alicante",500)
        );
        List<Escale> australiastopover = Arrays.asList(
                new Escale("London",500),
                new Escale("Emirates",2000)
        );
        List<Escale> indiastopover = Arrays.asList(
                new Escale("Franfort",800),
                new Escale("Emirates",2000),
                new Escale("Pune",1000)
        );
        List<Voyage> voyages = new ArrayList<>();
        voyages.add(new Voyage("Algeria",algeriastopover));
        voyages.add(new Voyage("Austalia",australiastopover));
        voyages.add(new Voyage("India",indiastopover));

        voyages.forEach((System.out::println));
        System.out.println(voyages.stream()
                .map(v -> v.getStopovers().stream().mapToInt(Escale::getNbKm).min())
                .toList());

    }
}
