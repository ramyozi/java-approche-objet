package dates;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DateFormatSymbols;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2023, Calendar.MAY, 19, 23, 59, 30);

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date du 19 mai 2023 à 23h59:30 : " + sdf1.format(calendar1.getTime()));

        Calendar calendar2 = Calendar.getInstance();

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("Date/heure système : " + sdf2.format(calendar2.getTime()));

        displayWithLocalizedNames(calendar2, Locale.FRENCH);
        displayWithLocalizedNames(calendar2, new Locale("ru", "RU")); // Russian
        displayWithLocalizedNames(calendar2, Locale.CHINESE);
        displayWithLocalizedNames(calendar2, Locale.GERMAN);
    }

    private static void displayWithLocalizedNames(Calendar calendar, Locale locale) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm:ss", locale);
        DateFormatSymbols symbols = new DateFormatSymbols(locale);
        sdf.setDateFormatSymbols(symbols);
        System.out.println("Date/heure système (" + locale.getDisplayName() + ") : " + sdf.format(calendar.getTime()));
    }
}
