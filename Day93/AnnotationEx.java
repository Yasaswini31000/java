public class AnnotationEx {
        public static void main(String[] args) {

        }
    }
    class Rock {

        void jack() {

            System.out.println("Hello Jack...!");

        }
    }
    class Jack extends Rock {

        @Override
        void jack() {

            super.jack();
        }

    }

