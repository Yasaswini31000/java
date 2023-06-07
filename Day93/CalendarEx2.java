import java.util.Calendar;
public class CalendarEx2 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);// to get current year

        System.out.println("Current Year: " + year);

        calendar.set(Calendar.MONTH, Calendar.JULY);

        int month = calendar.get(Calendar.MONTH);

        System.out.println("Updated Month: " + month);

        calendar.add(Calendar.DAY_OF_MONTH, 5);

        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("Updated Day: " + day);

    }
}
