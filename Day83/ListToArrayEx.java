import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ListToArrayEx {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);

        list.add(20);

        list.add(30);

        list.add(40);

        list.add(50);

        Object[] arr = list.toArray();

        System.out.println(Arrays.toString(arr));
    }
}
