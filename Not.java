public class Not extends Instrukcja{
    private Instrukcja argument;
    @Override
    public double wylicz_wartość() throws BladWykonania {
        return (argument.wylicz_wartość() != 0) ? 0 : 1;
    }
}
