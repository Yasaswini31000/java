import java.util.HashSet;
public class HashSetEx {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains(30));
        System.out.println(set.isEmpty());
        set.remove(40);
        System.out.println(set);
        set.clear();
        System.out.println(set);
    }
}