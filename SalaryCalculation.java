abstract class Employee {
    abstract double showsalary();
    abstract void display();
}
class Fulltime extends Employee {
    int id;
    String name;
    double salary;
    Fulltime(int id,String name,double salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    @Override
    double showsalary() {
        return salary;
    }
    @Override
    void display() {
        System.out.println("id :"+id+" name: "+name+" salary: "+salary);
    }
}
class Parttime extends Employee {
    int id;
    String name;
    double hours;
    double hourlyrate;
    Parttime(int id,String name ,int hours,double hourlyrate) {
        this.id=id;
        this.name=name;
        this.hours=hours;
        this.hourlyrate=hourlyrate;
    }
    @Override
    double showsalary() {
        return (hourlyrate*hours)*30;
    }
    @Override
    void display() {
        System.out.println("id :"+id+" name: "+name+" salary: "+(hourlyrate*hours)*30);
    }

}
class Contractor extends Employee {
    int id;
    String name;
    double salary;
    Contractor(int id,String name,double salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    @Override
    double showsalary () {
        return salary;
    }
    @Override
    void display() {
        System.out.println("id :"+id+" name: "+name+" salary: "+salary);
    }
}
public class SalaryCalculation {
    public static void main(String[] args) {
        Fulltime employee1=new Fulltime(101,"haranath",45000);
        Parttime employee2=new Parttime(102, "dheeraj", 10, 100);
        Contractor employee3=new Contractor(103,"tarun",60000);
        employee1.display();
        employee2.display();
        employee3.display();
        System.out.println(employee1.showsalary());
        System.out.println(employee2.showsalary());
        System.out.println(employee3.showsalary());
    }
}


