public class PassCode {
   public static void main(String args[]) {
       Lock l1 = new Lock();
       boolean result = l1.checkPassCode(0001);
       System.out.println(result);
   }
}
class Lock {
    int passcode = 9999;
    boolean checkPassCode(int mycode) {
        if(passcode==mycode)
            return true;
        return false;
    }
}
