package StudentCourseSystem;

class Math extends Course {
    public Math(String faculty) {
        super("Math", faculty);
    }
    @Override
    public void enroll() {
        System.out.println("Enrolled in Math under " + getFaculty());
        setAttendance(0);
        setGrade(0);
    }

    @Override
    public void viewContent() {
        System.out.println("Math Content: Algebra, Calculus, Geometry");
    }
}
class Physics extends Course {
    public Physics(String faculty) {
        super("Physics", faculty);
    }

    @Override
    public void enroll() {
        System.out.println("Enrolled in Physics under " + getFaculty());
        setAttendance(0);
        setGrade(0);
    }

    @Override
    public void viewContent() {
        System.out.println("Physics Content: Mechanics, Thermodynamics, Optics");
    }
}

class History extends Course {
    public History(String faculty) {
        super("History", faculty);
    }

    @Override
    public void enroll() {
        System.out.println("Enrolled in History under " + getFaculty());
        setAttendance(0);
        setGrade(0);
    }

    @Override
    public void viewContent() {
        System.out.println("History Content: Ancient, Medieval, Modern History");
    }
}
