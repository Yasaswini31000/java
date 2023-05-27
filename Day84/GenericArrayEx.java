import java.util.Arrays;

public class GenericArrayEx {
    public static void main(String[] args) {

        Numbers<String> numbers = new Numbers<>();

        numbers.addNumbers(0,"Zero");

        numbers.addNumbers(1,"One");

        numbers.addNumbers(2,"Two");

        numbers.addNumbers(3,"Three");

        numbers.addNumbers(4,"Four");

        numbers.addNumbers(5,"Five");

        System.out.println(numbers);
    }

}

class Numbers<w> {

    Object[] words;

    public Numbers() {

        words = new Object[7];
    }
    void addNumbers(int index,w Word) {

        words[index] = Word;
    }

    @Override
    public String toString() {

        return Arrays.toString(words);
    }
}
