enum Months {
    JANUARY,
    MARCH,
    MAY,
    JULY,
    SEPTEMBER,
    OCTOBER,
    DECEMBER
}
public class EnumInMultipleClasses {
    public static void main(String args[]) {

        Months month = Months.MAY;

        System.out.println(month);
    }
}
class PrintMonth{

       Months month = Months.OCTOBER;
    
}
