public class If extends Instrukcja{
    private Instrukcja warunek;
    private Instrukcja blok_prawda;
    private Instrukcja blok_falsz;

    @Override
    public double wylicz_wartość() throws BladWykonania {
        if (warunek.wylicz_wartość() != 0) {
            return blok_prawda.wylicz_wartość();
        } else {
            if (blok_falsz != null) {
                return blok_falsz.wylicz_wartość();
            }
            else {
                return 0;
            }
        }
    }

    public If(Instrukcja warunek, Instrukcja blok_prawda, Instrukcja blok_falsz) {
        this.warunek = warunek;
        this.blok_prawda = blok_prawda;
        this.blok_falsz = blok_falsz;
    }

    public If(Instrukcja warunek, Instrukcja blok_prawda) {
        this.warunek = warunek;
        this.blok_prawda = blok_prawda;
        this.blok_falsz = null;
    }
}
