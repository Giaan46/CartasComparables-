package tokioSchool.com;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public
class Mazo {
    private List<Carta> cartas;

    public Mazo(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public void ordenaNatural() {
        Collections.sort(cartas);
    }

    public void ordenaConComparator(Comparator<Carta> comparador) {
        Collections.sort(cartas, comparador);
    }

    @Override
    public String toString() {
        return cartas.toString();
    }
}
