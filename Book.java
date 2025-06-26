public class Book {
    private Long id;
    private String title;
    private String author;
    private boolean isIssued;

    private Long idCounter = 101L;

    public Book(Long id, String title, String author, boolean isIssued){
        this.id = idCounter++;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public Long getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public boolean isIssued(){
        return isIssued;
    }

    public void issue(){
        this.isIssued = true;
    }

    public void returnBook(){
        this.isIssued = false;
    }

    @Override
    public String toString(){
        return title + "by" + author + (isIssued ? " [Issued]" : " [Available]");
    }
}