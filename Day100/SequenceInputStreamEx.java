import java.io.*;

class SequenceInputStreamEx {
    public static void main(String[] args)throws Exception {

        FileInputStream fis1=new FileInputStream("hello.txt");

        FileInputStream fis2=new FileInputStream("Rock.txt");

        SequenceInputStream sis=new SequenceInputStream(fis1,fis2);

        int j;

        while((j=sis.read())!=-1) {

            System.out.print((char)j);
        }
        sis.close();

        fis1.close();

        fis2.close();
    }
}
