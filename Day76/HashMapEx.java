import java.util.*;
public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int arr[] = {1,3,5,7,9,11};
        int target = 6;
        HashMap<Integer,String> set = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            set.put(arr[i],"x");
        }
            for(var x : map.keySet()) {
                int cur = x;
                int reqTarget = target - cur;
                if(map.containsKey(reqTarget))
                    System.out.println(x +" + "+reqTarget+" = "+target);
            }
    }
}
