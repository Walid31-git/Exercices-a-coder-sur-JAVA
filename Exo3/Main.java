package Exo3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Employe> Employes = new TreeMap<>();
        Employes.put(900001, new Employe(900001, "Russel", "YOSSOV", "Yossovr@gmail.com"));
        Employes.put(900002, new Employe(900002, "Alice", "BENJAMIN", "alice.benjamin@exemple.fr"));
        Employes.put(900003, new Employe(900003, "Sami", "KHOUAIB", "sami.khouaib@exemple.dz"));
        Employes.put(900004, new Employe(900004, "Maya", "MARTIN", "maya.martin@exemple.fr"));
        Employes.put(900005, new Employe(900005, "Karim", "BELHADJ", "karim.belhadj@exemple.dz"));


        Employes.entrySet().forEach(e -> System.out.println(e));
        System.out.println("----------- EN gardant que le .fr -------");
        Employes.entrySet().forEach(e -> {
            if (e.getValue().getMail().contains(".fr")) {
                System.out.println(e);
            }
        });
    }
}
