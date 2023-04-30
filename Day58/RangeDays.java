import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

public class RangeDays {

    public static void main(String args[]) {

        LocalDate date = LocalDate.of(2022,4,5);

        var numberOfDays = ChronoUnit.DAYS.between(date,LocalDate.now());

        System.out.println(numberOfDays);
    }
}
