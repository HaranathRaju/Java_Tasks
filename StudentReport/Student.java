package StudentReport;

public class Student {
    String name;

    Subject [] subjects;

    Student (String name, Subject[] subjects) {
        this.name=name;
        this.subjects=subjects;
    }

    void displaysubjects() {
        for (Subject s: subjects) {
            s.displaysubject();
        }
    }
 


    

    
}
