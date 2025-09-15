package strings;

import java.util.Locale;

public class StringFormat {
    public static void main(String args[]){

        String product = "Laptops";
        String formatted = String.format("Available product: %s", product);
        System.out.println(formatted);

        //using Locale
        Locale userLocale = Locale.GERMANY;
        int stock = 54321;
        String localized = String.format(userLocale,"We have %,d units in stock.",stock);
        System.out.println(localized);
    }
}
