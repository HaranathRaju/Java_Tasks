package LibrarySystem;

public class Library {
    Book [] books;
    int count;
    Library(int capacity) {
        books=new Book[capacity];
        count=0;
    }

    public void addBook(Book b) {
        if (count<books.length) {
            books[count]=b;
            count++;
        } else {
            System.out.println("library is full");
        }
    }

    public void issueBook(Book b) {
        b.issueBook();
    }
    public void returnBook(Book b) {
        b.returnBook();
    }

    public void displayBooks() {
        for (Book b:books ) {
            System.out.println(b);
        }
    }
    
}
