package LibraryBookManagement;

public abstract class Book {
    private String title;
    private boolean isissued;
    Book (String title) {
        this.title=title;
        this.isissued=false;
    }

    public String gettitle() {
        return title;
    }
    public boolean getisissued() {
        return isissued;
    }
    public void setisissued(boolean status) {
        isissued=status;
    }

    public abstract void issueBook();
    public abstract void returnBook();
}
