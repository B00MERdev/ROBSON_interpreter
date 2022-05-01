public class And extends Operacja_dwuargumentowa{
    @Override
    public double wylicz_wartość() throws BladWykonania {
        return ((argument1.wylicz_wartość() != 0) && (argument2.wylicz_wartość() != 0)) ? 1 : 0;
    }

    public And(Instrukcja argument1, Instrukcja argument2) {
        super.argument1 = argument1;
        super.argument2 = argument2;
    }
}
