package abstracts;

public abstract class ABook{
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract String bookTitle();

    public ABook(){
        this.title = "Undefined";
    }
    public ABook(String title){
        this.title = title;
    }

}
