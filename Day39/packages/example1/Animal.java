package example1;

public class Animal {
    public int gender;

    String order;
   public void setGender(int g)
    { 
        this.gender=g;
    }
   public int getGender(){
        return gender;
    } 
    public void gen(){
        System.out.println("there are two genders in every animal ");
    }

}
class Viviparus{
    static private String order="primates"; 
    private String family="hominidae"; 
    public static void main(String[] args)
    {
       System.out.println(order);
       Viviparus b1=new Viviparus();
       System.out.println(b1.family);
    }
}


