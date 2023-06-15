import java.io.*;

public class BankDetailsEx {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("Jack.txt");

        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        SBI sbi = new SBI(br.readLine());

        sbi.setBalance(Double.parseDouble(br.readLine()));

        sbi.setMinbalance(Integer.parseInt(br.readLine()));

        System.out.println(sbi.getName());

        System.out.println(sbi.getBalance());

        System.out.println(sbi.getMinbalance());

    }
}
