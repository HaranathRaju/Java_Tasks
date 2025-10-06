package StudentCourseSystem;

abstract class Course {
    private String courseName;
    private String faculty;
    private double grade;      
    private int attendance;     

    public Course(String courseName, String faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
        this.grade = 0;
        this.attendance = 0;
    }
    public String getCourseName() {
        return courseName;
    }

    public String getFaculty() {
        return faculty;
    }

    public double getGrade() {
        return grade;
    }

    public int getAttendance() {
        return attendance;
    }
    protected void setGrade(double grade) {
        this.grade = grade;
    }
    protected void setAttendance(int attendance) {
        this.attendance = attendance;
    }
    public abstract void enroll();
    public abstract void viewContent();
}
