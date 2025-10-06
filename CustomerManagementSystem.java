import java.util.ArrayList;
import java.util.List;
class Policy {
    private int policyNumber;
    private String policyType;
    private double coverageAmount;
    public Policy(int policyNumber, String policyType, double coverageAmount) {
        this.policyNumber = policyNumber;
        this.policyType = policyType;
        this.coverageAmount = coverageAmount;
    }

    public int getPolicyNumber() { return policyNumber; }
    public String getPolicyType() { return policyType; }
    public double getCoverageAmount() { return coverageAmount; }

    @Override
    public String toString() {
        return "Policy No: " + policyNumber + ", Type: " + policyType + ", Coverage: ₹" + coverageAmount;
    }
}
class Customer {
    private int customerID;
    private String name;
    private String address;
    private String phoneNumber;
    private List<Policy> policies;

    public Customer(int customerID, String name, String address, String phoneNumber) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.policies = new ArrayList<>();
    }

    public int getCustomerID() { return customerID; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public List<Policy> getPolicies() { return policies; }

    public void setName(String name) { this.name = name; }
    public void setAddress(String address) { this.address = address; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public void addPolicy(Policy policy) {
        policies.add(policy);
        System.out.println("Policy added to customer " + name + ": " + policy);
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerID + ", Name: " + name + ", Address: " + address + ", Phone: " + phoneNumber;
    }
}

class CustomerManagement {
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer c) {
        customers.add(c);
        System.out.println("Customer added: " + c);
    }


    public void updateCustomer(int id, String newName, String newAddress, String newPhone) {
        for (Customer c : customers) {
            if (c.getCustomerID() == id) {
                c.setName(newName);
                c.setAddress(newAddress);
                c.setPhoneNumber(newPhone);
                System.out.println("Customer updated: " + c);
                return;
            }
        }
        System.out.println("Customer not found with ID: " + id);
    }
    public void getCustomerPolicies(int id) {
        for (Customer c : customers) {
            if (c.getCustomerID() == id) {
                List<Policy> policies = c.getPolicies();
                if (policies.isEmpty()) {
                    System.out.println("Customer " + c.getName() + " has no policies.");
                } else {
                    System.out.println("\n--- Policies of Customer " + c.getName() + " ---");
                    for (Policy p : policies) {
                        System.out.println(p);
                    }
                }
                return;
            }
        }
        System.out.println("Customer not found with ID: " + id);
    }
}

public class CustomerManagementSystem {
    public static void main(String[] args) {
        CustomerManagement cm = new CustomerManagement();
        Customer c1 = new Customer(1, "Alice", "123 Street", "9876543210");
        Customer c2 = new Customer(2, "Bob", "456 Avenue", "9123456780");

        cm.addCustomer(c1);
        cm.addCustomer(c2);
        c1.addPolicy(new Policy(101, "Life", 500000));
        c1.addPolicy(new Policy(102, "Health", 200000));
        c2.addPolicy(new Policy(103, "Auto", 150000));
        cm.getCustomerPolicies(1);
        cm.getCustomerPolicies(2);
        cm.updateCustomer(1, "Alice Johnson", "789 Boulevard", "9988776655");

        cm.getCustomerPolicies(1);
    }
}