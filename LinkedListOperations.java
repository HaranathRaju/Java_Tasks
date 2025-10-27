class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head = null;

    public void insertend(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) { 
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public void reversemethod() {
        Node temp = head;
        Node prev = null;
        Node next = null;
        while (temp != null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head = prev;
    }

    public void search(int data) {
        Node temp=head;
        boolean found=false;
        int position=1;

        while (temp!=null) {
            if (temp.data==data) {
                System.out.println("element found at index : "+position);
                found=true;
                break;
            }
            temp=temp.next;
            position++;
        }
        if (!found) {
            System.out.println("element not found");
        }

    }

    public void sort() {
        if (head == null) return;

        for (Node i = head; i.next != null; i = i.next) {
            for (Node j = head; j.next != null; j = j.next) {
                if (j.data > j.next.data) {
                    int temp = j.data;
                    j.data = j.next.data;
                    j.next.data = temp;
                }
            }
        }
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertend(10);
        l.insertend(20);
        l.insertend(30);

        System.out.println("Original list:");
        l.display();

        l.search(30);
        l.sort();
   
    }
} 