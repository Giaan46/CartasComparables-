package tokioSchool.com;

public class Carta implements Comparable<Carta> {
    private String palo;
    private String numero;

    public Carta(String palo, String numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public int compareTo(Carta otraCarta) {
        int comparacionPalo = this.palo.compareTo(otraCarta.palo);
        if (comparacionPalo != 0) {
            return comparacionPalo;
        }
        return Integer.compare(getValorNumero(this.numero), getValorNumero(otraCarta.numero));
    }

    public int getValorNumero(String numero) {
        switch (numero) {
            case "AS":
                return 1;
            case "DOS":
                return 2;
            case "TRES":
                return 3;
            case "CUATRO":
                return 4;
            case "CINCO":
                return 5;
            // Agrega los demás casos según tus necesidades
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
}