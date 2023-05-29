import java.util.Arrays;

import java.util.List;
public class GenericsSumEx {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(11,22,33,44,55);

        numbers(list);

    }
    public static void numbers(List<? extends  Number> n) {

        int sum = 0;

        for(Number x : n)

            sum += x.intValue();

        System.out.println(sum);
    }
}

