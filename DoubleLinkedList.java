class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class LinkedList {
    Node head;
    public void insertbeg(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            newnode.next = temp;
            head = newnode;
            temp.prev = newnode;
        }
    }

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
            newnode.prev = temp;
        }
    }

    public void insertpos(int data, int pos) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else if (pos == 0) {
            Node temp = head;
            newnode.next = temp;
            head = newnode;
            temp.prev = newnode;
        } else {
            Node temp = head;
            Node current = head.next;
            for (int i = 0; i < pos; i++) {
                if (temp == null || current == null) {
                    System.out.println("out of bounds");
                    return;
                }
                temp = temp.next;
                current = current.next;
            }
            newnode.next = temp.next;
            newnode.prev = temp;
            temp.next = newnode;
            current.prev = newnode;
        }
    }

    public void deletebeg() {
        if (head == null) {
            System.out.println("linked list is empty");
        } else if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            head = temp.next;
            temp.next = null;
            head.prev = null;
        }
    }

    public void deleteend() {
        if (head == null) {
            System.out.println("linked list is empty");
        } else if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            Node prev = head.next;
            while (prev.next != null) {
                temp = temp.next;
                prev = prev.next;
            }
            temp.next.prev = null;
            temp.next = null;
        }
    }
    public void deletepos(int pos) {
        if (head == null) {
            System.out.println("linked list is empty");
        } else if (head.next == null) {
            head = null;
        } else if (pos == 0) {
            Node temp = head;
            head = temp.next;
            temp.next = null;
            head.prev = null;
        } else {
            Node temp = head;
            Node current = head.next;
            for (int i = 0; i < pos; i++) {
                if (current == null || temp == null) {
                    System.out.println("out of bounds");
                }
                temp = temp.next;
                current = current.next;
            }
            temp.next = current.next;
            current = temp;
            current.prev = null;
            current.next = null;
        }
    }
    public void display() {
        if (head == null) {
            System.out.println("linked list is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
        }
        System.out.println("null");
    }
}
public class DoubleLinkedList {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertend(10);
        l.insertend(20);
        l.insertbeg(5);
        l.insertpos(15, 2);
        l.deletepos(3);
        
        l.display();
    }

}
