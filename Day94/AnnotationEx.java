class Student {
    void helloJava() {

        System.out.println("Hello java");

    }

}

class Hello extends Student {
    @Override
    void helloJava() {

        super.helloJava();

    }

}
