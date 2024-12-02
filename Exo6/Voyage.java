package Exo6;

import java.util.List;

public class Voyage {
    private String name;
    private List<Escale> stopovers;

    public Voyage(String name, List<Escale> stopovers) {
        this.name = name;
        this.stopovers = stopovers;
    }

    public String getName() {
        return name;
    }

    public List<Escale> getStopovers() {
        return stopovers;
    }

    @Override
    public String toString() {
        return "Trip [name=" + name + ", stopovers=" + stopovers + "]";
    }
}
