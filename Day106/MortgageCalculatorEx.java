import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MortgageCalculatorEx {
    Scanner sc=new Scanner(System.in);
    final byte  MONTHS_IN_YEAR=12;
    final byte PERCENT=100;
    int principal=0;
    float monthlyRate=0;
    short numberOfPayments;
    void mortgageCal()
    {
        while(true) {
            try {
                System.out.println("Enter principal: ");
                principal=sc.nextInt();
                if (principal>=1000&&principal<=1000000000)
                    break;
            } catch (InputMismatchException e) {
                System.out.println("Enter amount between 1000 to 1000000000");
                sc.next();
            }
        }
        while(true) {
            try {
                System.out.print("Annual interest rate : ");
                float yearlyRate=sc.nextFloat();
                if(yearlyRate>=1&&yearlyRate<=48) {
                    monthlyRate=yearlyRate/PERCENT/MONTHS_IN_YEAR;
                    break;
                }
                else {
                    System.out.println("enter interest rate between 1 to 48 percent ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter interest rate between 1 to 48 percent ");
                sc.next();
            }
        }
        while(true) {
            try {
                System.out.print("Time frame (in years): ");
                byte years=sc.nextByte();
                if (years>=1&&years<=10) {
                    numberOfPayments=(short)(years*MONTHS_IN_YEAR);
                    break;
                }
                System.out.println("Enter the time frame between 1 to 10 years");

            } catch (Exception e) {
                System.out.println("Enter the time frame between 1 to 10 years");
                sc.next();
            }
        }
        double mortgage=principal*(monthlyRate*Math.pow((1+monthlyRate),numberOfPayments))/(Math.pow((1+monthlyRate),numberOfPayments)-1);

        String formattedMonthlyAmount=NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage monthly: "+formattedMonthlyAmount);
    }
}
