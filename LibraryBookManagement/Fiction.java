package LibraryBookManagement;

public class Fiction extends Book {
    Fiction(String title) {
        super(title);
    }

    public void issueBook() {
        if (!getisissued()) {
            setisissued(true);
            System.out.println("book is issued : "+gettitle());
        } else {
            System.out.println("book is already issued");
        }
    }
    public void returnBook() {
        if (getisissued()) {
            setisissued(false);
            System.out.println("book returned : "+gettitle());
        } else {
            System.out.println("book is already returned");
        }
    }
    
}
