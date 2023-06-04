public class LazySingletonPatternEx {
    public static void main(String[] args) {

        System.out.println(Rock.getInstance());

        System.out.println(Rock.getInstance());
        //only one instance is created because , when we call this method it will check the previous object reference and return that only.
    }
}
class Rock {
    private  static Rock myObj; //it contains null value as default.
    private Rock() {
    }
    public static Rock getInstance() {

        if(myObj == null) {

            myObj = new Rock();
        }
        return myObj;
    }
}
