class InstanceInitializerEx {
    public static void main(String[] args){

        Duck1 d1=new Duck1();
    }
}
class Duck1 {

    Duck1(){
        System.out.println("Constructor invoked");
    }
    {
        System.out.println("Initializer block");
    }
}

