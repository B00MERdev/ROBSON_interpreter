import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Wyjście_danych_JSON {
    public static void przekaż_dane_do_pliku(String fileName, Instrukcja instrukcja) throws IOException {
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
            String json = jsonAdapter.toJson(instrukcja);
            File plik_wyjściowy = new File(fileName);
            plik_wyjściowy.createNewFile();
            FileWriter wpisywacz = new FileWriter(fileName);
            wpisywacz.write(json);
            wpisywacz.close();
    }
}
