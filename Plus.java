public class Plus extends Operacja_dwuargumentowa{
    @Override
    public double wylicz_wartość() throws BladWykonania {
        return argument1.wylicz_wartość() + argument2.wylicz_wartość();
    }

    public Plus(Instrukcja argument1, Instrukcja argument2) {
        super.argument1 = argument1;
        super.argument2 = argument2;
    }
}