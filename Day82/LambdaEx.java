public class LambdaEx {

    public static void main(String[] args) {

        Animal an =() -> {

            System.out.println("An animalE can eat either meat or grass");

        };

        an.Carnivore();
    }
}

interface Animal {

    void Carnivore();

}

