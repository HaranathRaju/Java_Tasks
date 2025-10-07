package StudentReport;
public class Main {
    public static void main(String[] args) {
        Subject s1=new Subject("maths", 90);
        Subject s2=new Subject("science", 85);
        Subject s3=new Subject("telugu", 65);
        Subject s4=new Subject("hindi", 55);

        Subject [] subjects={s1,s2,s3,s4};

        Student student=new Student("hara", subjects);
        student.displaysubjects();
        ReportCard rc=new ReportCard(student);
        System.out.print("total marks are : ");
        System.out.println(rc.calctotal());
        System.out.print("average is: ");
        System.out.println(rc.calcaverage());
        rc.grade();
    }
    
}
