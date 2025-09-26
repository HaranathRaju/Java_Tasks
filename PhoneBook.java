import java.util.*;
public class PhoneBook {
    private TreeMap<String,String> contacts=new TreeMap<>();
    public void addcontact(String name,String number) {
        contacts.put(name,number);
        System.out.println("name: "+name+" number: "+number);
    }
    public void removecontact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("contact removed : "+name);
        }else {
            System.out.println("no contact available");
        }
    }
    public void searchcontact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println("found : "+contacts.get(name));
        } else {
            System.out.println("no contact found");
        }
    }
    public void display() {
        for (String i: contacts.keySet()) {
            System.out.println(i+" = "+contacts.get(i));
        }
    } 
    public static void main (String [] args) {
        PhoneBook pb=new PhoneBook();
        pb.addcontact("haranth","9876898765");
        pb.addcontact("tarun","7895678987");
        pb.addcontact("yashwanth","9856789865");
        pb.removecontact("yashwanth");
        pb.searchcontact("tarun");
        pb.display();
    }
}


