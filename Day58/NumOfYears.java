import java.time.LocalDate;

public class NumOfYears {

     public static void main(String args[]) {

         LocalDate today = LocalDate.now();

         LocalDate myBirthDay = LocalDate.of(2000,10,3);

         int years = today.getYear()-myBirthDay.getYear();
         
         //int months = today.getMonth()-myBirthDay.getMonth();
         
         //int days = today.getDay()-myBirthDay.getDay();

         System.out.println(years);
    }
}
