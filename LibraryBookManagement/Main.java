package LibraryBookManagement;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Fiction("java");
        Book b2 = new Magazine("python");
        b1.issueBook();
        b1.returnBook();
        b2.issueBook();
        System.out.println("Book Status");

        System.out.println(b1.gettitle() + " : " + b1.getisissued());
        System.out.println(b2.gettitle() + " : " + b2.getisissued());

    }

}
