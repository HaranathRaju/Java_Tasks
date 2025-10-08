package LibrarySystem;


public class Main {
    public static void main(String[] args) {

        Book b1=new Book("java", "jhon");
        Book b2=new Book("python", "mark");
        Book b3=new Book("C++", "tyson");
        Book b4=new Book("html","carlo");
        Book b5=new Book("css", "mike");
        Library l=new Library(5);
        l.addBook(b1);
        l.addBook(b2);
        l.addBook(b3);
        l.addBook(b4);
        l.addBook(b5);

        l.issueBook(b2);
        l.issueBook(b4);

        l.returnBook(b4);

        l.displayBooks();
        
    
    }
}


    
