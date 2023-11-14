import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(date);

        //aggiungi un anno
        date = date.plusYears(1);
        System.out.println("plus 1 year: " + date);

        //sottrai un mese
        date = date.minusMonths(1);
        System.out.println("Minus 1 month: " + date);

        //aggiungi 7 giorni
        date = date.plusDays(7);
        System.out.println("plus 7days: " + date);

        //Stampa il risultato localizzata per l'Italia
        String dataString = date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println("Risultato in Italiano: " + dataString);
    }
}