import javax.sound.midi.Soundbank;

enum Animal {
    LION,
    TIGER("TIGER"),
    PANTHER("PANTAR","PANTHER"),
    HORSE("HORSE","HORSLY");

    Animal() {
        System.out.println("select one animal :");
    }
    Animal(String str) {
        System.out.println("you choosen :" + str);
    }
    Animal(String str, String str1) {
        System.out.println("you choosed :" + str + " " + str1);
    }
    Animal(String str,String str1,String str2) {
        System.out.println("you choosen  :" + str + " " + str1 + " " + str2);
    }
}
public class ConstructorsUsingEnum {
    public static void main(String args[]) {

        var animal=Animal.TIGER;

        System.out.println(animal);
    }
}
