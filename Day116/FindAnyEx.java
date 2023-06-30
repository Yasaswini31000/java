import java.util.*;
class FindAnyEx {
    public static void main(String[] args)
    {
        List<Integer> list=Arrays.asList(2,4,6,8,10,12);

        Optional<Integer> res=list.stream().findAny();

        if(res.isPresent()) // if the stream is empty, an empty Optional is returned.
        {
            System.out.println(res.get());
        }
        else {

            System.out.println("null");
        }
    }
}
