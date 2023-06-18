enum Animal1 {

    CAT("I m a Cat"),
    DOG("I am a Dog");


    private final String iamAnimal;
    private Animal1(String animal) {
        this.iamAnimal=animal;
    }

    public  String getiamAnimal() {
        return iamAnimal;
    }
}

public class EnumWithConstructorEx {
    public static void main(String[] args) {

        Animal1 a1=Animal1.DOG;

        System.out.println(a1.getiamAnimal());
    }
}
