package StudentCourseSystem;
class Student {
    private String name;
    private Course course1;
    private Course course2;
    private Course course3;

    public Student(String name, Course course1, Course course2, Course course3) {
        this.name = name;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }

    public String getName() {
        return name;
    }

    public void enrollAllCourses() {
        System.out.println("\n" + name + " enrolling in courses:");
        course1.enroll();
        course2.enroll();
        course3.enroll();
    }

    public void viewAllContents() {
        System.out.println("\n" + name + " viewing course contents:");
        course1.viewContent();
        course2.viewContent();
        course3.viewContent();
    }
}