package accessspecifier;

public class Student {

    String name;



    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getPassword() {
        return "ioplop";
    }
}
