package StudentReport;

public class Subject {
    String name;
    private int marks;
    Subject(String name,int marks) {
        this.name=name;
        this.marks=marks;
    }
    public int getMarks() {
        return marks;
    }

    void displaysubject() {
        System.out.println("name: "+name+" marks :"+marks);
    }
}

