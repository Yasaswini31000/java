import java.util.HashSet;
public class HashSetDupEx {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int arr[] = {5,7,4,9,6,7,3,4};
        System.out.println(arr.length);
        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
        System.out.println(set.size());
        //HashSet doesn't allow duplicates so,it removes duplicate values and prints remaining
    }
}
