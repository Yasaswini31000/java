import java.util.Arrays;

public class GenericsEx2 {
    public static void main(String[] args) {

        NumValues<Integer> num1 = new NumValues<>(246);

        NumValues<Float> num2 = new NumValues<>(53.04f);

        NumValues<Double> num3 = new NumValues<>(35467654.23456);

        System.out.println(num1);

        System.out.println(num2);

        System.out.println(num3);

    }

}

class NumValues<E>{

    E marks;

    NumValues(E e) {

        marks = e;
    }
    E getNumValues(){
        return this.marks;
    }
}

