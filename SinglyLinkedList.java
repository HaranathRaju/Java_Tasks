class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insertbeg(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    public void insertend(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newnode;
        }
    }

    public void insertpos(int data, int pos) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else if (pos == 0) {
            Node current = head;
            newnode.next = current;
            head = newnode;
        } else {
            Node current = head;
            Node prev = head.next;
            for (int i = 1; i < pos; i++) {
                if (current == null || prev == null) {
                    System.out.println("pos out of bounds");
                    return;
                }
                current = current.next;
                prev = prev.next;
            }
            current.next = newnode;
            newnode.next = prev;
        }
    }

    public void deletebeg() {
        if (head == null) {
            System.out.println("no element is in linkedlist");
        } else if (head.next == null) {
            head = null;
            System.out.println("linked list is empty");
        } else {
            Node current = head;
            head = current.next;
            current.next = null;
        }
    }

    public void deleteend() {
        if (head == null) {
            System.out.println("linked list is empty");
        } else if (head.next == null) {
            head = null;
            System.out.println("linked list is empty");
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    public void deletepos(int pos) {
        if (head == null) {
            System.out.println("linked list is empty");
        } else if (head.next == null) {
            head = null;
        } else if (pos == 0) {
            Node current = head;
            head = current.next;
            current.next = null;
        } else {
            Node current = head;
            Node prev = head.next;
            for (int i = 1; i < pos; i++) {
                if (current == null || prev == null) {
                    System.out.println("out of bounds");
                    return;
                }
                current = current.next;
                prev = prev.next;
            }
            current.next = prev.next;
            prev.next = null;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertbeg(10);
        l.insertend(20);
        l.insertend(30);
        l.insertpos(25, 2);
        l.deletepos(2);
        l.display();

    }
}