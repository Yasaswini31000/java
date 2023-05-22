public class StringBuilderEx {
    public static void  main(String[] args) {

        StringBuilder str = new StringBuilder("Hello java");

        System.out.println(str);

        str.append("\n welcome to");

        System.out.println(str);

        System.out.println(str.indexOf("j"));

        System.out.println(str.delete(0,4));

        str.append("\n programming world");

        System.out.println(str);

        System.out.println(str.capacity());

        str.delete(1,5);

        System.out.println(str);

        str.deleteCharAt(4);

        System.out.println(str);

        System.out.println(str.insert(0,"programming"));

        str.reverse();

        System.out.println(str);

        System.out.println(str.substring(0,5));

        System.out.println(str.toString());

    }
}

