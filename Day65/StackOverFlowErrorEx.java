public class StackOverFlowErrorEx {

        static int i = 0;

        public static int printNumber (int x) {

            i = i + 3;

            //throws StackOverflowError

            if(i == 10)

                return i;

            return i + printNumber(i+2);
        }
        public static void main(String[] args) {

            System.out.println(StackOverFlowErrorEx.printNumber(i));

        }
}

