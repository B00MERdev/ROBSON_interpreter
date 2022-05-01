public class Liczba extends Instrukcja{
    private double wartosc;

    @Override
    public double wylicz_wartość() throws BladWykonania {
        return wartosc;
    }
    public Liczba(Double wartosc) {
        this.wartosc = wartosc;
    }
}
