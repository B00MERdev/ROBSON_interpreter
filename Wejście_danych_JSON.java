import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Wejście_danych_JSON {
    public static Instrukcja wczytaj_dane_z_pliku(String fileName) throws IOException {
        Moshi moshi = new Moshi.Builder()
                .add(
                        PolymorphicJsonAdapterFactory.of(Instrukcja.class, "typ")
                                .withSubtype(Blok.class, "Blok")
                                .withSubtype(If.class, "If")
                                .withSubtype(While.class, "While")
                                .withSubtype(Przypisanie.class, "Przypisanie")
                                .withSubtype(Plus.class, "Plus")
                                .withSubtype(Minus.class, "Minus")
                                .withSubtype(Razy.class, "Razy")
                                .withSubtype(Dzielenie.class, "Dzielenie")
                                .withSubtype(And.class, "And")
                                .withSubtype(Or.class, "Or")
                                .withSubtype(Mniejszy.class, "<")
                                .withSubtype(Mniejszy_równy.class, "<=")
                                .withSubtype(Większy.class, ">")
                                .withSubtype(Większy_równy.class, ">=")
                                .withSubtype(Równy.class, "==")
                                .withSubtype(Not.class, "Not")
                                .withSubtype(Liczba.class, "Liczba")
                                .withSubtype(True.class, "True")
                                .withSubtype(False.class, "False")
                                .withSubtype(Zmienna.class, "Zmienna")
                )
                .build();
        JsonAdapter<Instrukcja> jsonAdapter = moshi.adapter(Instrukcja.class);
        String dane_z_pliku = new String(Files.readAllBytes(Paths.get(fileName)));
        return jsonAdapter.fromJson(dane_z_pliku);
    }
}
