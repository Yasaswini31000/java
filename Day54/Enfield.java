// program on IS-A relationship
import java.io.*;
public class Enfield extends Bike {
    public static void main(String args[]) {
         Bike b1 = new Bike();
         b1.setBikeName("Royal Enfield");
         System.out.println(b1.getBikeName());
    }
}
class Bike {
   private String bikeName;
   public void setBikeName(String bikeName)
   {
     this.bikeName=bikeName;
   }
   public String getBikeName()
   {
     return this.bikeName;
   }
}
