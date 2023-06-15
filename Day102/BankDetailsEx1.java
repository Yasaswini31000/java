import java.io.*;
import java.io.DataOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
public class BankDetailsEx1 {
    public static void main(String[] args) throws Exception {

       FileInputStream fis = new FileInputStream("Jack.txt");

        DataInputStream dis = new DataInputStream(fis);

        SBI ravi = new SBI(dis.readUTF());

        ravi.setBalance(dis.readDouble());

        ravi.setMinbalance(dis.readInt());

        System.out.println(ravi.getName());

        System.out.println(ravi.getBalance());

        System.out.println(ravi.getMinbalance());

        FileOutputStream fos = new FileOutputStream("Jack.txt");

        DataOutputStream dos = new DataOutputStream(fos);

        SBI sbi = new SBI("Ravi");

        sbi.setBalance(100000);

        sbi.setMinbalance(500);

        dos.writeUTF(sbi.getName());

        dos.writeDouble(sbi.getBalance());

        dos.writeInt(sbi.getMinbalance());

    }
}
