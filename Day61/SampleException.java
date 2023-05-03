import java.util.Scanner;

public class SampleException {

    public static void main(String args[]) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("salary : ");
        
        try {
        
            float num = sc.nextFloat();
            
            System.out.println(num);
            
        }
        
        catch(Exception e) {
        
            System.out.println(e);
            
        }
        
        System.out.println("Role : Manager");
        
        sc.close();
    }
}
