import java.util.HashMap;

public class Przypisanie extends Instrukcja{
    private String nazwa;
    private Instrukcja wartosc;

    @Override
    public double wylicz_wartość() throws BladWykonania {
        HashMap<String, Double> mapa_wartości_zmiennych = Zmienna.getMapa_wartości_zmiennych();
        if (!mapa_wartości_zmiennych.containsKey(nazwa)) {
            new Zmienna(nazwa);
        }
        double war = wartosc.wylicz_wartość();
        mapa_wartości_zmiennych.replace(nazwa, war);
        Zmienna.setMapa_wartości_zmiennych(mapa_wartości_zmiennych);
        return war;
    }

    public Przypisanie(String nazwa, Instrukcja wartosc) {
        this.nazwa = nazwa;
        this.wartosc = wartosc;
    }
}
