//private access modifiers
public class Private 
{
private String color = "black";
private String breed = "lab";
private String size = "large";
private int age = 2;
public static void main(String args[]) 
{
Private myObj = new Private();
System.out.println("Color: " + myObj.color);
System.out.println("Size: " + myObj.size);
System.out.println("Breed: " + myObj.breed);
System.out.println("Age: " + myObj.age);
}
}

