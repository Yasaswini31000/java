import java.util.*;
public class CountOfElementsEx {
    public static void main(String[] args) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int arr[] = {4,3,6,2,6,3,5,9,0,1,3,6,7,6};

        for(int i = 0; i < arr.length; i++) {

            if(!map.containsKey(arr[i])) {

                map.put(arr[i], 1);
            }
            else {
                int preValue = map.get(arr[i]);

                map.put(arr[i],preValue+1);
            }
        }
        System.out.println(map);
    }
}
