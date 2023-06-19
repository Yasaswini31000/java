public class AnonymousEx1 {
    public static void main(String[] args) {
        Greetings greet=new Greetings() {
            @Override
            public void greet1() {
                System.out.println("Greetings");
                greeting("Rocky");
            }
            public void greeting(String name){
                System.out.println("Hello... "+name);
            }
        };
        greet.greet1();
    }
}
interface Greetings {
    void greet1();
}
