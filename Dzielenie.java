public class Dzielenie extends Operacja_dwuargumentowa{
    @Override
    public double wylicz_wartość() throws BladWykonania {
        if (argument2.wylicz_wartość() == 0) {
            throw new Dzielenie_przez_zero();
        }
        return argument1.wylicz_wartość() / argument2.wylicz_wartość();
    }

    public Dzielenie(Instrukcja argument1, Instrukcja argument2) {
        super.argument1 = argument1;
        super.argument2 = argument2;
    }
}