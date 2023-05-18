import java.util.*;
class HashMapEx2 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Hello");

        map.put(102, "World");

        map.put(103, "Welcome");

        System.out.println(map);

        map.put(103, "To Java");

        System.out.println(map);

        map.remove(102);

        System.out.println(map);

        for(Map.Entry<Integer, String> e : map.entrySet())

            System.out.println(e.getKey()+" : "+ e.getValue());

        System.out.println(map.get(101));

        System.out.println(map.isEmpty());

        System.out.println(map.keySet());

        System.out.println(map.size());

        System.out.println(map.values());

        HashMap<Integer, String> map1 = new HashMap<>();

        map1.put(101, "Hello");

        map1.put(103, "To Java");

        System.out.println(map.equals(map1));

        map1.put(102, "World");

        System.out.println(map.equals(map1));

    }
}
