import java.util.*;

class VectorEx {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<Integer>();

        //int arr[] = new int[6];

        v.add(10);

        v.add(20);

        v.add(30);

        v.add(40);

        v.add(50);

        System.out.println(v);

        v.remove((Object)20);

        System.out.println(v);

        v.insertElementAt(60, 3);

        System.out.println(v);
    }
}
