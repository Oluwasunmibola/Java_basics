package Java_basics;

public class Book {

    private String title;
    private String author;
    private int pageCount;

    Book(String title, String author, Integer pageCount){
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public String toString(){
        return String.format("%s by %s", this.title, this.author);
    }
    
}
