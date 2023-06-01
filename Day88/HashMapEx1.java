import java.util.HashMap;
public class HashMapEx1{
    static HashMap<Integer, Boolean> map = new HashMap<>();
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            map.put(i, true);
        }
        map.put(8, false);

        map.put(10, false);

        map.put(10, true);

        map.put(12, !(map.get(21)));

        map.put(81, !(map.get(18)));

        map.put(56, !(map.get(65)));

        System.out.println("Players ready: " + getPlayersReady());
    }
    static boolean negation(boolean prevState) {
        return !prevState;
    }
    static int getPlayersReady() {
        int count = 0;
        for(var x : map.values()) {
            if(x)
                count++;
        }
        return count;
    }
}
