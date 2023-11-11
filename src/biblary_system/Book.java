package biblary_system;

public class Book {
    private String author;
    private String title;
    private int BookId;

    public Book(String author, String title, int bookId) {
        this.author = author;
        this.title = title;
        BookId = bookId;
    }

    public int getBookId() {
        return BookId;
    }
}
