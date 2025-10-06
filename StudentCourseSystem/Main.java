package StudentCourseSystem;

public class Main {
    public static void main(String[] args) {
        Course math = new Math("Dr. Smith");
        Course physics = new Physics("Dr. Johnson");
        Course history = new History("Dr. Williams");
        Student student = new Student("Alice", math, physics, history);

        student.enrollAllCourses();
        student.viewAllContents();
    }
}
