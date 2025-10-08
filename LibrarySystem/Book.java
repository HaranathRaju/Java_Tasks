package LibrarySystem;

public class Book {
    private  String title;
    private String authorname;
    private boolean isissued;
    Book(String title,String authoname) {
        this.title=title;
        this.authorname=authoname;
        this.isissued=false;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthorname() {
        return authorname;
    }
    public boolean getIsissued() {
        return isissued;
    }

    public void issueBook() {
        if (!isissued) {
            isissued=true;
            System.out.println("book "+ getTitle() +" is issued");
        } else {
            System.out.println("book not found");
        }
    }
    public void returnBook() {
        if (isissued) {
            isissued=false;
            System.out.println("book: "+getTitle()+" is returned ");
        } else {
            System.out.println("book not found");
        }
    }

    public String toString() {
        return "title : "+title+" authorname: "+authorname+" issued status: "+isissued;
    }

}
