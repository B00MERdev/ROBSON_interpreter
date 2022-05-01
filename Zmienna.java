import java.util.HashMap;

public class Zmienna extends Instrukcja{
    private final String nazwa;
    private static HashMap<String, Double> mapa_wartości_zmiennych = new HashMap<>();

    public static HashMap<String, Double> getMapa_wartości_zmiennych() {
        return mapa_wartości_zmiennych;
    }

    public static void setMapa_wartości_zmiennych(HashMap<String, Double> mapa_wartości) {
        Zmienna.mapa_wartości_zmiennych = mapa_wartości;
    }

    @Override
    public double wylicz_wartość() throws BladWykonania {
        return mapa_wartości_zmiennych.get(nazwa);
    }

    public Zmienna(String nazwa) {
        this.nazwa = nazwa;
        if (!mapa_wartości_zmiennych.containsKey(nazwa)) {
            mapa_wartości_zmiennych.put(nazwa, (double)0);
        }
    }
}
