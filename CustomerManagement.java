import java.util.*;

class CustomerNotFoundException extends Exception {
    CustomerNotFoundException(String msg) {
        super(msg);
    }
}

class InvalidCustomerDataException extends RuntimeException {
    InvalidCustomerDataException(String msg) {
        super(msg);
    }
}

class Customer {
    String name;
    int id;

    Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

class CustomerManage {
    ArrayList<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer c) {
        if (c.name == null && c.name.trim().isEmpty()) {
            throw new InvalidCustomerDataException("customer name should not be empty");
        } else {
            customers.add(c);
            System.out.println("customer added: " + c);
        }
    }

    public void deleteCustomer(Customer c) {
        if (c.name == null && c.name.trim().isEmpty()) {
            throw new InvalidCustomerDataException("customer name should not be empty");
        } else {
            customers.remove(c);
            System.out.println("customer deleted " + c);
        }

    }

    public void checkCustomer(int id) throws CustomerNotFoundException {
        for (Customer c : customers) {
            if (c.id == id) {
                System.out.println(c);
                break;
            } else {
                throw new CustomerNotFoundException("customer not found");
            }

        }

    }

}

public class CustomerManagement {
    public static void main(String[] args) {
        Customer c1 = new Customer("tarun", 11);
        Customer c2 = new Customer("manoj", 22);
        Customer c3 = new Customer("yash", 33);

        CustomerManage cm = new CustomerManage();
        cm.addCustomer(c1);
        cm.addCustomer(c2);
        cm.addCustomer(c3);

        try {
            cm.deleteCustomer(c1);
            cm.checkCustomer(22);

        } catch (CustomerNotFoundException | InvalidCustomerDataException e) {
            System.out.println("Exception: " + e.getMessage());

        }

    }

}
