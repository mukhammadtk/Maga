package Pr8;

public class Librarian extends User implements iLibrarian, iAdministrator {
    private String book;

    public Librarian(String name , String book) {
        super(name);
        this.book = book;
    }


    @Override
    public void orderBook(Supplier supplier) {
        System.out.println("Библиотекарь " + getName() + " заказал у поставщика " + supplier.getName() + " книгу " + book );
    }

    @Override
    public void findBook() {
        System.out.println("Библиотекарь нашел книгу");
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Библиотекарь уведомил пользователя - " + getName());
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    @Override
    public void takeBook() {

    }

    @Override
    public void returnBook() {

    }

    @Override
    public void bringBook() {

    }
}
