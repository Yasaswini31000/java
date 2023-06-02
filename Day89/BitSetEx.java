
import java.util.BitSet;

public class BitSetEx {
    public static void main(String[] args) {

        BitSet players = new BitSet();

        players.set(0,40,true);

        System.out.println(players.get(3));

        players.clear(4);

        System.out.println(players.get(5));

        System.out.println(players);

        System.out.println(players.length());

        System.out.println(players.size());

        BitSet players2 = new BitSet();

        players2.set(0,108,true);

        System.out.println(players2.size());

        System.out.println(players2.length());


    }
}