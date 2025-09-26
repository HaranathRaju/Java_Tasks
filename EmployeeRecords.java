import java.util.HashMap;
class Employee {
    int id;
    String name;
    String department;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    int getid() {
        return id;
    }
    String getname() {
        return name;
    }

    String getdepartment() {
        return department;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department;
    }
}

public class EmployeeRecords {
    Employee emp;
    private HashMap<Integer, Employee> employees = new HashMap<>();

    public void addemployee(Employee emp) {
        employees.put(emp.getid(), emp);
        System.out.println("employee added: " + emp.getname());
    }

    public void searchemployee(int id) {
        if (employees.containsKey(id)) {
            System.out.println("found" + employees.get(id));
        } else {
            System.out.println("not found");
        }
    }
    public void display() {
        for (Employee emp : employees.values()) {
            System.out.println(emp);
        }
    }

    public static void main(String[] args) {
        EmployeeRecords e = new EmployeeRecords();
        Employee e1 = new Employee(1, "tarun", "developer");
        Employee e2 = new Employee(2, "manoj", "tester");
        Employee e3 = new Employee(3, "rahul", "manager");
        e.addemployee(e1);
        e.addemployee(e2);
        e.addemployee(e3);
        e.searchemployee(2);
        e.display();
    }
}

