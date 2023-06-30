import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
public class ArraysStreamEx {
    public static void main(String[] args) {

        int a1[] ={1,2,3,4,5};

        IntStream res1 = Arrays.stream(a1,1,4);

        res1.forEach(System.out::println);

        double a2[] = {3.5,6.12,2.76,5.6};

        DoubleStream res2 = Arrays.stream(a2,0,1);

        res2.forEach(System.out::println);

        long a3[] = {234556,876594,456789,123456};

        LongStream res3 = Arrays.stream(a3,0,2);

        res3.forEach(System.out::println);
    }
}