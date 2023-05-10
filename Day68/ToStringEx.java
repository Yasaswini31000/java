public class ToStringEx {

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
    public ToStringEx(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {

        ToStringEx str = new ToStringEx(1, "java");

        System.out.println(str.toString());
    }
    public String toString() {

        return id+" "+name;
    }


}
