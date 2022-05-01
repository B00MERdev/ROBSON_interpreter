public class While extends Instrukcja{
    private Instrukcja warunek;
    private Instrukcja blok;

    @Override
    public double wylicz_wartość() throws BladWykonania {
        while(warunek.wylicz_wartość() != 0.0) {
            blok.wylicz_wartość();
        }
        return 0;
    }

    public While(Instrukcja warunek, Instrukcja blok) {
        this.warunek = warunek;
        this.blok = blok;
    }
}
