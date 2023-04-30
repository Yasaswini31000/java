import java.time.LocalDate;
public class DatesIncrement {
    public static void main(String args[]) {
        LocalDate today = LocalDate.now();
        System.out.println(today.plusYears(2));
        System.out.println(today.plusMonths(2));
        System.out.println(today.plusDays(2));
    }
}
