import java.util.BitSet;
public class BitSetOrEx {
    public static void main(String[] args) {

        BitSet bitset1 = new BitSet();

        BitSet bitset2 = new BitSet();

        bitset1.set(20);

        bitset1.set(40);

        bitset1.set(60);

        bitset2.set(10);

        bitset2.set(20);

        bitset2.set(30);

        System.out.println(bitset1);

        System.out.println(bitset2);

        bitset1.or(bitset2);

        System.out.println(bitset1);

        System.out.println(bitset1.cardinality());

        System.out.println(bitset2.cardinality());
    }
}

