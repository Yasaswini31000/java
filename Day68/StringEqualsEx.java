public class StringEqualsEx {
        private int id;
        private String name;

        public int getId() {

            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {

            return name;
        }

        public void setName(String name) {

            this.name = name;
        }

        public StringEqualsEx(int id, String name) {
            super();
            this.id = id;
            this.name = name;
        }
    public static void main(String[] args) {
        String str="java";
        String str2= new String("java");
        System.out.println(str==str2);
        System.out.println(str.equals(str2));
        
    }
}
