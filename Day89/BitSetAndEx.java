import java.util.BitSet;
public class BitSetAndEx {
    public static void main(String[] args) {

        BitSet bitset1 = new BitSet();

        BitSet bitset2 = new BitSet();

        bitset1.set(11);

        bitset1.set(22);

        bitset1.set(33);

        bitset2.set(10);

        bitset2.set(20);

        bitset2.set(33);

        System.out.println(bitset1);

        System.out.println(bitset2);

        bitset1.and(bitset2);

        System.out.println(bitset1);

        System.out.println(bitset1.cardinality());

        System.out.println(bitset2.cardinality());

    }
}
