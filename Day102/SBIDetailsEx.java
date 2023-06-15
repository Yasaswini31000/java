import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.DataOutputStream;
import java.io.DataInputStream;

public class SBIDetailsEx {
    public static void main(String[] args) throws FileNotFoundException {

        SBI sbi = new SBI("Ravi");
        sbi.setBalance(100000);
        sbi.setMinbalance(500);
        System.out.println(sbi.getName());
        System.out.println(sbi.getBalance());
        System.out.println(sbi.getMinbalance());

        FileOutputStream fos = new FileOutputStream("Jack.txt");
        PrintStream ps = new PrintStream(fos);
        SBI ravi = new SBI("Rocky");
        ravi.setBalance(200000);
        ravi.setMinbalance(500);
        ps.println(ravi.getName());
        ps.println(ravi.getBalance());
        ps.println(ravi.getMinbalance());
    }
}
class SBI {
    String name;

    SBI() {
    }

    SBI(String name) {
        this.name = name;
    }

    double balance;
    int min;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getMinbalance() {
        return min;
    }

    public void setMinbalance(int min) {
        this.min = min;
    }
}
