package finalkeyword;

public class Student {

    final int rollNo;
    final String name;

    public Student() {
        name= "anuj";
        rollNo=4;
    }

    public void getDescription() {
        System.out.print("The student has name "+name+" roll no "+rollNo);
    }
}
