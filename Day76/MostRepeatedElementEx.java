import java.util.*;

public class MostRepeatedElementEx {
    public static void main(String[] args) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int arr[] = {4,8,2,9,1,5,7,3,0,2,6,8,2,4,5};

        for(int i = 0;i < arr.length; i++) {

            if(!map.containsKey(arr[i])) {

                map.put(arr[i],1);
            }
            else {

                int preValue = map.get(arr[i]);

                map.put(arr[i],preValue+1);
            }
        }

        int count = -1, key= -1;

        for(var x : map.entrySet()) {

            if(x.getValue()>count) {

                count = x.getValue();

                key = x.getKey();
            }
        }

        System.out.println(key);
    }
}
