import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class NumberFormatEx1 {

    public static void main(String[] args) {

        NumberFormat nf=NumberFormat.getCurrencyInstance(new Locale("en","IN"));

        int amount=12345;

        String result=nf.format(amount);

        System.out.println(result);

    }

}
