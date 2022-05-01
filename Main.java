/**
 * Program bez funkcji toJava dla klasy Robson!
 *
 * Program wymaga biblioteki Moshi dostępnej w repozytorium Maven pod:
 * com.squareup.moshi:moshi
 * com.squareup.moshi:moshi-adapters
 *
 * Dodawanie zewnętrznych bibliotek do projektu opisane jest pod adresem:
 * https://www.jetbrains.com/help/idea/library.html#define-a-project-library
 */
import com.squareup.moshi.Moshi;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException, NieprawidlowyProgram, BladWykonania, Brak_programu {

        //Kod możenia 3 przez 5 algorytmem chłopów rosyjskich:

        Zmienna a = new Zmienna("a");
        Zmienna b = new Zmienna("b");
        Zmienna wynik = new Zmienna("wynik");
        Zmienna pom = new Zmienna("pom");

        ArrayList<Instrukcja> warunek_if = new ArrayList<>();
        warunek_if.add(new Przypisanie("pom",new Liczba(0.0)));
        warunek_if.add(new While(new Mniejszy(new Plus(pom, new Liczba(2.0)),b),new Przypisanie("pom", new Plus(pom,new Liczba(2.0)))));
        warunek_if.add(new If(new Równy(b,new Plus(pom, new Liczba(1.0))),new True(),new False()));

        Blok blok_if = new Blok(warunek_if);

        ArrayList<Instrukcja> while1 = new ArrayList<>();
        while1.add(new If(blok_if, new Przypisanie("wynik",new Plus(wynik,a))));
        while1.add(new Przypisanie("a", new Plus(a,a)));
        while1.add(new Przypisanie("pom",new Liczba(0.0)));
        while1.add(new While(new Mniejszy(new Plus(new Razy(new Liczba(2.0), pom), new Liczba(1.0)),b),new Przypisanie("pom", new Plus(pom,new Liczba(1.0)))));
        while1.add(new Przypisanie("b", pom));

        Blok blok_while = new Blok(while1);

        ArrayList<Instrukcja> lista = new ArrayList<>();
        lista.add(new Przypisanie("a", new Liczba(3.0)));
        lista.add(new Przypisanie("b", new Liczba(5.0)));
        lista.add(new Przypisanie("wynik", new Liczba(0.0)));
        lista.add(new While(new Większy(b, new Liczba(0.0)),blok_while));
        lista.add(wynik);

        Blok mnożenie_chłopów_rosyjskich = new Blok(lista);

        Robson robek = new Robson();
        robek.fromJSON("test.json"); // Kod w ROBSON algoytmu mnożenia chłopów rosyjskich w JSON (3 razy 5)
        if (robek.wykonaj() == 15) {
            System.out.println("dobrze");
        } else {
            System.out.println("źle");
        }
        robek.toJSON("wynik.json");
    }
}