package biblary_system;

public class Test {
    public static void main(String[] args) {
        Book book1 = new Book("Mukhtar Auezov", "Abai Joly", 1);
        Book book2 = new Book("Abdijamil Nurpeisov" ,"Kan men Ter", 2);

        Student student1 = new Student(101, "Dias");
        Student student2 = new Student(102, "Alihan");

        Library library = new Library();

        student1.takeBook(book1);
        student1.takeBook(book2);
        library.lendBook(book1);
        student2.takeBook(book2);
        student1.returnBook();
        library.receiveBook();

        student1.showDetails();
        student2.showDetails();
    }
}
