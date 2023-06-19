import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
public class NumberFormatEx2 {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        int amount=25000;
        System.out.println(nf.format(amount));

        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        amount = 10000;
        System.out.println(nf1.format(amount));

        for (var x : NumberFormat.getAvailableLocales())
            System.out.println(x);

        NumberFormat nf3=NumberFormat.getCurrencyInstance(new Locale("en", "CHINA"));
        System.out.println(nf3.format(amount));
        amount = 22000;
        String result1=nf3.format(amount);
        System.out.println(result1);

        for (var x : Currency.getAvailableCurrencies())
            System.out.println(x);

        String result = NumberFormat.getPercentInstance().format(1);
        System.out.println(result);

        String result2=NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result2);
    }
}