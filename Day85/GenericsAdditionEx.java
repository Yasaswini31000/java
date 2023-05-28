class Addition {
    public <N extends Number> double add(N first, N second) {

        return first.doubleValue() + second.doubleValue();
    }
}
public class GenericsAdditionEx {
    public static void main(String[] args) {

        Addition add1 = new Addition();

        System.out.println(add1.add(33,66));

        System.out.println(add1.add(11444.4532,10432.3422));

        System.out.println(add1.add(45.45f, 54.54f));
    }
}


