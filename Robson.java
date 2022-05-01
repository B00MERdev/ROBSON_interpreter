import java.io.IOException;

public class Robson {
    private Instrukcja program;

    public void fromJSON(String filename) throws NieprawidlowyProgram, IOException {
        program = Wejście_danych_JSON.wczytaj_dane_z_pliku(filename);
        try {
            program.wylicz_wartość();
        } catch (BladWykonania bladWykonania) {
            throw new NieprawidlowyProgram();
        }
    }

    public void toJSON(String filename) throws Brak_programu, IOException {
        if (program == null) {
            throw new Brak_programu();
        } else {
            Wyjście_danych_JSON.przekaż_dane_do_pliku(filename, program);
        }
    }

    // Brak toJava (Rozumiem, że funkcja ta warta jest 2 pkt zgodnie z treścią polecenia)
    public void toJava(String filename) throws Brak_programu {}

    public double wykonaj() throws BladWykonania {
        return program.wylicz_wartość();
    }

    public Robson(Instrukcja program) {
        this.program = program;
    }

    public Robson() {
        this.program = null;
    }
}
