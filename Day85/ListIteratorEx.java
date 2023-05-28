import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ListIteratorEx {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(20);

        list.add(40);

        list.add(60);

        list.add(80);

        ListIterator<Integer> listIterator = list.listIterator();

        while(listIterator.hasNext())

            System.out.print(listIterator.next()+"\t");

        System.out.println(" ");

        while (listIterator.hasPrevious())

            System.out.print(listIterator.previous()+"\t");
    }

}

