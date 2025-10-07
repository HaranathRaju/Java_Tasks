package StudentReport;

public class ReportCard {

    Student st;

    public ReportCard(Student st) {
        this.st=st;
    }
    
    public int calctotal() {
        int total=0;
        for (int i=0;i<st.subjects.length;i++) {
            total+=st.subjects[i].getMarks();
        }
        return total;
    }

    double  calcaverage() {
        return calctotal()/st.subjects.length;
    }

    void grade() {
        if (calctotal()>350) {
            System.out.println("A");
        } else if (calctotal()>300) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
