public class BigIntegerSum {
    public static void main(String args[]) {
        BigIntegerExample b1 = new BigIntegerExample("246813579");
        BigIntegerExample b2 = new BigIntegerExample("123456789");
        String sum = BigIntegerExample.addNums(b1,b2);
        System.out.println(sum); 
    }
}
class BigIntegerExample {
    String value;
    BigIntegerExample(String str) {
        this.value = str;
    }
    public static String addNums(BigIntegerExample a,BigIntegerExample b) {
        String b1 = a.value;
        String b2 = b.value;
        int carry = 0;
        String sum = "";
        int i,j;
        for(i = b1.length()-1,j = b2.length()-1;i>-1&&j>-1;i--,j--) {
            int temp = Integer.parseInt(String.valueOf(b1.charAt(i)))+Integer.parseInt(String.valueOf(b2.charAt(j)))+carry;
            sum += temp%10;
            carry = temp/10;
        }
        while(i>-1) {
            int temp = Integer.parseInt(String.valueOf(b1.charAt(i)))+carry;
            sum += temp%10;
            carry = temp/10;
            i--;
        }
        while(j>-1) {
            int temp = Integer.parseInt(String.valueOf(b2.charAt(j)))+carry;
            sum +=temp%10;
            carry = temp/10;
            j--;
        }
        if(carry>0)
        sum += carry;
        String res="";
        for(var x:sum.toCharArray()) {
            res = x+res;
        }
        return res;
    }
}

