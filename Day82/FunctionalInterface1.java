public class FunctionalInterface1 {
    public static void main(String[] args) {

        Sun s1 = new Sun() {

            @Override
            public void light() {

                System.out.println("Sun is the source of light");

            }
           /* void temp()
            {
              System.out.println("At summer the temperature reaches up  to 45 degrees");
            } */ //it is an anonymous functional Interface can't implement becz the sun is public

        };

        s1.light();

        //s1.temp();
    }
}
interface Sun {

    void light();

    //void temp();
}