package tokioSchool.com;

import java.util.Comparator;

public class OrdenComparadorNumerosPalos implements Comparator<Carta> {
    @Override
    public int compare(Carta carta1, Carta carta2) {
        int comparacionNumeros = Integer.compare(carta1.getValorNumero(carta1.getNumero()), carta2.getValorNumero(carta2.getNumero()));
        if (comparacionNumeros != 0) {
            return comparacionNumeros;
        }
        return carta1.getPalo().compareTo(carta2.getPalo());
    }
}