package tokioSchool.com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Carta> cartas = new ArrayList<>();

        cartas.add(new Carta("OROS", "AS"));
        cartas.add(new Carta("COPAS", "AS"));
        cartas.add(new Carta("ESPADAS", "CINCO"));
        cartas.add(new Carta("OROS", "CUATRO"));
        cartas.add(new Carta("ESPADAS", "AS"));
        cartas.add(new Carta("BASTOS", "AS"));
        cartas.add(new Carta("ESPADAS", "TRES"));
        Mazo mazo = new Mazo(cartas);

        System.out.println("Mazo sin ordenar: " + mazo);

        // Ordenar según el orden natural de las cartas
        mazo.ordenaNatural();
        System.out.println("Mazo ordenado por orden natural: " + mazo);

        // Crear comparador para ordenar primero por números ascendentes y luego por palos
        Comparator<Carta> comparadorNumerosPalos = new OrdenComparadorNumerosPalos();

        // Ordenar usando el comparador personalizado
        mazo.ordenaConComparator(comparadorNumerosPalos);
        System.out.println("Mazo ordenado por números ascendentes y luego por palos: " + mazo);
        System.out.println("Ahora si!  =)");
    }
}
