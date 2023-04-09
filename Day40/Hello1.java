package example1.pack1;

public class Hello1 {
    private int phno=23456;
    protected String device="Redmi Note 9 Pro Max";

    void Mobile()
    {
        String storage="54GB";
        String version="MIUI 12.5.6 Stable";
        String color="Aqua Blue";

    }
    public void run(){
        System.out.println("This is a MI phone");
    }
    public void setCompany(int m1)
    { 
        this.phno=m1;
    }
   public int getCompany()
   {
        return phno;
   }
   public static void main(String[] args)
    {
       Mobile m1=new Mobile();
       System.out.println(m1.version);
       System.out.println(m1.storage);
       System.out.println(m1.device);
       System.out.println(m1.color);
    }
}

