import java.text.NumberFormat;
import java.util.Scanner;
import java.util.NoSuchElementException;
public class MortgageCalculatorEx {
    public static void main(String[] args) {

        final  byte MONTHS_IN_YEAR=12;
        final  byte PERCENT=100;

        int principalAmount=(int)mortgageCal("Principal",1000,1000000000);

        float annualRate=(float)mortgageCal("Annual Interest",1,48);

        float monthlyRate=annualRate/PERCENT/MONTHS_IN_YEAR;

        byte years=(byte)mortgageCal("Time frame (in years)",1,30);

        short noOfPayments=(short)(years*MONTHS_IN_YEAR);

        double mortgage=principalAmount*(monthlyRate*Math.pow((1+monthlyRate),noOfPayments))/(Math.pow((1+monthlyRate),noOfPayments)-1);

        String formattedMonthlyAmount=NumberFormat.getInstance().format(mortgage);

        System.out.println("Monthly Amount:"+formattedMonthlyAmount);
    }
    public static double mortgageCal(String prompt,int min,int max) {

        Scanner sc = new Scanner(System.in);

        double amount;

        while(true){

            System.out.print(prompt + " : ");

            amount=sc.nextDouble();

            if (amount>=min&&amount<=max)
                break;
            System.out.println("Enter the value between "+min+" and "+max);
        }
        sc.close();

        return amount;
    }
}