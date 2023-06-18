public class EnumStringEx {
    public static void main(String[] args) {

        System.out.println(Animal.DOG.toString());

        //System.out.println(Animal.CAT.toString());
    }
}
enum Animal {
    CAT {
        public String toString() {

            return "Iam a cat,meow meow...!";
        }
    },
    DOG {
        public String toString() {

            return "Iam a dog,bow bow....!";
        }
    };
}
