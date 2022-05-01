public class Większy extends Operacja_dwuargumentowa{
    @Override
    public double wylicz_wartość() throws BladWykonania {
        return (argument1.wylicz_wartość() > argument2.wylicz_wartość()) ? 1 : 0;
    }

    public Większy(Instrukcja argument1, Instrukcja argument2) {
        super.argument1 = argument1;
        super.argument2 = argument2;
    }
}
