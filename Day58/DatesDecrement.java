import java.time.LocalDate;

public class DatesDecrement {
    
    public static void main(String args[]) {

        LocalDate today = LocalDate.now();

        System.out.println(today.minusYears(2));

        System.out.println(today.minusMonths(2));

        System.out.println(today.minusDays(2));
    }
}
