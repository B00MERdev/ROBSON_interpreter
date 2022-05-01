import java.util.ArrayList;
import java.util.List;

public class Blok extends Instrukcja{
    private List<Instrukcja> instrukcje;

    @Override
    public double wylicz_wartość() throws BladWykonania {
        double wartość = 0;
        for (int i = 0; i < instrukcje.size(); i++) {
            wartość = instrukcje.get(i).wylicz_wartość();
        }
        return wartość;
    }

    public Blok(List<Instrukcja> instrukcje) {
        this.instrukcje = instrukcje;
    }
}
