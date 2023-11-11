package biblary_system;

public class Student {
    private int studentId;
    private String name;
    private Book takedBook;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.takedBook = null;
    }

    public void takeBook(Book book) {
        if (takedBook == null) {
            takedBook = book;
            System.out.println(name + " взял книгу: " + book.getBookId());
        } else {
            System.out.println(name + " уже брал книгу.");
        }
    }

    public void returnBook() {
        if (takedBook != null) {
            System.out.println(name + " возвращает книгу: " + takedBook.getBookId());
            takedBook = null;
        } else {
            System.out.println(name + " нету книг для возврата.");
        }
    }

    public void showDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Имя: " + name);
        if (takedBook != null) {
            System.out.println(" ID заимственнной книги : " + takedBook.getBookId());
        }
    }
}
