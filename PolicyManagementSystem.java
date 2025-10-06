import java.util.*;

class Policy {
    private int policyno;
    private String holdername;
    private String policytype;
    private double coverageamount;

    public Policy(int policyno, String holdername, String policytype,double coverageamount) {
        this.policyno=policyno;
        this.holdername=holdername;
        this.policytype=policytype;
        this.coverageamount=coverageamount;
        
    }

    public int getPolicyno() {
        return policyno;
    }
    public String getHoldername() {
        return holdername;
    }
    public String getPolicytype() {
        return policytype;
    }
    public double getCoverageamount() {
        return coverageamount;
    }
    public void setHoldername(String name) {
        this.holdername=name;
        
    }
    public void setPolicytype(String s) {
        this.policytype=s;
    }
    public void setCoverageamount(double amount) {
        this.coverageamount=amount;
    }
    @Override
    public String toString() {
        return "Policy number : "+policyno+" Policyholdername: "+holdername+"policy type :" +policytype+ "coverageamount:" +coverageamount;
    }

}
class PolicyManagement {
    ArrayList<Policy> policies =new ArrayList<>();

    public void addPolicy(Policy p) {
        policies.add(p);
    }

    public void updatePolicy(int id,String name,String type,double amount) {
        for (Policy p:policies) {
            if (id==p.getPolicyno()) {
                p.setHoldername(name);
                p.setPolicytype(type);
                p.setCoverageamount(amount);
            }
        }
    }

    public void deletePolicy(int id) {

        Iterator<Policy> it=policies.iterator();
        while (it.hasNext()) {
            Policy p=it.next();
            if (p.getPolicyno()==id) {
                it.remove();
            }
        }
    }

    public void display() {
        for (Policy p: policies) {
            System.out.println(p.toString());
        }
    }
}
public class PolicyManagementSystem {
    public static void main(String[] args) {
        Policy p1=new Policy(1,"tarun","auto",5000);
        Policy p2=new Policy(2,"manoj","bike",8000);
        Policy p3=new Policy(3,"yash","car", 12000);

        PolicyManagement pm=new PolicyManagement();
        pm.addPolicy(p1);
        pm.addPolicy(p2);
        pm.addPolicy(p3);
        pm.display();

    }
}