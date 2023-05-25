public class LambdaSumEx {
    public static void main(String[] args) {

        Sum res = (x,y) -> {

            System.out.println(x+y);

        };

        res.sum(33,55);
    }
}

interface Sum {
    void sum(int x, int y);
}

