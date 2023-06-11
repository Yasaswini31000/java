/**
 * author James
 */
public class Student {
    String name;
    /**
     * @param name student
     */
    Student(String name) {
        this.name=name;
    }

    /**
     * issue is card to student
     * @param regNo enter a registration number.
     * throws an exception if we entered invalid register number
     */
    public void getIdCard(int regNo) throws Exception {

    }
    /**
     *
     * @param str pass the details
     * @return returns scholarship is available or not
     */
    boolean HasScholarship(String str) {
        return true;
    }
    /**
     * student details
     * @param regNo student registration number
     * @return returns the student name
     */
    public String getName(int regNo) {
        return name;
    }
}
