public class PassCodeRandom {
   public static void main(String args[]) {
       Lock l1 = new Lock();
       for(int i=1000;i<10000;i++) {
           if(l1.checkPassCode(i))
               System.out.print("key :"+i);
       }
   }
}
class Lock {
    int passcode = (int)Math.floor((Math.random()*9000.0 + 1000.0));
    boolean checkPassCode(int mycode) {
        if(passcode==mycode)
            return true;
        return false;
    }
}
